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
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import modelo.Usuario;
import static practicaaddbbdd.PracticaAddBBDD.conectarMongo;
import static practicaaddbbdd.PracticaAddBBDD.usuarioLogeado;

/**
 *
 * @author Kaua
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Login() {
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
        jLabel2 = new javax.swing.JLabel();
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
        jbRegister = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpLogin.setBackground(new java.awt.Color(241, 241, 242));
        jpLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toLoginIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toLoginIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-in.png"))); // NOI18N
        toLoginIMG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toLoginIMGMouseClicked(evt);
            }
        });
        jpLogin.add(toLoginIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 50, 40));

        nameLoginLabel.setBackground(new java.awt.Color(25, 149, 173));
        nameLoginLabel.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        nameLoginLabel.setForeground(new java.awt.Color(25, 149, 173));
        nameLoginLabel.setText("Mail:");
        jpLogin.add(nameLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        userIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jpLogin.add(userIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 30, 30));

        mailLogin.setBackground(new java.awt.Color(188, 186, 190));
        mailLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mailLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        mailLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailLoginMouseClicked(evt);
            }
        });
        jpLogin.add(mailLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 190, 30));

        jLabel13.setBackground(new java.awt.Color(25, 149, 173));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heather linea.png"))); // NOI18N
        jLabel13.setToolTipText("");
        jpLogin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 260, 20));

        passwordLoginLabel.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        passwordLoginLabel.setForeground(new java.awt.Color(25, 149, 173));
        passwordLoginLabel.setText("Password:");
        jpLogin.add(passwordLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        keyIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keyIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png"))); // NOI18N
        jpLogin.add(keyIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 30, 30));

        passwordLogin.setBackground(new java.awt.Color(188, 186, 190));
        passwordLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passwordLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        passwordLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordLoginMouseClicked(evt);
            }
        });
        jpLogin.add(passwordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 190, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_User_Male_50px.png"))); // NOI18N
        jpLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, 70));

        jLabel2.setBackground(new java.awt.Color(25, 149, 173));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 149, 173));
        jLabel2.setText("Registrar ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jpLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, 20));

        getContentPane().add(jpLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 390));

        jpRegistro.setBackground(new java.awt.Color(241, 241, 242));
        jpRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addUserIMG.setBackground(new java.awt.Color(215, 219, 221));
        addUserIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addUserIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Registration_50px.png"))); // NOI18N
        jpRegistro.add(addUserIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 50, 50));

        nameLabel.setBackground(new java.awt.Color(25, 149, 173));
        nameLabel.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(25, 149, 173));
        nameLabel.setText("Nombre:");
        nameLabel.setFocusable(false);
        jpRegistro.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, 20));

        name.setBackground(new java.awt.Color(188, 186, 190));
        name.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(25, 150, 226));
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jpRegistro.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, 30));

        mailLabel.setBackground(new java.awt.Color(25, 149, 173));
        mailLabel.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(25, 149, 173));
        mailLabel.setText("Mail:");
        jpRegistro.add(mailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 20));

        mail.setBackground(new java.awt.Color(188, 186, 190));
        mail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mail.setForeground(new java.awt.Color(25, 150, 226));
        mail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailMouseClicked(evt);
            }
        });
        jpRegistro.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 180, 30));

        passwordLabel.setBackground(new java.awt.Color(25, 149, 173));
        passwordLabel.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(25, 149, 173));
        passwordLabel.setText("Password:");
        jpRegistro.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        password.setBackground(new java.awt.Color(188, 186, 190));
        password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(25, 150, 226));
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jpRegistro.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 180, 30));

        verificarLabel.setBackground(new java.awt.Color(25, 149, 173));
        verificarLabel.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        verificarLabel.setForeground(new java.awt.Color(25, 149, 173));
        verificarLabel.setText("Verificar password:");
        jpRegistro.add(verificarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        verify1.setBackground(new java.awt.Color(188, 186, 190));
        verify1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        verify1.setForeground(new java.awt.Color(25, 150, 226));
        verify1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 186, 190)));
        verify1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verify1MouseClicked(evt);
            }
        });
        jpRegistro.add(verify1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 180, 30));

        jbRegister.setBackground(new java.awt.Color(161, 214, 226));
        jbRegister.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbRegister.setForeground(new java.awt.Color(25, 149, 173));
        jbRegister.setText("Registrar");
        jbRegister.setBorder(null);
        jbRegister.setBorderPainted(false);
        jbRegister.setFocusPainted(false);
        jbRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisterActionPerformed(evt);
            }
        });
        jpRegistro.add(jbRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 120, 30));

        jButton2.setBackground(new java.awt.Color(161, 214, 226));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(25, 149, 173));
        jButton2.setText("Logear");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpRegistro.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 120, 30));

        getContentPane().add(jpRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void toLoginIMGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginIMGMouseClicked
        char[] arrayC = passwordLogin.getPassword();
        String pass = new String(arrayC);
        if (mailLogin.getText() == "" || pass.isEmpty()) {
            showErrorMessage("Debes introducir valores");
            mailLogin.setBorder(BorderFactory.createLineBorder(Color.red));
            passwordLogin.setBorder(BorderFactory.createLineBorder(Color.red));
        } else if (MailDAO.validarUser(mailLogin.getText(), pass)) {
            usuarioLogeado = mailLogin.getText();
            this.setVisible(false);
            Inicio m = new Inicio();
            m.setLocationRelativeTo(null);
            m.setVisible(true);
        } else {
            passwordLogin.setText("");
            passwordLogin.setBorder(BorderFactory.createLineBorder(Color.red));
            showErrorMessage("Mail o password incorrecto");
        }
    }//GEN-LAST:event_toLoginIMGMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jpLogin.setVisible(false);
        jpRegistro.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisterActionPerformed
        char[] arrayC = password.getPassword();
        String pass = new String(arrayC);
        arrayC = verify1.getPassword();
        String veriPass = new String(arrayC);
        if (mail.getText().equals("") || pass.isEmpty() || name.getText().equals("") || veriPass.isEmpty()) {
            mail.setBorder(BorderFactory.createLineBorder(Color.red));
            name.setBorder(BorderFactory.createLineBorder(Color.red));
            password.setBorder(BorderFactory.createLineBorder(Color.red));
            verify1.setBorder(BorderFactory.createLineBorder(Color.red));
            showErrorMessage("Debe introducir valores");
        } else if (!pass.equals(veriPass)) {
            showErrorMessage("Password no coincide");
            password.setBorder(BorderFactory.createLineBorder(Color.red));
            verify1.setBorder(BorderFactory.createLineBorder(Color.red));
            password.setText("");
            verify1.setText("");
        } else {
            try {
                MailDAO.insertUser(mail.getText(), pass, name.getText());
                jpLogin.setVisible(true);
                jpRegistro.setVisible(false);
            } catch (ExcepcionMail ex) {
                mail.setBorder(BorderFactory.createLineBorder(Color.red));
                password.setText("");
                verify1.setText("");
                showErrorMessage(ex.getMessage());
            }

        }
    }//GEN-LAST:event_jbRegisterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jpLogin.setVisible(true);
        jpRegistro.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailMouseClicked
        mail.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_mailMouseClicked

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
       name.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_nameMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_passwordMouseClicked

    private void verify1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verify1MouseClicked
       verify1.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_verify1MouseClicked

    private void mailLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailLoginMouseClicked
        mailLogin.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_mailLoginMouseClicked

    private void passwordLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLoginMouseClicked
        passwordLogin.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_passwordLoginMouseClicked

    
    public void showErrorMessage(String message) {
        ImageIcon icon = new ImageIcon("C:\\Users\\chen\\Google Drive\\DAM2\\Programacion\\Daniel\\PracticaAddBBDD\\src\\images\\icons8_Error_50px.png");
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.WARNING_MESSAGE, icon);
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addUserIMG;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbRegister;
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
    private javax.swing.JLabel toLoginIMG;
    private javax.swing.JLabel userIMG;
    private javax.swing.JLabel verificarLabel;
    private javax.swing.JPasswordField verify1;
    // End of variables declaration//GEN-END:variables
}
