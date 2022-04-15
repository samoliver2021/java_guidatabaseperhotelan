package tugasbesar;

import javax.swing.JOptionPane;

public class HomePage extends javax.swing.JFrame {
    
    public static String username, password;
    
    public HomePage() {
        initComponents();
         this.setLocation(450, 250);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BTN_DBKupon = new javax.swing.JButton();
        BTN_DBReservasi = new javax.swing.JButton();
        BTN_DBPengunjung = new javax.swing.JButton();
        BTN_Exit = new javax.swing.JButton();
        BTN_DBKamar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page ");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/logo.jpg")).getImage());

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("          Silakan pilih database yang ingin ditampilkan !");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(100, 60, 420, 24);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("                  Selamat datang ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(120, 20, 390, 29);

        BTN_DBKupon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BTN_DBKupon.setText("Database Kupon Breakfast");
        BTN_DBKupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DBKuponActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_DBKupon);
        BTN_DBKupon.setBounds(380, 210, 180, 40);

        BTN_DBReservasi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BTN_DBReservasi.setText("Database Reservasi ");
        BTN_DBReservasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DBReservasiActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_DBReservasi);
        BTN_DBReservasi.setBounds(380, 130, 180, 40);

        BTN_DBPengunjung.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BTN_DBPengunjung.setText("Database Pengunjung ");
        BTN_DBPengunjung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DBPengunjungActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_DBPengunjung);
        BTN_DBPengunjung.setBounds(80, 130, 180, 40);

        BTN_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/exit.png"))); // NOI18N
        BTN_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ExitActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_Exit);
        BTN_Exit.setBounds(570, 10, 40, 30);

        BTN_DBKamar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BTN_DBKamar.setText("Database Kamar");
        BTN_DBKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DBKamarActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_DBKamar);
        BTN_DBKamar.setBounds(80, 210, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/hotelbg.jpg.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 320);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
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

    private void BTN_DBKuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DBKuponActionPerformed
         System.out.print("Form berpindah ke database kupon breakfast\n");
         new Form_kupon_breakfast().setVisible(true);
         new HomePage().setVisible(false);
       
    }//GEN-LAST:event_BTN_DBKuponActionPerformed

    private void BTN_DBPengunjungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DBPengunjungActionPerformed
        System.out.print("Form berpindah ke database pengunjung\n");
        new Form_pengunjung().setVisible(true);
         new HomePage().setVisible(false);
        
    }//GEN-LAST:event_BTN_DBPengunjungActionPerformed

    private void BTN_DBKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DBKamarActionPerformed
       System.out.print("Form berpindah ke database kamar\n");
       new Form_kamar().setVisible(true);
        new HomePage().setVisible(false);
         
    }//GEN-LAST:event_BTN_DBKamarActionPerformed

    private void BTN_DBReservasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DBReservasiActionPerformed
        System.out.print("Form berpindah ke database reservasi\n");
        new Form_reservasi().setVisible(true);
         new HomePage().setVisible(false);
         
    }//GEN-LAST:event_BTN_DBReservasiActionPerformed

    private void BTN_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ExitActionPerformed
        System.out.print("Keluar dari form \n");
        System.exit(0);
        
    }//GEN-LAST:event_BTN_ExitActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_DBKamar;
    private javax.swing.JButton BTN_DBKupon;
    private javax.swing.JButton BTN_DBPengunjung;
    private javax.swing.JButton BTN_DBReservasi;
    private javax.swing.JButton BTN_Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
