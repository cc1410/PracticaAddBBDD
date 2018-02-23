/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
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
    
    public static MongoCollection conectarTabla(String nombreTabla) {
        MongoCollection<Document> tabla = conectarBBDD().getCollection(nombreTabla);
        return tabla;
    }
    
    public static void insertUser(String mail, String password, String nombre) {
        Document u = new Document("mail", mail)
                .append("password", password)
                .append("name", nombre)
                .append("type", 0);
        conectarTabla("user").insertOne(u);
    }
}
