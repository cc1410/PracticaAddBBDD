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
import excepciones.ExcepcionMail;
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

            //validando usuario
            if (MailDAO.validarUser("chen@chen.com", "stucom")) {
                System.out.println("Login correcto");
            }

            if (MailDAO.validarUser("c@c.com", "stucom") == false) {
                System.out.println("Login incorrecto");
            }

            //crea un nuevo usuario
            try {
                MailDAO.insertUser("juan@juan.com", "stucom", "juan");
                System.out.println("Usuario insertado");
            } catch (ExcepcionMail ex) {
                System.out.println(ex.getMessage());
            }

            //send mail
            try {
                MailDAO.sendMail("chen@chen.com", "juan@juan.com", "hola", "esto es una prueba");
                System.out.println("Mail enviado");
            } catch (ExcepcionMail ex) {
                System.out.println(ex.getMessage());
            }

            //listar mensajes de un usuario enviados
            MailDAO.listMAilSenderUser("chen@chen.com");

            //listar mensajes de un usuario recibidos
            MailDAO.listMAilReceiverUser("chen@chen.com");

            //update name
            MailDAO.updateName("juan", "juanuchi");
            //update  password
            MailDAO.updatePassword("juanuchi", "1234567");

            MailDAO.deleteMail("juan@juan.com", "chen@chen.com", "2018/03/17 18:40:24");
            
            cursor = MailDAO.conectarTabla("user").find().iterator();
            try {
                while (cursor.hasNext()) {
                    //String[] split = cursor.next().toJson().split(","); 
                    System.out.println(cursor.next().toString());
                }
            } finally {
                cursor.close();
            }

        } else {
            System.err.println("Error de conexión");
        }
    }

}
