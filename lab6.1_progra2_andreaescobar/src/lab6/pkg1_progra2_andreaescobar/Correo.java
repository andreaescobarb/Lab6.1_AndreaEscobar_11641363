/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg1_progra2_andreaescobar;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Correo extends javax.swing.JFrame {

    /**
     * Creates new form Correo
     */
    public Correo() {
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

        jdregistrarse = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbregistrarpersona = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tfnombre = new javax.swing.JTextField();
        tfapellido = new javax.swing.JTextField();
        tfcorreo = new javax.swing.JTextField();
        tfpais = new javax.swing.JTextField();
        jdfechanacimiento = new com.toedter.calendar.JDateChooser();
        tftelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pfpassword = new javax.swing.JPasswordField();
        pfconfirmarpasss = new javax.swing.JPasswordField();
        jdlogin = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jblogin = new javax.swing.JButton();
        jbregistrarse = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Registro");

        jLabel5.setText("Nombre");

        jLabel6.setText("Apellido");

        jLabel7.setText("Correo");

        jLabel8.setText("Fecha de Nacimiento");

        jLabel9.setText("País");

        jLabel10.setText("Contraseña");

        jLabel11.setText("Teléfono");

        jbregistrarpersona.setText("Registrarse");
        jbregistrarpersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbregistrarpersonaMouseClicked(evt);
            }
        });

        jLabel12.setText("Confirmar Contraseña");

        tfnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnombreActionPerformed(evt);
            }
        });

        tfapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfapellidoActionPerformed(evt);
            }
        });

        jLabel14.setText("@unitec.edu");

        javax.swing.GroupLayout jdregistrarseLayout = new javax.swing.GroupLayout(jdregistrarse.getContentPane());
        jdregistrarse.getContentPane().setLayout(jdregistrarseLayout);
        jdregistrarseLayout.setHorizontalGroup(
            jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdregistrarseLayout.createSequentialGroup()
                .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdregistrarseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jdregistrarseLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(95, 95, 95)
                        .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbregistrarpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnombre)
                            .addComponent(tfapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tfcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tfpais, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jdfechanacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tftelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(pfpassword)
                            .addComponent(pfconfirmarpasss))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jdregistrarseLayout.setVerticalGroup(
            jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdregistrarseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jdregistrarseLayout.createSequentialGroup()
                        .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(tfcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(jdfechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pfpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jdregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdregistrarseLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jbregistrarpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jdregistrarseLayout.createSequentialGroup()
                        .addComponent(pfconfirmarpasss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jdloginLayout = new javax.swing.GroupLayout(jdlogin.getContentPane());
        jdlogin.getContentPane().setLayout(jdloginLayout);
        jdloginLayout.setHorizontalGroup(
            jdloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jdloginLayout.setVerticalGroup(
            jdloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Inicio");

        jLabel2.setText("Ya tienes una cuenta?");

        jLabel3.setText("No tienes una cuenta? Regístrate");

        jblogin.setText("Log in");
        jblogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbloginActionPerformed(evt);
            }
        });

        jbregistrarse.setText("Registrarse");
        jbregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jblogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbregistrarse)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblogin)
                    .addComponent(jbregistrarse))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbloginActionPerformed
        // TODO add your handling code here:
        System.out.println("HOla");
    }//GEN-LAST:event_jbloginActionPerformed

    private void tfnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnombreActionPerformed

    private void tfapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfapellidoActionPerformed

    private void jbregistrarpersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbregistrarpersonaMouseClicked
        // TODO add your handling code here:
        AdministradorCorreos admin = new AdministradorCorreos("./salida.txt");
        String nombre, apellido, passcode, confirmpasscode, pais, correo;
        Date fechanacimiento;
        int tel;

        boolean confirmarcorreo = false;
        try {
            nombre = tfnombre.getText();
            apellido = tfapellido.getText();
            correo = tfcorreo.getText();
            fechanacimiento = jdfechanacimiento.getDate();
            pais = tfpais.getText();
            tel = Integer.parseInt(tftelefono.getText());
            confirmpasscode = pfconfirmarpasss.getText();
            passcode = pfpassword.getText();
           

            if (confirmpasscode.equals(passcode)) {
                System.out.println("entre");
                System.out.println("size: " + admin.getPersonas().size());
                admin.cargarArchivo();
                for (Personas persona : admin.getPersonas()) {
                    if (persona.getCorreo().equals(correo)) {
                        confirmarcorreo = true;
                    }
                }
                if (confirmarcorreo == false) {
                    admin.cargarArchivo();
                    admin.getPersonas().add(new Personas(nombre, apellido, correo + "@unitec.edu", fechanacimiento, pais, tel, passcode));
                    admin.escribirArchivo();
                    
                    tfnombre.setText("");
                    tfapellido.setText("");
                    tfcorreo.setText("");
                    jdfechanacimiento.setDate(null);
                    tfpais.setText("");
                    tftelefono.setText("");
                    pfpassword.setText("");
                    pfconfirmarpasss.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Lo sentimos! Este correo ya existe. Intenta de nuevo");
                    tfcorreo.setText("");
                }
            } else{
                JOptionPane.showMessageDialog(this, "Lo sentimos, las dos contraseñas no son iguales"+"\n"+"Intenta de nuevo");
                pfconfirmarpasss.setText("");
                pfpassword.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lo siento elementos no validos");
        }


    }//GEN-LAST:event_jbregistrarpersonaMouseClicked

    private void jbregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrarseActionPerformed
        // TODO add your handling code here:
        jdregistrarse.pack();
        jdregistrarse.setModal(true);
        jdregistrarse.setVisible(true);
        jdregistrarse.setLocationRelativeTo(this);
    }//GEN-LAST:event_jbregistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Correo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jblogin;
    private javax.swing.JButton jbregistrarpersona;
    private javax.swing.JButton jbregistrarse;
    private com.toedter.calendar.JDateChooser jdfechanacimiento;
    private javax.swing.JDialog jdlogin;
    private javax.swing.JDialog jdregistrarse;
    private javax.swing.JPasswordField pfconfirmarpasss;
    private javax.swing.JPasswordField pfpassword;
    private javax.swing.JTextField tfapellido;
    private javax.swing.JTextField tfcorreo;
    private javax.swing.JTextField tfnombre;
    private javax.swing.JTextField tfpais;
    private javax.swing.JTextField tftelefono;
    // End of variables declaration//GEN-END:variables
}
