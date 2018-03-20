/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author chen
 */
public class Mensaje {
    private String sender;
    private String receiver;
    private String date;
    private String read;
    private String subjet;
    private String body;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Mensaje() {
    }

    public Mensaje(String sender, String receiver,String subjet, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.subjet = subjet;
        this.body = body;
    }
    
    

    public Mensaje(String sender, String receiver, String date, String read, String subjet, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
        this.read = read;
        this.subjet = subjet;
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String isRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getSubjet() {
        return subjet;
    }

    public void setSubjet(String subjet) {
        this.subjet = subjet;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "sender=" + sender + ", receiver=" + receiver + ", date=" + date + ", read=" + read + ", subjet=" + subjet + ", body=" + body + '}';
    }
    
    
}
