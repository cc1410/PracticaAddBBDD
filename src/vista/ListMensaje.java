/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.MailDAO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Mensaje;
import static practicaaddbbdd.PracticaAddBBDD.usuarioLogeado;

/**
 *
 * @author chen
 */
public class ListMensaje extends javax.swing.JDialog {

    private List<Mensaje> mensajes;

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    private List<Mensaje> mensajeRecibido;

    public List<Mensaje> getMensajeRecibido() {
        return mensajeRecibido;
    }

    public void setMensajeRecibido(List<Mensaje> mensajeRecibido) {
        this.mensajeRecibido = mensajeRecibido;
    }

    boolean sender = false;

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form ListMensaje
     */
    public ListMensaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        System.out.println(usuarioLogeado);
        //jTable3.setVisible(false);

        mensajeRecibido = MailDAO.listMAilReceiverUser(usuarioLogeado);

        mensajes = MailDAO.listMAilSenderUser(usuarioLogeado);

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jbRecibido = new javax.swing.JButton();
        jbEnviado = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbRecibido.setText("Mensaje recibido");
        jbRecibido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRecibidoActionPerformed(evt);
            }
        });
        getContentPane().add(jbRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jbEnviado.setText("Mensaje enviado");
        jbEnviado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviadoActionPerformed(evt);
            }
        });
        getContentPane().add(jbEnviado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${mensajes}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable3);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sender}"));
        columnBinding.setColumnName("Sender");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${subjet}"));
        columnBinding.setColumnName("Subjet");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${date}"));
        columnBinding.setColumnName("Date");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 850, 350));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRecibidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRecibidoActionPerformed
 
        jTable3.setVisible(false);
    }//GEN-LAST:event_jbRecibidoActionPerformed

    private void jbEnviadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviadoActionPerformed
     
        jTable3.setVisible(true);
    }//GEN-LAST:event_jbEnviadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListMensaje dialog = new ListMensaje(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton jbEnviado;
    private javax.swing.JButton jbRecibido;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
