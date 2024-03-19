/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbmscp;

import dbmscp.MyConnection.MyCon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Darshan
 */
public class P extends javax.swing.JFrame {

    private String contact;
    private String password;

    /**
     * Creates new form P
     */
    public P(String contact, String password) {
        this.contact = contact;
        this.password = password;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Seller Name", "Seller  Contact No", "Address", "Area", "Floor Allowed", "Type", "Price"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 1440, 500));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Total Price", "Average Price", "Property Count" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(":");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 250, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 240, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Max Price", "Min Price" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 240, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Plot Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sort by");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, -1, -1));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 170, -1, 50));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("View");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 170, -1, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Darshan\\Downloads\\d101.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String maxmin = (String) jComboBox2.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        if(maxmin=="Min Price"){
        try {
            
            ResultSet rs = MyCon.retrieveData("SELECT p.* FROM vplot AS p WHERE p.plot_price = (SELECT MIN(plot_price) FROM vplot WHERE seller_contact = '" + contact + "');");

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("seller_name"), rs.getString("seller_contact"),
                    rs.getString("plot_address"), rs.getString("plot_area"), rs.getString("plot_floorallowed"), rs.getString("plot_type"), rs.getString("plot_price")});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

        }
        }
        
        else if(maxmin=="Max Price"){
            
            try {
            
            ResultSet rs = MyCon.retrieveData("SELECT p.* FROM vplot AS p WHERE p.plot_price = (SELECT MAX(plot_price) FROM vplot WHERE seller_contact = '" + contact + "');");

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("seller_name"), rs.getString("seller_contact"),
                    rs.getString("plot_address"), rs.getString("plot_area"), rs.getString("plot_floorallowed"), rs.getString("plot_type"), rs.getString("plot_price")});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

        }
            
            
        }
        
        


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String total = (String) jComboBox1.getSelectedItem();

        String sqlQuery = "SELECT SUM(plot_price) AS total_price FROM vplot where seller_contact='" + contact + "'";
        ResultSet resultSet = MyCon.retrieveData(sqlQuery);

        if (total == "Total Price") {
            try {
                if (resultSet.next()) {
                    double totalPrice = resultSet.getDouble("total_price");
                    jLabel2.setText(": " + totalPrice);
                }
            } catch (SQLException ex) {
                Logger.getLogger(P.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (total == "Average Price") {
            String sqlQuery1 = "SELECT AVG(plot_price) AS average FROM vplot where seller_contact='" + contact + "'";
            ResultSet resultSet1 = MyCon.retrieveData(sqlQuery1);

            try {
                if (resultSet1.next()) {
                    double average = resultSet1.getDouble("average");
                    jLabel2.setText(": " + average);
                }
            } catch (SQLException ex) {
                Logger.getLogger(P.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (total == "Property Count") {
            String sqlQuery2 = "SELECT COUNT(plot_price) AS count FROM vplot where seller_contact='" + contact + "'";
            ResultSet resultSet2 = MyCon.retrieveData(sqlQuery2);

            try {
                if (resultSet2.next()) {
                    double count = resultSet2.getDouble("count");
                    jLabel2.setText(": " + count);
                }
            } catch (SQLException ex) {
                Logger.getLogger(P.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        String sortPrice = (String) jComboBox4.getSelectedItem();
        ResultSet rs1 = null; // Declare the ResultSet outside the try block

        try {
            if ("Ascending".equals(sortPrice)) {
                rs1 = MyCon.retrieveData("SELECT * FROM vplot WHERE seller_contact = '" + contact + "' ORDER BY plot_price ASC;");
            } else if ("Descending".equals(sortPrice)) {
                rs1 = MyCon.retrieveData("SELECT * FROM vplot WHERE seller_contact = '" + contact + "' ORDER BY plot_price DESC;");
            }
            while (rs1.next()) {
                model.addRow(new Object[]{rs1.getString("seller_name"), rs1.getString("seller_contact"),
                    rs1.getString("plot_address"), rs1.getString("plot_area"), rs1.getString("plot_floorallowed"), rs1.getString("plot_type"), rs1.getString("plot_price")});
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Q(contact,password).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
