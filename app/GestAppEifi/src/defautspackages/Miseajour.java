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
public final class Miseajour extends javax.swing.JFrame {
    
    private final String url = "jdbc:mysql://localhost/eifi"; // URL de la base de données
    private final String user = "root"; // Nom d'utilisateur
    private final String password = ""; // Mot de passe (vide dans ce cas)

    /**
     * Creates new form Mise à jour
     */
    public Miseajour() {
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeEtudiants = new javax.swing.JTable();
        etudiantfind = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        etudiant = new javax.swing.JTextField();
        Changer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Container.setBackground(new java.awt.Color(0, 0, 160));

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

        etudiantfind.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        etudiantfind.setForeground(new java.awt.Color(255, 255, 255));
        etudiantfind.setText("Trouver un etudiant :");

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

        Changer.setText("Mettre À Jour");
        Changer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etudiantfind, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(etudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Changer, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(etudiantfind)
                .addGap(18, 18, 18)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etudiant, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Changer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void etudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etudiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etudiantActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your ha  String searchText = etudiant.getText(); // Récupération du texte saisi dans le JTextField
        String searchText = etudiant.getText(); // Récupération du texte saisi dans le JTextField
        DefaultTableModel model = (DefaultTableModel) ListeEtudiants.getModel(); // Récupération du modèle de la JTable

        // Création d'un RowFilter pour filtrer le modèle de la JTable en fonction du texte saisi
        RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter("(?i)" + searchText); // Ignorer la casse du texte

        // Application du RowFilter au sorter de la JTable
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        sorter.setRowFilter(rf);
        ListeEtudiants.setRowSorter(sorter);
    }//GEN-LAST:event_searchActionPerformed

    private void ChangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangerActionPerformed
    try {
        // Récupération du modèle de la JTable
        DefaultTableModel model = (DefaultTableModel) ListeEtudiants.getModel();
        
        // Connexion à la base de données
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eifi", "root", "");
        
        // Parcours de toutes les lignes de la JTable
        for (int i = 0; i < model.getRowCount(); i++) {
            // Récupération des valeurs de la ligne courante
            int matricule = (int) model.getValueAt(i, 0);
            String nom = (String) model.getValueAt(i, 1);
            String postNom = (String) model.getValueAt(i, 2);
            String prenom = (String) model.getValueAt(i, 3);
            String faculte = (String) model.getValueAt(i, 4);
            String promotion = (String) model.getValueAt(i, 5);
            String adresse = (String) model.getValueAt(i, 6);
            String numero = (String) model.getValueAt(i, 7);

            // Requête SQL de mise à jour
            String sql = "UPDATE gestap SET Nom=?, PostNom=?, Prenom=?, Facultes=?, Promotion=?, Adresse=?, Numero=? WHERE Matricule=?";

            // Préparation de la requête
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Définition des paramètres de la requête
            stmt.setString(1, nom);
            stmt.setString(2, postNom);
            stmt.setString(3, prenom);
            stmt.setString(4, faculte);
            stmt.setString(5, promotion);
            stmt.setString(6, adresse);
            stmt.setString(7, numero);
            stmt.setInt(8, matricule);

            // Exécution de la requête
            stmt.executeUpdate();
        }

        // Fermeture de la connexion à la base de données
        conn.close();

        // Affichage d'un message de confirmation
        JOptionPane.showMessageDialog(this, "Les données ont été mises à jour avec succès !");
                                        
        this.dispose(); 
        
         Dashboard dashboard = new Dashboard();
         dashboard.setLocationRelativeTo(null);
         dashboard.setVisible(true);
    } catch (SQLException ex) {
        // Affichage d'un message d'erreur en cas d'exception SQL
        JOptionPane.showMessageDialog(this, "Une erreur est survenue lors de la mise à jour des données : " + ex.getMessage());
    }
    }//GEN-LAST:event_ChangerActionPerformed

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
            java.util.logging.Logger.getLogger(Miseajour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Miseajour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Miseajour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Miseajour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Miseajour dashboard = new Miseajour();
            
                 dashboard.setLocationRelativeTo(null); // Centrer la fenêtre
                 dashboard.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Changer;
    private javax.swing.JPanel Container;
    private javax.swing.JTable ListeEtudiants;
    private javax.swing.JTextField etudiant;
    private javax.swing.JLabel etudiantfind;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
