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
    private LocalDate date;
    private boolean read;
    private String subjet;
    private String body;

    public Mensaje() {
    }

    public Mensaje(String sender, String receiver,String subjet, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.subjet = subjet;
        this.body = body;
    }
    
    

    public Mensaje(String sender, String receiver, LocalDate date, boolean read, String subjet, String body) {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
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
    
    
}
