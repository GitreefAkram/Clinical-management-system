/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author muham
 */
public class UpdRecep extends javax.swing.JFrame {

    /**
     * Creates new form UpdRecep
     */
    String name, server;
    int id, uid;

    public UpdRecep() {
        initComponents();
    }

    public UpdRecep(String name, String server, int id, int res) throws Exception {
        initComponents();
        this.name = name;
        this.server = server;
        this.id = id;
        this.uid = res;
        System.out.println(name);
        fetch();
    }

    public void fetch() throws Exception {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            // establish connection  
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin", "root", "");
//            Statement stm = con.createStatement();
            String query = "select * from " + server + " where id = '" + uid + "'";
//            ResultSet rs = stm.executeQuery(query);
            ResultSet rs = Db.getData(query);
            if (rs.next()) {
                txtid.setText(toString().valueOf(uid));
                txtname.setText(rs.getString("name"));
                txtcontact.setText(rs.getString("contact"));
                txtaddress.setText(rs.getString("address"));
            } else {
                JOptionPane.showMessageDialog(this, "ID not exist");
            }
        } catch (SQLException | ClassNotFoundException se) {
            JOptionPane.showMessageDialog(null, se);
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

        jPanel1 = new javax.swing.JPanel();
        lblupdate = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblid = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblcontactno = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        btncancel = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblupdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblupdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblupdate.setText("UPDATE");
        jPanel1.add(lblupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 22, 124, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 57, 114, 10));

        lblid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblid.setText("ID:");
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        txtid.setEditable(false);
        txtid.setBackground(new java.awt.Color(153, 153, 153));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 217, 31));

        lblname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblname.setText("NAME :");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 217, 31));

        lblcontactno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcontactno.setText("Contact No :");
        jPanel1.add(lblcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel1.add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 217, 31));

        lbladdress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbladdress.setText("Address :");
        jPanel1.add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txtaddress.setColumns(20);
        txtaddress.setLineWrap(true);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 217, 110));

        btncancel.setBackground(new java.awt.Color(255, 51, 51));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("CANCEL");
        btncancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, 33));

        btnsubmit.setBackground(new java.awt.Color(0, 102, 255));
        btnsubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setText("SUBMIT");
        btnsubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, 33));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.dispose();
        if(server == "reception"){
            new viewreception(name, id).setVisible(true);            
        }else{
            new viewdoctor(name, id).setVisible(true);            
        }
        
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:                
        try {
            if (txtname.getText().trim().isEmpty() || txtcontact.getText().trim().isEmpty() || txtaddress.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fill all the fields");
                txtname.requestFocus();
            } else {
                //String query = "UPDATE \"+server+\" SET name='\" + txtname.getText() + \"',contact='\" + txtcontact.getText() + \"', address='\" + txtaddress.getText() + \"' WHERE id = '\" + uid + \"'";
                String query = "UPDATE " + server + " SET name='" + txtname.getText() + "',contact= '" + txtcontact.getText() + "', address= '" + txtaddress.getText() + "' WHERE id = '" + uid + "'";                
                Db.setData(query);
                JOptionPane.showMessageDialog(null, "Record is updated...");
                this.dispose();
                if (server.equalsIgnoreCase("reception")) {
                    new viewreception(name, id).setVisible(true);
                } else if (server.equalsIgnoreCase("doctor")) {
                    new viewdoctor(name, id).setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_btnsubmitActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

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
            java.util.logging.Logger.getLogger(UpdRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdRecep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcontactno;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblupdate;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}