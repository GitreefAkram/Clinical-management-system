package managmentsystem;

import com.mysql.jdbc.Connection;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import sun.java2d.pipe.hw.AccelDeviceEventNotifier;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }
    int xMouse , yMouse;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbbox = new javax.swing.JComboBox<>();
        btnexit = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        viewpassword = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(404, 500));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managmentsystem/id.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 63, 44));

        txtid.setBackground(new java.awt.Color(204, 204, 204));
        txtid.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtid.setForeground(new java.awt.Color(0, 0, 255));
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidKeyPressed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 210, 30));

        txtpassword.setBackground(new java.awt.Color(204, 204, 204));
        txtpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 0, 255));
        txtpassword.setEchoChar('\u2022');
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managmentsystem/password.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 50, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managmentsystem/select.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 50, 40));

        cmbbox.setBackground(new java.awt.Color(204, 204, 204));
        cmbbox.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cmbbox.setForeground(new java.awt.Color(0, 0, 255));
        cmbbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Reception" }));
        cmbbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbboxActionPerformed(evt);
            }
        });
        jPanel1.add(cmbbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 210, 31));

        btnexit.setBackground(new java.awt.Color(255, 0, 0));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managmentsystem/Close.png"))); // NOI18N
        btnexit.setText("EXIT");
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 100, 40));

        btnlogin.setBackground(new java.awt.Color(0, 51, 204));
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managmentsystem/login1.png"))); // NOI18N
        btnlogin.setText("LOGIN");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 400, 100, 40));

        viewpassword.setBackground(new java.awt.Color(102, 153, 255));
        viewpassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        viewpassword.setText("View password");
        viewpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(viewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 130, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/managmentsystem/login.PNG"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbboxActionPerformed

    }//GEN-LAST:event_cmbboxActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.dispose();
        System.exit(0);
        
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        int selection = cmbbox.getSelectedIndex();

        switch (selection) {
            case 0:
                login(0);
                break;
            case 1:
                login(1);
                break;
            case 2:
                login(2);
                break;
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ENTER )     
    {
    int selection = cmbbox.getSelectedIndex();

        switch (selection) {
            case 0:
                login(0);
                break;
            case 1:
                login(1);
                break;
            case 2:
                login(2);
                break;
        }
    } 
    }//GEN-LAST:event_jPanel1KeyPressed

    private void txtidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER )     
    {
    int selection = cmbbox.getSelectedIndex();

        switch (selection) {
            case 0:
                login(0);
                break;
            case 1:
                login(1);
                break;
            case 2:
                login(2);
                break;
        }
    }//GEN-LAST:event_txtidKeyPressed
    }
    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
      
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER )     
    {
    int selection = cmbbox.getSelectedIndex();

        switch (selection) {
            case 0:
                login(0);
                break;
            case 1:
                login(1);
                break;
            case 2:
                login(2);
                break;
        }
    }    
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
     
        
    }//GEN-LAST:event_jLabel5MousePressed

    private void viewpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpasswordActionPerformed
        if (viewpassword.isSelected()) 
        {
         txtpassword.setEchoChar((char)0);
        }
        else
        {
            txtpassword.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_viewpasswordActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public void login(int i) {
        String uid = txtid.getText();
        String pass = String.valueOf(txtpassword.getPassword());
        String query = "";
        if (txtid.getText().trim().isEmpty() || pass.trim().isEmpty()) {
            JOptionPane.showMessageDialog(login.this, "Fields can't be empty");
            txtid.setText("");
            txtpassword.setText("");
        } else {
            try {
                int id = Integer.parseInt(uid);
                String who = "";
                switch (i) {
                    case 0:
                        who = "admin";
                        break;
                    case 1:
                        who = "doctor";
                        break;
                    case 2:
                        who = "reception";
                        break;
                    default:
                        break;
                }
                query = "select * from " + who + " where id = '" + id + "' and BINARY password = '" + pass + "'";                
                ResultSet rs = Db.getData(query);
                if (rs.next()) {
                    this.dispose();
                    String name = rs.getString("Name");
                    switch (i) {
                        case 0:
                            new Admin(name, id).setVisible(true);
                            break;
                        case 1:
                            new doctor(name, id).setVisible(true);
                            break;
                        case 2:
                            new reception(name, id).setVisible(true);
                            break;
                        default:
                            break;
                    }
                } else {                    
                    JOptionPane.showMessageDialog(login.this, "Invalid ID or password", "Login failed", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JComboBox<String> cmbbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JCheckBox viewpassword;
    // End of variables declaration//GEN-END:variables
}
