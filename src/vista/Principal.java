/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.MailDAO;
import excepciones.ExcepcionMail;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import static practicaaddbbdd.PracticaAddBBDD.conectarMongo;

/**
 *
 * @author Kaua
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        conectarMongo();
        jpRegistro.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpRegistro = new javax.swing.JPanel();
        addUserIMG = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        mailLabel = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        verificarLabel = new javax.swing.JLabel();
        verify1 = new javax.swing.JPasswordField();
        registerIMG = new javax.swing.JLabel();
        jpLogin = new javax.swing.JPanel();
        toLoginIMG = new javax.swing.JLabel();
        nameLoginLabel = new javax.swing.JLabel();
        userIMG = new javax.swing.JLabel();
        mailLogin = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        passwordLoginLabel = new javax.swing.JLabel();
        keyIMG = new javax.swing.JLabel();
        passwordLogin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpRegistro.setBackground(new java.awt.Color(161, 214, 226));
        jpRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addUserIMG.setBackground(new java.awt.Color(215, 219, 221));
        addUserIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addUserIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-user.png"))); // NOI18N
        jpRegistro.add(addUserIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 100, 100));

        nameLabel.setBackground(new java.awt.Color(25, 149, 173));
        nameLabel.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(25, 149, 173));
        nameLabel.setText("Nombre:");
        nameLabel.setFocusable(false);
        jpRegistro.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 120, 20));

        name.setBackground(new java.awt.Color(188, 186, 190));
        name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(25, 150, 226));
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jpRegistro.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 190, 40));

        mailLabel.setBackground(new java.awt.Color(25, 149, 173));
        mailLabel.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(25, 149, 173));
        mailLabel.setText("Mail:");
        jpRegistro.add(mailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 20));

        mail.setBackground(new java.awt.Color(188, 186, 190));
        mail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mail.setForeground(new java.awt.Color(25, 150, 226));
        mail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        jpRegistro.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 190, 40));

        passwordLabel.setBackground(new java.awt.Color(25, 149, 173));
        passwordLabel.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(25, 149, 173));
        passwordLabel.setText("Password:");
        jpRegistro.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, 20));

        password.setBackground(new java.awt.Color(188, 186, 190));
        password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(25, 150, 226));
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        jpRegistro.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 190, 40));

        verificarLabel.setBackground(new java.awt.Color(25, 149, 173));
        verificarLabel.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        verificarLabel.setForeground(new java.awt.Color(25, 149, 173));
        verificarLabel.setText("Verificar password:");
        jpRegistro.add(verificarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, 20));

        verify1.setBackground(new java.awt.Color(188, 186, 190));
        verify1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        verify1.setForeground(new java.awt.Color(25, 150, 226));
        verify1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        jpRegistro.add(verify1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 190, 40));

        registerIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tick-inside-circle.png"))); // NOI18N
        registerIMG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerIMGMouseClicked(evt);
            }
        });
        jpRegistro.add(registerIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 70, 70));

        getContentPane().add(jpRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 500));

        jpLogin.setBackground(new java.awt.Color(161, 214, 226));
        jpLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toLoginIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toLoginIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-in.png"))); // NOI18N
        toLoginIMG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toLoginIMGMouseClicked(evt);
            }
        });
        jpLogin.add(toLoginIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 70, 60));

        nameLoginLabel.setBackground(new java.awt.Color(25, 149, 173));
        nameLoginLabel.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        nameLoginLabel.setForeground(new java.awt.Color(25, 149, 173));
        nameLoginLabel.setText("Mail:");
        jpLogin.add(nameLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        userIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jpLogin.add(userIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 30, 30));

        mailLogin.setBackground(new java.awt.Color(188, 186, 190));
        mailLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mailLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        jpLogin.add(mailLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 190, 30));

        jLabel13.setBackground(new java.awt.Color(25, 149, 173));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heather linea.png"))); // NOI18N
        jLabel13.setToolTipText("");
        jpLogin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 260, 20));

        passwordLoginLabel.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        passwordLoginLabel.setForeground(new java.awt.Color(25, 149, 173));
        passwordLoginLabel.setText("Password:");
        jpLogin.add(passwordLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        keyIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keyIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png"))); // NOI18N
        jpLogin.add(keyIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 30, 30));

        passwordLogin.setBackground(new java.awt.Color(188, 186, 190));
        passwordLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passwordLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        jpLogin.add(passwordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 190, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avatar.png"))); // NOI18N
        jpLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 70, 70));

        getContentPane().add(jpLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 350, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void toLoginIMGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginIMGMouseClicked
        // TODO add your handling code here:
//        int posicion = this.jpLogin.getX();
//        System.out.println(posicion);
//        if (posicion > -1) {
//            Animacion.Animacion.mover_izquierda(0, -280, 3, 3, jpLogin);
//        } else {
//            Animacion.Animacion.mover_derecha(-279, 0, 3, 3, jpLogin);
//        }
//        
        char[] arrayC = passwordLogin.getPassword();
        String pass = new String(arrayC);
        if (MailDAO.validarUser(mailLogin.getText(), pass)) {
            Menu m = new Menu(this, true);
            m.setLocationRelativeTo(null);
            m.setVisible(true);
        } else {
            System.out.println("Password o mail incorrecto");
        }
//        jpLogin.setVisible(false);
//        jpRegistro.setVisible(true);
    }//GEN-LAST:event_toLoginIMGMouseClicked

    private void registerIMGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerIMGMouseClicked

//        try {
//            char[] arrayC = password.getPassword();
//            String pass = new String(arrayC);
//            MailDAO.insertUser(mail.getText(), pass, name.getText());
//            System.out.println("Usuario insertado");
//        } catch (ExcepcionMail ex) {
//            System.out.println("No ha insertado bien");
//        }
        jpLogin.setVisible(true);
        jpRegistro.setVisible(false);


    }//GEN-LAST:event_registerIMGMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addUserIMG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JLabel keyIMG;
    private javax.swing.JTextField mail;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField mailLogin;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLoginLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordLogin;
    private javax.swing.JLabel passwordLoginLabel;
    private javax.swing.JLabel registerIMG;
    private javax.swing.JLabel toLoginIMG;
    private javax.swing.JLabel userIMG;
    private javax.swing.JLabel verificarLabel;
    private javax.swing.JPasswordField verify1;
    // End of variables declaration//GEN-END:variables
}
