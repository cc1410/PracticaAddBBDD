/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

/**
 *
 * @author chen
 */
public class ListaMensaje {

    private ObservableList<Mensaje> lista;

    public ListaMensaje() {
        lista = ObservableCollections.observableList(new ArrayList<Mensaje>());
    }
    public static final String PROP_LISTA = "lista";
    public ObservableList<Mensaje> getLista() {
        return lista;
    }
    public void setLista(ObservableList<Mensaje> lista) {
        ObservableList oldLista = this.lista;
        this.lista = lista;
        propertyChangeSupport.firePropertyChange(PROP_LISTA, oldLista, lista);
        
    }
    
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
