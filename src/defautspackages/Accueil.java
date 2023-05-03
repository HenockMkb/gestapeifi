/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defautspackages;

import javax.swing.JOptionPane;

/**
 *
 * @author Henock Mkb
 */
public class Accueil extends javax.swing.JFrame {

    public Accueil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Texte1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        UserAdmin = new javax.swing.JTextField();
        UserMdp = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Container.setBackground(new java.awt.Color(0, 0, 160));

        Logo.setFont(new java.awt.Font("Segoe UI", 1, 136)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setText("eifi");
        Logo.setAlignmentY(0.0F);
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Texte1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        Texte1.setForeground(new java.awt.Color(255, 255, 255));
        Texte1.setText("Nom D'utilisateur");

        Text2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setText("Mot de Passe");

        LoginButton.setText("Connexion");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(Text2)
                        .addGap(42, 42, 42))
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(Texte1)
                        .addGap(24, 24, 24))
                    .addComponent(UserAdmin)
                    .addComponent(UserMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Texte1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

    String adminUser = "admin";
    String adminPassword = "admin";
    String inputUser = UserAdmin.getText();
    String inputPassword = String.valueOf(UserMdp.getPassword());
    
    if (inputUser.equals(adminUser) && inputPassword.equals(adminPassword)) {
        Dashboard dashboard = new Dashboard();
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Identifiant ou Mot de passe incorrect !");
    }
    
    }//GEN-LAST:event_LoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Accueil accueil = new Accueil();
            
                 accueil.setLocationRelativeTo(null); // Centrer la fenêtre  
                 accueil.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Texte1;
    private javax.swing.JTextField UserAdmin;
    private javax.swing.JPasswordField UserMdp;
    // End of variables declaration//GEN-END:variables
}
