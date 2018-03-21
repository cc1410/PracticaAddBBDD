/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import excepciones.ExcepcionMail;
import java.awt.List;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Mensaje;
import org.bson.Document;

/**
 *
 * @author chen
 */
public class MailDAO {

    public static MongoClient conectar() {
        MongoClient mongo = new MongoClient("localhost", 27017);
        return mongo;
    }

    public static MongoDatabase conectarBBDD() {
        MongoDatabase db = conectar().getDatabase("msg");
        return db;
    }

    public static MongoCollection<Document> conectarTabla(String nombreTabla) {
        MongoCollection<Document> tabla = conectarBBDD().getCollection(nombreTabla);
        return tabla;
    }

    public static void insertUser(String mail, String password, String nombre) throws ExcepcionMail {
        if (existMail(mail)) {
            throw new ExcepcionMail("Ya existe este mail");
        }
        Document u = new Document("mail", mail)
                .append("password", password)
                .append("name", nombre)
                .append("type", 0);
        conectarTabla("user").insertOne(u);
    }

    public static boolean existMail(String mail) {
        Document findQuery = new Document("mail", new Document("$eq", mail));
        MongoCursor<Document> cursor = conectarTabla("user").find(findQuery).iterator();
        boolean exist = false;
        if (cursor.hasNext()) {
            exist = true;
        }
        return exist;
    }

    public static boolean validarUser(String mail, String password) {
        Document findQuery = new Document();
        findQuery.append("mail", mail).append("password", password);
        MongoCursor<Document> cursor = conectarTabla("user").find(findQuery).iterator();
        boolean exist = false;
        if (cursor.hasNext()) {
            exist = true;
        }
        return exist;
    }

    public static void sendMail(String mailFrom, String mailTo, String subjet, String body) throws ExcepcionMail {
        if (existMail(mailTo) == false) {
            throw new ExcepcionMail("No existe este mail");
        }
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        Document m = new Document("sender", mailFrom)
                .append("receiver", mailTo)
                .append("subjet", subjet)
                .append("date", timeStamp)
                .append("read", "false")
                .append("body", body);
        conectarTabla("message").insertOne(m);

    }

    public static ArrayList<Mensaje> listMAilReceiverUser(String mail) {
        Document findQuery = new Document("receiver", new Document("$eq", mail));
        ArrayList<Mensaje> mensaje = new ArrayList<>();
        try (MongoCursor<Document> cursor = conectarTabla("message").find(findQuery).iterator()) {

            while (cursor.hasNext()) {
                String json = cursor.next().toJson();
                Gson gson = new Gson();
                Mensaje m = gson.fromJson(json, Mensaje.class);
                mensaje.add(m);
            }
        }
        return mensaje;
    }

    public static ArrayList<Mensaje> listMAilSenderUser(String mail) {
        Document findQuery = new Document("sender", new Document("$eq", mail));
        ArrayList<Mensaje> mensaje = new ArrayList<>();
        try (MongoCursor<Document> cursor = conectarTabla("message").find(findQuery).iterator()) {
            while (cursor.hasNext()) {
                String json = cursor.next().toJson();
                Gson gson = new Gson();
                Mensaje m = gson.fromJson(json, Mensaje.class);
                mensaje.add(m);
            }
        }
        return mensaje;
    }

    //update
    public static void updateName(String name, String nameChange) {
        conectarTabla("user").updateOne(Filters.eq("name", name), Updates.set("name", nameChange));

    }

    public static void updatePassword(String name, String newpassword) {
        conectarTabla("user").updateOne(Filters.eq("name", name), Updates.set("password", newpassword));
    }

    public static void deleteMail(String receiver, String sender, String dateTime) {
        Document findQuery = new Document();
        findQuery.append("receiver", receiver).append("sender", sender).append("date", dateTime);
        MongoCursor<Document> cursor = conectarTabla("message").find(findQuery).iterator();
        if (cursor.hasNext()) {
            conectarTabla("message").deleteOne(findQuery);
            System.out.println("Message Eliminado");
        }
    }

    public static void changeNoReadToRead(String sender, String receiver, String dateTime) {
        conectarTabla("message").updateOne(Filters.and(eq("sender", sender), eq("receiver", receiver), eq("date", dateTime)),
                    Updates.set("read", "true"));
    }
    //borrar mail
    //buscar mail por subjet
    //cambiar mail no leido por leido
}
