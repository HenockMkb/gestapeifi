/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defautspackages;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Henock Mkb
 */
public final class Dashboard extends javax.swing.JFrame {
    
    private final String url = "jdbc:mysql://localhost/eifi"; // URL de la base de données
    private final String user = "root"; // Nom d'utilisateur
    private final String password = ""; // Mot de passe (vide dans ce cas)

    /**
     * Creates new form Accueil
     */
    public Dashboard() {
        initComponents();
        showStudents();
    }
   public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
   
     public void showStudents() {
        String query = "SELECT * FROM gestap";
        try (Connection con = getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            // Création d'un modèle de table par défaut
            DefaultTableModel model = new DefaultTableModel();
            Object[] columns = {"Matricule", "Nom", "PostNom", "Prenom", "Facultes", "Promotion", "Adresse", "Numero"};
            model.setColumnIdentifiers(columns);
            this.ListeEtudiants.setModel(model);
            
            // Remplissage du modèle de table avec les données de la base de données
            while (rs.next()) {
                Object[] row = new Object[8];
                row[0] = rs.getInt("Matricule");
                row[1] = rs.getString("Nom");
                row[2] = rs.getString("PostNom");
                row[3] = rs.getString("Prenom");
                row[4] = rs.getString("Facultes");
                row[5] = rs.getString("Promotion");
                row[6] = rs.getString("Adresse");
                row[7] = rs.getString("Numero");
                model.addRow(row);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        List = new javax.swing.JButton();
        Reload = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Changement = new javax.swing.JButton();
        Deconexion = new javax.swing.JButton();
        Suppression = new javax.swing.JButton();
        SousContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeEtudiants = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        etudiant = new javax.swing.JTextField();
        EditTextUser = new javax.swing.JLabel();
        etudiantfind = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Container.setBackground(new java.awt.Color(0, 0, 160));

        List.setText("Liste Des Etudiants");
        List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListActionPerformed(evt);
            }
        });

        Reload.setText("Recharger");
        Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadActionPerformed(evt);
            }
        });

        Add.setText("Ajouter");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Changement.setText("Mettre À Jour");
        Changement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangementActionPerformed(evt);
            }
        });

        Deconexion.setBackground(new java.awt.Color(255, 51, 51));
        Deconexion.setForeground(new java.awt.Color(255, 255, 255));
        Deconexion.setText("Deconnexion");
        Deconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconexionActionPerformed(evt);
            }
        });

        Suppression.setText("Supprimer");
        Suppression.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppressionActionPerformed(evt);
            }
        });

        SousContainer.setBackground(new java.awt.Color(255, 255, 255));

        ListeEtudiants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricule", "Nom", "PostNom", "Prenom", "Faculté", "Promotion", "Adresse", "Numero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ListeEtudiants);

        jPanel1.setBackground(new java.awt.Color(0, 0, 160));

        search.setText("Rechercher");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        etudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etudiantActionPerformed(evt);
            }
        });

        EditTextUser.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        EditTextUser.setForeground(new java.awt.Color(255, 255, 255));
        EditTextUser.setText("Nom D'utilisateur");

        etudiantfind.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        etudiantfind.setForeground(new java.awt.Color(255, 255, 255));
        etudiantfind.setText("Trouver un etudiant :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etudiantfind, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(265, 265, 265)
                    .addComponent(EditTextUser)
                    .addContainerGap(265, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(etudiantfind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(EditTextUser)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout SousContainerLayout = new javax.swing.GroupLayout(SousContainer);
        SousContainer.setLayout(SousContainerLayout);
        SousContainerLayout.setHorizontalGroup(
            SousContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SousContainerLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SousContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SousContainerLayout.setVerticalGroup(
            SousContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SousContainerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Logo.setFont(new java.awt.Font("Segoe UI", 1, 136)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setText("eifi");
        Logo.setAlignmentY(0.0F);
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Suppression, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Deconexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Changement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(List, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(SousContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Changement, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Suppression, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Reload, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(Deconexion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addComponent(SousContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadActionPerformed
    // Récupération du texte saisi dans le JTextField
    String searchText = ""; // Récupération du texte saisi dans le JTextField
    DefaultTableModel model = (DefaultTableModel) ListeEtudiants.getModel(); // Récupération du modèle de la JTable
    
    // Création d'un RowFilter pour filtrer le modèle de la JTable en fonction du texte saisi
    RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter("(?i)" + searchText); // Ignorer la casse du texte
    
    // Application du RowFilter au sorter de la JTable
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    sorter.setRowFilter(rf);
    ListeEtudiants.setRowSorter(sorter);        // TODO add your handling code here:
    }//GEN-LAST:event_ReloadActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        Ajout ajout = new Ajout();
        ajout.setLocationRelativeTo(null);
        ajout.setVisible(true);
                                      
        this.dispose(); 
    }//GEN-LAST:event_AddActionPerformed

    private void ChangementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangementActionPerformed
 
        this.dispose(); 
        
        Miseajour miseajour = new Miseajour();
        miseajour.setLocationRelativeTo(null);
        miseajour.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangementActionPerformed

    private void DeconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconexionActionPerformed
        Accueil acceuil = new Accueil();
        acceuil.setLocationRelativeTo(null);
        acceuil.setVisible(true);   
        this.dispose(); 
        JOptionPane.showMessageDialog(null, "Déconnexion Réussi !!!");
        
// TODO add your handling code here:
    }//GEN-LAST:event_DeconexionActionPerformed

    private void SuppressionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppressionActionPerformed

        this.dispose();
   
        Suppression suppression = new Suppression();
        suppression.setLocationRelativeTo(null);
        suppression.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_SuppressionActionPerformed

    private void ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListActionPerformed
      // TODO add your ha  String searchText = etudiant.getText(); // Récupération du texte saisi dans le JTextField
    String searchText = ""; // Récupération du texte saisi dans le JTextField
    DefaultTableModel model = (DefaultTableModel) ListeEtudiants.getModel(); // Récupération du modèle de la JTable
    
    // Création d'un RowFilter pour filtrer le modèle de la JTable en fonction du texte saisi
    RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter("(?i)" + searchText); // Ignorer la casse du texte
    
    // Application du RowFilter au sorter de la JTable
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    sorter.setRowFilter(rf);
    ListeEtudiants.setRowSorter(sorter);
        
        
    }//GEN-LAST:event_ListActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void etudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etudiantActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // Récupération du texte saisi dans le JTextField
        String searchText = etudiant.getText(); // Récupération du texte saisi dans le JTextField
        DefaultTableModel model = (DefaultTableModel) ListeEtudiants.getModel(); // Récupération du modèle de la JTable

        // Création d'un RowFilter pour filtrer le modèle de la JTable en fonction du texte saisi
        RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter("(?i)" + searchText); // Ignorer la casse du texte

        // Application du RowFilter au sorter de la JTable
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        sorter.setRowFilter(rf);
        ListeEtudiants.setRowSorter(sorter);
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Dashboard dashboard = new Dashboard();
            
                 dashboard.setLocationRelativeTo(null); // Centrer la fenêtre
                 dashboard.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Changement;
    private javax.swing.JPanel Container;
    private javax.swing.JButton Deconexion;
    private javax.swing.JLabel EditTextUser;
    private javax.swing.JButton List;
    private javax.swing.JTable ListeEtudiants;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Reload;
    private javax.swing.JPanel SousContainer;
    private javax.swing.JButton Suppression;
    private javax.swing.JTextField etudiant;
    private javax.swing.JLabel etudiantfind;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
