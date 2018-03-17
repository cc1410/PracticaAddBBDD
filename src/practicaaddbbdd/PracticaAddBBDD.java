/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaaddbbdd;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import dao.MailDAO;
import static dao.MailDAO.conectar;
import static dao.MailDAO.conectarBBDD;
import excepciones.ExcepcionMail;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            try {
                MailDAO.insertUser("chen@chen.com", "stucom", "chenchen");
                System.out.println("Usuario insertado");
            } catch (ExcepcionMail ex) {
                System.out.println(ex.getMessage());
            }

            MongoCursor<Document> cursor = MailDAO.conectarTabla("user").find().iterator();
            try {
                while (cursor.hasNext()) {
                    //String[] split = cursor.next().toJson().split(","); 
                    System.out.println(cursor.next().toString());
                }
            } finally {
                cursor.close();
            } 
            if(MailDAO.validarUser("chen@chen.com", "stucom")){
                System.out.println("Login correcto");
            }
            
            if(MailDAO.validarUser("c@c.com", "stucom") == false){
                System.out.println("Login incorrecto");
            }

        } else {
            System.err.println("Error de conexión");
        }
    }

}
