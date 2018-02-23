/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaaddbbdd;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import dao.MailDAO;
import org.bson.Document;

/**
 *
 * @author chen
 */
public class PracticaAddBBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Prueba conexion MongoDB");
        MongoClient mongo = MailDAO.conectar();
        if (mongo != null) {
            System.out.println("Establecida la conexión.");
            MongoDatabase db = MailDAO.conectarBBDD();
            System.out.println("Prueba insertar un usuario");
         //  MailDAO.insertUser("chen@chen.com", "stucom", "chenchen");
           // System.out.println("Usuario insertado");
            MongoCursor<Document> cursor = MailDAO.conectarTabla("user").find().iterator();
            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toJson());
                }
            } finally {
                cursor.close();
            }
        } else {
            System.err.println("Error de conexión");
        }

    }

}
