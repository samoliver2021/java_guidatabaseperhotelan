package tugasbesar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.String;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import static tugasbesar.Form_pengunjung.ok;

public class Form_kamar extends javax.swing.JFrame {

    public static Connection koneksi;
    public static ResultSet data;
    public static String sql, id_kamar, no_kamar, jenis_kamar, lantai_kamar, pilihjeniskamar,pilihlantai;
    public static int harga_kamar, baris, ok;
    public static DefaultTableModel model;
    public static Statement stat;
    public static TableModel modela;

    public Form_kamar() {
        initComponents();
        KoneksiDatabase();
        TampilData();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        BTN_Simpan = new javax.swing.JButton();
        BTN_Batal = new javax.swing.JButton();
        TF_HargaKamar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_NoKamar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CB_Lantai = new javax.swing.JComboBox<>();
        BTN_Balik = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TF_IdKamar = new javax.swing.JTextField();
        BTN_Hapus = new javax.swing.JButton();
        CB_Jenis = new javax.swing.JComboBox<>();
        BTN_Ubah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Kamar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Kamar Hotel");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/logo.jpg")).getImage());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jenis kamar");

        BTN_Simpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Simpan.setText("Simpan");
        BTN_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SimpanActionPerformed(evt);
            }
        });

        BTN_Batal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Batal.setText("Batal");
        BTN_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BatalActionPerformed(evt);
            }
        });

        TF_HargaKamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_HargaKamar.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("No kamar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Id kamar");

        TF_NoKamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_NoKamar.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Harga kamar");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Form Kamar Hotel Harapan Bangsa");

        CB_Lantai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CB_Lantai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "1", "2", "3", "5", "6", "7", "8", "9" }));

        BTN_Balik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Balik.setText("Balik");
        BTN_Balik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BalikActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Lantai kamar");

        TF_IdKamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_IdKamar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TF_IdKamar.setMargin(new java.awt.Insets(2, 0, 2, 2));

        BTN_Hapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Hapus.setText("Hapus");
        BTN_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_HapusActionPerformed(evt);
            }
        });

        CB_Jenis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CB_Jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "Single Room", "Double Room", "Twin Room", "Family Room", "Presidential Room" }));
        CB_Jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_JenisActionPerformed(evt);
            }
        });

        BTN_Ubah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Ubah.setText("Ubah");
        BTN_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_UbahActionPerformed(evt);
            }
        });

        TBL_Kamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id kamar", "No kamar", "Jenis kamar", "Harga kamar", "Lantai kamar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TBL_Kamar.getTableHeader().setReorderingAllowed(false);
        TBL_Kamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_KamarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBL_Kamar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_IdKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_Jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_NoKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_HargaKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CB_Lantai, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_Balik)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_Simpan)
                        .addGap(52, 52, 52)
                        .addComponent(BTN_Ubah)
                        .addGap(52, 52, 52)
                        .addComponent(BTN_Hapus)
                        .addGap(52, 52, 52)
                        .addComponent(BTN_Batal)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(185, 185, 185))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(TF_IdKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CB_Jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CB_Lantai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TF_NoKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TF_HargaKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Simpan)
                    .addComponent(BTN_Ubah)
                    .addComponent(BTN_Hapus)
                    .addComponent(BTN_Batal))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BTN_Balik)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SimpanActionPerformed
        id_kamar = TF_IdKamar.getText();
        no_kamar = TF_NoKamar.getText();
        jenis_kamar = CB_Jenis.getSelectedItem().toString();

        if (!(TF_HargaKamar.getText().isEmpty())) {
            harga_kamar = Integer.parseInt(TF_HargaKamar.getText());
        }

        lantai_kamar = CB_Lantai.getSelectedItem().toString();

        if (TF_IdKamar.getText().trim().equals("") || TF_NoKamar.getText().trim().equals("") || CB_Jenis.getSelectedItem() == null || TF_HargaKamar.getText().trim().equals("") || CB_Lantai.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Data belum lengkap, mohon lengkapi data terlebih dahulu !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
            BTN_Ubah.setEnabled(false);
            BTN_Hapus.setEnabled(false);
            BTN_Batal.setEnabled(false);
        }
        
        if (CB_Jenis.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Tidak boleh memilih -Pilih- !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
        }
        
         if (CB_Lantai.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Tidak boleh memilih -Pilih- !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
        }
        
        else {
            try {
                stat = koneksi.createStatement();
                data = stat.executeQuery("SELECT * FROM database_kamar WHERE id_kamar = " + TF_IdKamar.getText());

                if (data.next()) {
                    JOptionPane.showMessageDialog(null, "Id kamar [" + id_kamar + "] telah terinput, mohon tuliskan id kamar lainnya !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
                    TF_IdKamar.requestFocus();
                    BTN_Ubah.setEnabled(false);
                    BTN_Hapus.setEnabled(false);
                    BTN_Batal.setEnabled(false);
                } else {
                    sql = "INSERT INTO database_kamar VALUES ("
                            + "" + id_kamar + ""
                            + ",'" + no_kamar + "'"
                            + ",'" + jenis_kamar + "'"
                            + ",'" + harga_kamar + "'"
                            + ",'" + lantai_kamar + "')";
                    BTN_Ubah.setEnabled(true);
                    BTN_Hapus.setEnabled(true);
                    BTN_Batal.setEnabled(true);
                    stat.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil di simpan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                    TampilData();
                    TF_IdKamar.setText("");
                    TF_NoKamar.setText("");
                    CB_Jenis.setSelectedIndex(0);
                    TF_HargaKamar.setText("");
                    CB_Lantai.setSelectedIndex(0);

                }
                stat.close();

            } catch (Exception exc) {
                System.err.println("Terjadi kesalahan : " + exc);
            }
        }
    }//GEN-LAST:event_BTN_SimpanActionPerformed

    private void BTN_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BatalActionPerformed
        ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin membatalkan data ini ?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
        TF_IdKamar.setText("");
        TF_NoKamar.setText("");
        CB_Jenis.setSelectedIndex(0);
        TF_HargaKamar.setText("");
        CB_Lantai.setSelectedIndex(0);
        }
    }//GEN-LAST:event_BTN_BatalActionPerformed

    private void BTN_BalikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BalikActionPerformed
        this.setVisible(false);
        new HomePage().setVisible(true);
        System.out.print("Form dibalikan ke home page\n");
    }//GEN-LAST:event_BTN_BalikActionPerformed

    private void BTN_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_HapusActionPerformed
        ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini ?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);

        if (ok == 0) {
            sql = "DELETE FROM database_kamar WHERE id_kamar='"
                    + TF_IdKamar.getText().trim() + "'";

            try {
                stat = koneksi.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
                stat.close();
                TF_IdKamar.setText("");
                TF_NoKamar.setText("");
                CB_Jenis.setSelectedIndex(0);
                TF_HargaKamar.setText("");
                CB_Lantai.setSelectedIndex(0);
                TampilData();

            } catch (SQLException exc) {
                System.err.println(sql);
                System.err.println("Error : " + exc);
            }
        }
    }//GEN-LAST:event_BTN_HapusActionPerformed

    private void BTN_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_UbahActionPerformed
        ok = JOptionPane.showConfirmDialog(null, "Yakin ingin mengubah data ini ?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);

        if (ok == 0) {
            sql = "update database_kamar set no_kamar = '" + TF_NoKamar.getText()
                    + "',jenis_kamar ='" + CB_Jenis.getSelectedItem()
                    + "',harga_kamar='" + TF_HargaKamar.getText()
                    + "',lantai_kamar='" + CB_Lantai.getSelectedItem()
                    + "'where id_kamar='" + TF_IdKamar.getText().trim() + "'";

            if (TF_IdKamar.getText().trim().equals("")) {
                  JOptionPane.showMessageDialog(null, "Tidak ada data yang diubah, mohon ubah data terlebih dahulu", "Ubah Data", JOptionPane.WARNING_MESSAGE);
                TF_NoKamar.requestFocus();
            } else {
                try {
                    stat = koneksi.createStatement();
                    stat.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Ubah Data", JOptionPane.INFORMATION_MESSAGE);
                    stat.close();
                    TF_NoKamar.requestFocus();
                    TampilData();
                    TF_IdKamar.setText("");
                    TF_NoKamar.setText("");
                    CB_Jenis.setSelectedIndex(0);
                    TF_HargaKamar.setText("");
                    CB_Lantai.setSelectedIndex(0);

                } catch (Exception exc) {
                    System.err.println("Error : " + exc);
                }
            }
        }
    }//GEN-LAST:event_BTN_UbahActionPerformed

    private void TBL_KamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_KamarMouseClicked
        baris = TBL_Kamar.getSelectedRow();
        modela = TBL_Kamar.getModel();
        if (baris != -1) {
            TF_IdKamar.setText(modela.getValueAt(baris, 0).toString());
            TF_NoKamar.setText(modela.getValueAt(baris, 1).toString());
            pilihjeniskamar = modela.getValueAt(baris, 2).toString();

            switch (pilihjeniskamar) {
                case "Single Room":
                    CB_Jenis.setSelectedIndex(1);
                    break;

                case "Double Room":
                    CB_Jenis.setSelectedIndex(2);
                    break;

                case "Twin Room":
                    CB_Jenis.setSelectedIndex(3);
                    break;

                case "Family Room":
                    CB_Jenis.setSelectedIndex(4);
                    break;

                case "Presidential Room":
                    CB_Jenis.setSelectedIndex(5);
                    break;

            }
            TF_HargaKamar.setText(modela.getValueAt(baris, 3).toString());
            pilihlantai = modela.getValueAt(baris, 4).toString();
             switch (pilihlantai) {
                case "1":
                    CB_Lantai.setSelectedIndex(1);
                    break;

                 case "2":
                    CB_Lantai.setSelectedIndex(2);
                    break;
                    
                 case "3":
                    CB_Lantai.setSelectedIndex(3);
                    break;
                    
                   case "5":
                    CB_Lantai.setSelectedIndex(4);
                    break;
                    
                   case "6":
                    CB_Lantai.setSelectedIndex(5);
                    break;
                    
                   case "7":
                    CB_Lantai.setSelectedIndex(6);
                    break;
                    
                   case "8":
                    CB_Lantai.setSelectedIndex(7);
                    break;
                    
                   case "9":
                    CB_Lantai.setSelectedIndex(8);
                    break;

            }
            
        }
    }//GEN-LAST:event_TBL_KamarMouseClicked

    private void CB_JenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_JenisActionPerformed
        harga_kamar = switch (CB_Jenis.getSelectedIndex()) {
            case 0 -> 0;
            case 1 -> 2000000;
            case 2 -> 3500000;
            case 3 -> 4500000;
            case 4 -> 5000000;
            default -> 10000000;
        };
       
        TF_HargaKamar.setText(String.valueOf(harga_kamar));

    }//GEN-LAST:event_CB_JenisActionPerformed

    private void TampilData() {
        model = new DefaultTableModel();
        model.addColumn("Id kamar");
        model.addColumn("No kamar");
        model.addColumn("Jenis kamar");
        model.addColumn("Harga kamar");
        model.addColumn("Lantai kamar");
        TBL_Kamar.setModel(model);

        try {
            stat = koneksi.createStatement();
            data = stat.executeQuery("SELECT * FROM database_kamar");
            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("id_kamar"),
                    data.getString("no_kamar"),
                    data.getString("jenis_kamar"),
                    data.getString("harga_kamar"),
                    data.getString("lantai_kamar")
                });
                TBL_Kamar.setModel(model);
            }
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan : " + e);
        }
    }

    private void KoneksiDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException cnf) {

        }
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/database_hotel", "root", "");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Form_kamar berhasil dikoneksikan ke database_kamar");
        } catch (SQLException se) {
            System.out.println("Form_kamar gagal dikoneksikan ke database_kamar " + se);
        } catch (Exception e) {

        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_kamar().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Balik;
    private javax.swing.JButton BTN_Batal;
    private javax.swing.JButton BTN_Hapus;
    private javax.swing.JButton BTN_Simpan;
    private javax.swing.JButton BTN_Ubah;
    private javax.swing.JComboBox<String> CB_Jenis;
    private javax.swing.JComboBox<String> CB_Lantai;
    private javax.swing.JTable TBL_Kamar;
    private javax.swing.JTextField TF_HargaKamar;
    private javax.swing.JTextField TF_IdKamar;
    private javax.swing.JTextField TF_NoKamar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
