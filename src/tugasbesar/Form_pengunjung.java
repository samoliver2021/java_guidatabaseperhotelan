package tugasbesar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.String;
import javax.swing.table.TableModel;

public class Form_pengunjung extends javax.swing.JFrame {

    public static Connection koneksi;
    public static ResultSet data;
    public static String sql, kode_pengunjung, nama_depan, kewarganegaraan, no_telepon, id_reservasi, nama_belakang, email, jk;
    public static int baris, ok;
    public static DefaultTableModel model;
    public static Statement stat;

    public Form_pengunjung() {
        initComponents();
        KoneksiDatabase();
        TampilData();
        this.setLocation(160, 50);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_JenisKelamin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        TF_NamaBelakang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TF_Email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_KodePengunjung = new javax.swing.JTextField();
        TF_Kewarganegaraan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_NoTelepon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_NamaDepan = new javax.swing.JTextField();
        TF_IDReservasi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BTN_Simpan = new javax.swing.JButton();
        BTN_Hapus = new javax.swing.JButton();
        BTN_Ubah = new javax.swing.JButton();
        BTN_Batal = new javax.swing.JButton();
        BTN_Balik = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Pengunjung = new javax.swing.JTable();
        RB_Pria = new javax.swing.JRadioButton();
        RB_Wanita = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pengunjung");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/logo.jpg")).getImage());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Form Pengunjung  Hotel Harapan Bangsa");

        TF_NamaBelakang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_NamaBelakang.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Id reservasi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kode pengunjung");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("No telepon");

        TF_Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_Email.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nama depan");

        TF_KodePengunjung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_KodePengunjung.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TF_KodePengunjung.setMargin(new java.awt.Insets(2, 0, 2, 2));

        TF_Kewarganegaraan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_Kewarganegaraan.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Jenis kelamin");

        TF_NoTelepon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_NoTelepon.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Kewarganegaraan");

        TF_NamaDepan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_NamaDepan.setMargin(new java.awt.Insets(2, 0, 2, 2));

        TF_IDReservasi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_IDReservasi.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        BTN_Simpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Simpan.setText("Simpan");
        BTN_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SimpanActionPerformed(evt);
            }
        });

        BTN_Hapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Hapus.setText("Hapus");
        BTN_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_HapusActionPerformed(evt);
            }
        });

        BTN_Ubah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Ubah.setText("Ubah");
        BTN_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_UbahActionPerformed(evt);
            }
        });

        BTN_Batal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Batal.setText("Batal");
        BTN_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BatalActionPerformed(evt);
            }
        });

        BTN_Balik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Balik.setText("Balik");
        BTN_Balik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BalikActionPerformed(evt);
            }
        });

        TBL_Pengunjung.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TBL_Pengunjung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode pengunjung", "Nama depan", "Nama belakang", "Kewarganegaraan", "Jenis Kelamin", "Email", "No telepon", "Id reservasi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TBL_Pengunjung.getTableHeader().setReorderingAllowed(false);
        TBL_Pengunjung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_PengunjungMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBL_Pengunjung);
        if (TBL_Pengunjung.getColumnModel().getColumnCount() > 0) {
            TBL_Pengunjung.getColumnModel().getColumn(4).setResizable(false);
        }

        BG_JenisKelamin.add(RB_Pria);
        RB_Pria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RB_Pria.setText("Pria");

        BG_JenisKelamin.add(RB_Wanita);
        RB_Wanita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RB_Wanita.setText("Wanita");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Nama belakang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BTN_Balik))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_KodePengunjung, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_Kewarganegaraan, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(TF_NoTelepon)
                            .addComponent(TF_NamaDepan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RB_Pria)
                                .addGap(50, 50, 50)
                                .addComponent(RB_Wanita))
                            .addComponent(TF_NamaBelakang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_IDReservasi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addComponent(BTN_Simpan)
                .addGap(52, 52, 52)
                .addComponent(BTN_Ubah)
                .addGap(52, 52, 52)
                .addComponent(BTN_Hapus)
                .addGap(52, 52, 52)
                .addComponent(BTN_Batal)
                .addGap(411, 411, 411))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TF_KodePengunjung, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TF_NamaDepan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TF_IDReservasi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_NamaBelakang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_Kewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(RB_Pria)
                            .addComponent(RB_Wanita))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TF_NoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(TF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Simpan)
                    .addComponent(BTN_Ubah)
                    .addComponent(BTN_Hapus)
                    .addComponent(BTN_Batal))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BTN_Balik)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SimpanActionPerformed
        kode_pengunjung = TF_KodePengunjung.getText();
        nama_depan = TF_NamaDepan.getText();
        nama_belakang = TF_NamaBelakang.getText();
        kewarganegaraan = TF_Kewarganegaraan.getText();
        email = TF_Email.getText();
        no_telepon = TF_NoTelepon.getText();
        id_reservasi = TF_IDReservasi.getText();

        if (TF_KodePengunjung.getText().trim().equals("") || TF_IDReservasi.getText().trim().equals("") || TF_NamaDepan.getText().trim().equals("") || TF_NamaBelakang.getText().trim().equals("") || BG_JenisKelamin.isSelected(null) || TF_Kewarganegaraan.getText().trim().equals("") || TF_Email.getText().trim().equals("") || TF_NoTelepon.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ada data yang masih kosong.Mohon lengkapi data terlebih dahulu !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
            BTN_Ubah.setEnabled(false);
            BTN_Hapus.setEnabled(false);
            BTN_Batal.setEnabled(false);
        } else {
            try {
                stat = koneksi.createStatement();
                data = stat.executeQuery("SELECT * FROM database_pengunjung WHERE kode_pengunjung = " + TF_KodePengunjung.getText());

                if (data.next()) {
                    JOptionPane.showMessageDialog(null, "Kode pengunjung [" + kode_pengunjung + "] telah terinput, mohon tuliskan kode pengunjung lainnya !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
                    TF_KodePengunjung.requestFocus();
                    BTN_Ubah.setEnabled(false);
                    BTN_Hapus.setEnabled(false);
                    BTN_Batal.setEnabled(false);
                } else {
                    jk = null;
                    if (RB_Pria.isSelected()) {
                        jk = "Pria";
                    } else if (RB_Wanita.isSelected()) {
                        jk = "Wanita";
                    }

                    sql = "INSERT INTO database_pengunjung VALUES ("
                            + "" + kode_pengunjung + ""
                            + ",'" + nama_depan + "'"
                            + ",'" + nama_belakang + "'"
                            + ",'" + kewarganegaraan + "'"
                            + ",'" + jk + "'"
                            + ",'" + email + "'"
                            + ",'" + no_telepon + "'"
                            + ",'" + id_reservasi + "')";

                    BTN_Ubah.setEnabled(true);
                    BTN_Hapus.setEnabled(true);
                    BTN_Batal.setEnabled(true);
                    stat.executeUpdate(sql);

                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                    TF_KodePengunjung.setText("");
                    TF_NamaDepan.setText("");
                    TF_NamaBelakang.setText("");
                    TF_Kewarganegaraan.setText("");
                    BG_JenisKelamin.clearSelection();
                    TF_Email.setText("");
                    TF_NoTelepon.setText("");
                    TF_IDReservasi.setText("");

                    TampilData();

                }
                stat.close();

            } catch (Exception exc) {
                System.err.println("Terjadi kesalahan : " + exc);
            }
        }
    }//GEN-LAST:event_BTN_SimpanActionPerformed

    private void TBL_PengunjungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_PengunjungMouseClicked
        baris = TBL_Pengunjung.getSelectedRow();
        if (baris != -1) {
            TF_KodePengunjung.setText(TBL_Pengunjung.getValueAt(baris, 0).toString());
            TF_NamaDepan.setText(TBL_Pengunjung.getValueAt(baris, 1).toString());
            TF_NamaBelakang.setText(TBL_Pengunjung.getValueAt(baris, 2).toString());
            TF_Kewarganegaraan.setText(TBL_Pengunjung.getValueAt(baris, 3).toString());
            if ("Wanita".equals(TBL_Pengunjung.getValueAt(baris, 4).toString())) {
                RB_Wanita.setSelected(true);

            } else {
                RB_Pria.setSelected(true);
            }
            TF_Email.setText(TBL_Pengunjung.getValueAt(baris, 5).toString());
            TF_NoTelepon.setText(TBL_Pengunjung.getValueAt(baris, 6).toString());
            TF_IDReservasi.setText(TBL_Pengunjung.getValueAt(baris, 7).toString());
        }
    }//GEN-LAST:event_TBL_PengunjungMouseClicked

    private void BTN_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_UbahActionPerformed
        ok = JOptionPane.showConfirmDialog(null, "Yakin ingin mengubah data ini ? ", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);

        if (ok == 0) {
            jk = null;
            if (RB_Pria.isSelected()) {
                jk = "Pria";
            } else if (RB_Wanita.isSelected()) {
                jk = "Wanita";
            }
            sql = "update database_pengunjung set kode_pengunjung ='" + TF_KodePengunjung.getText()
                    + "',nama_depan='" + TF_NamaDepan.getText()
                    + "',nama_belakang='" + TF_NamaBelakang.getText()
                    + "',kewarganegaraan='" + TF_Kewarganegaraan.getText()
                    + "',jenis_kelamin='" + jk
                    + "',email='" + TF_Email.getText()
                    + "',no_telepon='" + TF_NoTelepon.getText()
                    + "',id_reservasi='" + TF_IDReservasi.getText()
                    + "'where kode_pengunjung='" + TF_KodePengunjung.getText().trim() + "'";

            if (TF_KodePengunjung.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak ada data yang diubah, mohon ubah data terlebih dahulu", "Ubah Data", JOptionPane.WARNING_MESSAGE);
                TF_KodePengunjung.requestFocus();
            } else {
                try {
                    stat = koneksi.createStatement();
                    stat.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Ubah data", JOptionPane.INFORMATION_MESSAGE);
                    stat.close();
                    TF_KodePengunjung.requestFocus();
                    TampilData();
                    TF_KodePengunjung.setText("");
                    TF_NamaDepan.setText("");
                    TF_NamaBelakang.setText("");
                    TF_Kewarganegaraan.setText("");
                    BG_JenisKelamin.clearSelection();
                    TF_Email.setText("");
                    TF_NoTelepon.setText("");
                    TF_IDReservasi.setText("");
                } catch (Exception exc) {
                    System.err.println("Error : " + exc);
                }
            }
        }
    }//GEN-LAST:event_BTN_UbahActionPerformed

    private void BTN_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_HapusActionPerformed
        ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini ?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);

        if (ok == 0) {
            sql = "DELETE FROM database_pengunjung WHERE kode_pengunjung ='" + TF_KodePengunjung.getText().trim() + "'";

            try {
                stat = koneksi.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil di hapus", "Hapus data", JOptionPane.INFORMATION_MESSAGE);
                stat.close();
                TF_KodePengunjung.setText("");
                TF_NamaDepan.setText("");
                TF_NamaBelakang.setText("");
                TF_Kewarganegaraan.setText("");
                BG_JenisKelamin.clearSelection();
                TF_Email.setText("");
                TF_NoTelepon.setText("");
                TF_IDReservasi.setText("");

                TF_KodePengunjung.requestFocus();
                TampilData();
            } catch (SQLException exc) {
                System.err.println(sql);
                System.err.println("Error : " + exc);
            }
        }
    }//GEN-LAST:event_BTN_HapusActionPerformed

    private void BTN_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BatalActionPerformed
        ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin membatalkan data ini ?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil di batalkan", "Hapus data", JOptionPane.INFORMATION_MESSAGE);
            TF_KodePengunjung.setText("");
            TF_NamaDepan.setText("");
            TF_NamaBelakang.setText("");
            TF_Kewarganegaraan.setText("");
            BG_JenisKelamin.clearSelection();
            TF_Email.setText("");
            TF_NoTelepon.setText("");
            TF_IDReservasi.setText("");
        } 
    }//GEN-LAST:event_BTN_BatalActionPerformed

    private void BTN_BalikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BalikActionPerformed
        this.setVisible(false);
        new HomePage().setVisible(true);
        System.out.print("Form dibalikan ke home page\n");
    }//GEN-LAST:event_BTN_BalikActionPerformed

    private void TampilData() {
        model = new DefaultTableModel();
        model.addColumn("Kode pengunjung");
        model.addColumn("Nama depan");
        model.addColumn("Nama belakang");
        model.addColumn("Kewarganegaraan");
        model.addColumn("Jenis kelamin");
        model.addColumn("Email");
        model.addColumn("No Telepon");
        model.addColumn("Id reservasi");
        TBL_Pengunjung.setModel(model);

        try {
            stat = koneksi.createStatement();
            data = stat.executeQuery("SELECT * FROM database_pengunjung");
            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("kode_pengunjung"),
                    data.getString("nama_depan"),
                    data.getString("nama_belakang"),
                    data.getString("kewarganegaraan"),
                    data.getString("jenis_kelamin"),
                    data.getString("email"),
                    data.getString("no_telepon"),
                    data.getString("id_reservasi"),});
                TBL_Pengunjung.setModel(model);
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
            System.out.println("Form_reservasi berhasil dikoneksikan ke database_pengunjung");
        } catch (SQLException se) {
            System.out.println("Form_reservasi gagal dikoneksikan ke database_pengunjung : \n" + se);
        } catch (Exception e) {

        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_pengunjung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_JenisKelamin;
    private javax.swing.JButton BTN_Balik;
    private javax.swing.JButton BTN_Batal;
    private javax.swing.JButton BTN_Hapus;
    private javax.swing.JButton BTN_Simpan;
    private javax.swing.JButton BTN_Ubah;
    private javax.swing.JRadioButton RB_Pria;
    private javax.swing.JRadioButton RB_Wanita;
    private javax.swing.JTable TBL_Pengunjung;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_IDReservasi;
    private javax.swing.JTextField TF_Kewarganegaraan;
    private javax.swing.JTextField TF_KodePengunjung;
    private javax.swing.JTextField TF_NamaBelakang;
    private javax.swing.JTextField TF_NamaDepan;
    private javax.swing.JTextField TF_NoTelepon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
