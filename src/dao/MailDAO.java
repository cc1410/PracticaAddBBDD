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
import modelo.ListaMensaje;
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

    public static void sendMail(Mensaje msg) throws ExcepcionMail {
        if (existMail(msg.getReceiver()) == false) {
            throw new ExcepcionMail("No existe este mail");
        }
        
        Document m = new Document("sender", msg.getSender())
                .append("receiver", msg.getReceiver())
                .append("subjet", msg.getSubjet())
                .append("date", msg.getDate())
                .append("read", msg.getRead())
                .append("body", msg.getBody());
        conectarTabla("message").insertOne(m);

    }

    public static ListaMensaje listMAilReceiverUser(String mail) {
        Document findQuery = new Document("receiver", new Document("$eq", mail));
        ListaMensaje mensaje = new ListaMensaje();
        try (MongoCursor<Document> cursor = conectarTabla("message").find(findQuery).iterator()) {
            while (cursor.hasNext()) {
                String json = cursor.next().toJson();
                Gson gson = new Gson();
                Mensaje m = gson.fromJson(json, Mensaje.class);
                mensaje.getLista().add(m);
            }
        }
        return mensaje;
    }

    public static ListaMensaje listMAilSenderUser(String mail) {
        Document findQuery = new Document("sender", new Document("$eq", mail));
        ListaMensaje mensaje = new ListaMensaje();
        try (MongoCursor<Document> cursor = conectarTabla("message").find(findQuery).iterator()) {
            while (cursor.hasNext()) {
                String json = cursor.next().toJson();
                Gson gson = new Gson();
                Mensaje m = gson.fromJson(json, Mensaje.class);
                mensaje.getLista().add(m);
            }
        }
        return mensaje;
    }


    public static void deleteMail(Mensaje m) {
        Document findQuery = new Document();
        findQuery.append("receiver", m.getReceiver()).append("sender", m.getSender()).append("date", m.getDate());
        MongoCursor<Document> cursor = conectarTabla("message").find(findQuery).iterator();
        if (cursor.hasNext()) {
            conectarTabla("message").deleteOne(findQuery);
        }
    }

    public static void changeNoReadToRead(String sender, String receiver, String dateTime) {
        conectarTabla("message").updateOne(Filters.and(eq("sender", sender), eq("receiver", receiver), eq("date", dateTime)),
                Updates.set("read", "true"));
    }
  
}
