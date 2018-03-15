/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import excepciones.ExcepcionMail;
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
        Document findQuery = new Document("mail", new Document("$eq", "chen@chen.com"));
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
}
