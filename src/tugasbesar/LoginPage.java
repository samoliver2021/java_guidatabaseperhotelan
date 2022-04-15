package tugasbesar;

import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {
    
    public static String username, password;
    
    public LoginPage() {
        initComponents();
        this.setLocation(450, 250);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TF_Password = new javax.swing.JPasswordField();
        TF_Username = new javax.swing.JTextField();
        BTN_Reset = new javax.swing.JButton();
        BTN_Submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page ");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/logo.jpg")).getImage());

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("                  Login Sistem Database HHB");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(130, 60, 360, 24);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Password");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(180, 170, 78, 15);

        TF_Password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(TF_Password);
        TF_Password.setBounds(280, 160, 140, 30);

        TF_Username.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TF_Username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(TF_Username);
        TF_Username.setBounds(280, 110, 140, 30);

        BTN_Reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Reset.setText("Reset");
        BTN_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ResetActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Reset);
        BTN_Reset.setBounds(350, 230, 71, 25);

        BTN_Submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Submit.setText("Submit");
        BTN_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SubmitActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Submit);
        BTN_Submit.setBounds(190, 230, 80, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Username");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(180, 120, 78, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("               Hotel Harapan Bangsa ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(110, 20, 390, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/hotelbg.jpg.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 310);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ResetActionPerformed
        JOptionPane.showMessageDialog(null, "Form berhasil di reset", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
        TF_Username.setText("");
        TF_Password.setText("");
        System.out.print("Form berhasil di reset\n");
    }//GEN-LAST:event_BTN_ResetActionPerformed

    private void BTN_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SubmitActionPerformed
        username = TF_Username.getText();
        password = TF_Password.getText();
        
        if (TF_Username.getText().trim().equals("") && TF_Password.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Form tidak boleh kosong, mohon diisi terlebih dahulu !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
        } else if (TF_Username.getText().equals("samueloliver760") && TF_Password.getText().equals("mulutmerah")) {
            JOptionPane.showMessageDialog(null, "Username dan password benar. Login berhasil !", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
            System.out.print("Login berhasil\n");
            this.setVisible(false);
            new HomePage().setVisible(true);
           
        } else {
            JOptionPane.showMessageDialog(null, "Username atau password salah. Mohon isi ulang lagi !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
             System.out.print("User gagal login\n");
        }
    }//GEN-LAST:event_BTN_SubmitActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Reset;
    private javax.swing.JButton BTN_Submit;
    private javax.swing.JPasswordField TF_Password;
    private javax.swing.JTextField TF_Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
