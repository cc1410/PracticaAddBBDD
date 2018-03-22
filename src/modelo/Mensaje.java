/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

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

    
    public Mensaje() {
    }

    public Mensaje(String sender, String receiver, String subjet, String body) {
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
    
    public static final String PROP_ID = "id";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }


    public static final String PROP_BODY = "body";

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        String oldBody = this.body;
        this.body = body;
        propertyChangeSupport.firePropertyChange(PROP_BODY, oldBody, body);
    }


    public static final String PROP_SUBJECT = "subject";

    public String getSubjet() {
        return subjet;
    }

    public void setSubjet(String subject) {
        String oldSubject = this.subjet;
        this.subjet = subject;
        propertyChangeSupport.firePropertyChange(PROP_SUBJECT, oldSubject, subject);
    }


    public static final String PROP_READ = "read";

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        String oldRead = this.read;
        this.read = read;
        propertyChangeSupport.firePropertyChange(PROP_READ, oldRead, read);
    }

    public static final String PROP_DATE = "date";

    
    public String getDate() {
        return date;
    }

   
    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        propertyChangeSupport.firePropertyChange(PROP_DATE, oldDate, date);
    }

    public static final String PROP_RECEIVER = "receiver";

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        String oldReceiver = this.receiver;
        this.receiver = receiver;
        propertyChangeSupport.firePropertyChange(PROP_RECEIVER, oldReceiver, receiver);
    }


    public static final String PROP_SENDER = "sender";

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        String oldSender = this.sender;
        this.sender = sender;
        propertyChangeSupport.firePropertyChange(PROP_SENDER, oldSender, sender);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    

    @Override
    public String toString() {
        return "Mensaje{" + "sender=" + sender + ", receiver=" + receiver + ", date=" + date + ", read=" + read + ", subjet=" + subjet + ", body=" + body + '}';
    }

}
