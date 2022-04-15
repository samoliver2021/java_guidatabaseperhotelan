package tugasbesar;

import com.toedter.calendar.JDateChooser;
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
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import static tugasbesar.Form_pengunjung.ok;

public class Form_kupon_breakfast extends javax.swing.JFrame {

    public static Connection koneksi;
    public static ResultSet data;
    public static String sql, id_kupon,no_pengunjung,id_kamar, jam_sarapan,theDate, pattern, value,date,jam,str_tgl, tanggala;
    public static SimpleDateFormat sdf;
    public static int baris, ok;
    public static DefaultTableModel model;
    public static Statement stat;
    public static PreparedStatement pst;
    public static TableModel modela;
    public static Date tanggal_kupon, tanggal;
    public static JTable tabel;
    
    public Form_kupon_breakfast() {
        initComponents();
        KoneksiDatabase();
        TampilData();
        setLocationRelativeTo(this);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TF_IdKupon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TF_NoPengunjung = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_IdKamar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CB_JamSarapan = new javax.swing.JComboBox<>();
        BTN_Batal = new javax.swing.JButton();
        BTN_Hapus = new javax.swing.JButton();
        BTN_Ubah = new javax.swing.JButton();
        BTN_Simpan = new javax.swing.JButton();
        DC_TanggalKupon = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Kupon = new javax.swing.JTable();
        BTN_Balik = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Kupon Breakfast");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/logo.jpg")).getImage());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Form Kupon Breakfast Hotel Harapan Bangsa");
        jLabel1.setPreferredSize(new java.awt.Dimension(398, 24));

        TF_IdKupon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_IdKupon.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TF_IdKupon.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Id kupon");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("No pengunjung");

        TF_NoPengunjung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_NoPengunjung.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TF_NoPengunjung.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Id kamar");

        TF_IdKamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_IdKamar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TF_IdKamar.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal kupon");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Jam sarapan");

        CB_JamSarapan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CB_JamSarapan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "07:30:00", "08:00:00", "08:30:00", "09:00:00" }));

        BTN_Batal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Batal.setText("Batal");
        BTN_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BatalActionPerformed(evt);
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

        BTN_Simpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Simpan.setText("Simpan");
        BTN_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SimpanActionPerformed(evt);
            }
        });

        DC_TanggalKupon.setDateFormatString("yyyy/MM/dd");
        DC_TanggalKupon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18

        TBL_Kupon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Kupon", "No Pengunjung", "Id Kamar", "Tanggal Kupon", "Jam Sarapan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_Kupon.getTableHeader().setReorderingAllowed(false);
        TBL_Kupon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_KuponMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBL_Kupon);

        BTN_Balik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Balik.setText("Balik");
        BTN_Balik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BalikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TF_IdKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF_IdKupon, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DC_TanggalKupon, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF_NoPengunjung, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CB_JamSarapan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 717, Short.MAX_VALUE)
                                .addComponent(BTN_Balik)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTN_Simpan)
                        .addGap(52, 52, 52)
                        .addComponent(BTN_Ubah)
                        .addGap(52, 52, 52)
                        .addComponent(BTN_Hapus)
                        .addGap(52, 52, 52)
                        .addComponent(BTN_Batal)
                        .addGap(159, 159, 159))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_IdKupon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TF_NoPengunjung, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TF_IdKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CB_JamSarapan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(DC_TanggalKupon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Simpan)
                    .addComponent(BTN_Ubah)
                    .addComponent(BTN_Hapus)
                    .addComponent(BTN_Batal))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BTN_Balik)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BatalActionPerformed
       ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin membatalkan data ini ?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil di batalkan", "Hapus data", JOptionPane.INFORMATION_MESSAGE);
            TF_IdKupon.setText("");
            TF_NoPengunjung.setText("");
            TF_IdKamar.setText("");
            DC_TanggalKupon.setDate(null);
            CB_JamSarapan.setSelectedIndex(0);
        }
    }//GEN-LAST:event_BTN_BatalActionPerformed

    private void BTN_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_HapusActionPerformed
        ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini ?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);

        if (ok == 0) {
            try {
                baris = TBL_Kupon.getSelectedRow();
                value = TBL_Kupon.getValueAt(baris, 0).toString();
                sql = "DELETE FROM database_kupon_breakfast WHERE id_kupon= " + value;
                pst = koneksi.prepareStatement(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
                pst.executeUpdate();
                model = (DefaultTableModel)TBL_Kupon.getModel();
                model.setRowCount(0);
                TF_IdKupon.setText("");
                TF_NoPengunjung.setText("");
                TF_IdKamar.setText("");
                DC_TanggalKupon.setDate(null);
                CB_JamSarapan.setSelectedIndex(0);
                TampilData();
            } catch (SQLException exc) {
                System.err.println(sql);
                System.err.println("Error : " + exc);
            }
        }
    }//GEN-LAST:event_BTN_HapusActionPerformed

    private void BTN_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_UbahActionPerformed
        ok = JOptionPane.showConfirmDialog(null, "Yakin ingin mengubah data ini ? ", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
       
      
        if (ok == 0) {
             if (TF_NoPengunjung.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Tidak ada data yang diubah, mohon ubah data terlebih dahulu", "Ubah Data", JOptionPane.WARNING_MESSAGE);
                TF_NoPengunjung.requestFocus();
            } 
             
            try {
                baris = TBL_Kupon.getSelectedRow();
                value = (TBL_Kupon.getModel().getValueAt(baris, 0).toString());
                sql = "UPDATE database_kupon_breakfast SET no_pengunjung = ?, id_kamar_pengunjung = ?, tanggal_kupon = ?, jam_sarapan = ? WHERE id_kupon= " + value;       
                pst = koneksi.prepareStatement(sql);
                pst.setString(1,TF_NoPengunjung.getText());
                pst.setString(2, TF_IdKamar.getText());
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                date = sdf.format(DC_TanggalKupon.getDate());
                pst.setString(3, date);
                jam = CB_JamSarapan.getSelectedItem().toString();
                pst.setString(4, jam);
                JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Ubah data", JOptionPane.INFORMATION_MESSAGE); 
                TF_IdKupon.requestFocus();
                pst.executeUpdate();
               
                model.setRowCount(0);
                
                TampilData();
                TF_IdKupon.setText("");
                TF_NoPengunjung.setText("");
                 TF_IdKamar.setText("");
                DC_TanggalKupon.setDate(null);
                CB_JamSarapan.setSelectedIndex(0);
            }
                catch(Exception exc) {
                    System.err.println("Error : " + exc);
                }
            }
        
    }//GEN-LAST:event_BTN_UbahActionPerformed

    @SuppressWarnings("empty-statement")
    private void BTN_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SimpanActionPerformed
        id_kupon = TF_IdKupon.getText();
        no_pengunjung = TF_NoPengunjung.getText();
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        id_kamar = TF_IdKamar.getText();
        theDate = sdf.format(DC_TanggalKupon.getDate());
        jam_sarapan = CB_JamSarapan.getSelectedItem().toString();
        
        
        if (TF_IdKupon.getText().trim().equals("") || TF_NoPengunjung.getText().trim().equals("") || TF_IdKamar.getText().trim().equals("") || TF_IdKupon.getText().trim().equals("") || theDate.equalsIgnoreCase("") || CB_JamSarapan.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Ada data yang masih kosong.Mohon lengkapi data terlebih dahulu !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
            BTN_Ubah.setEnabled(false);
            BTN_Hapus.setEnabled(false);
            BTN_Batal.setEnabled(false);
            
        if (CB_JamSarapan.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Tidak boleh memilih -Pilih- !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
        }  
        }
        
     
        else {
            try {
                stat = koneksi.createStatement();
                data = stat.executeQuery("SELECT * FROM database_kupon_breakfast WHERE id_kupon = " + TF_IdKupon.getText());

                if (data.next()) {
                    JOptionPane.showMessageDialog(null, "Id kupon [" + id_kupon + "] telah terinput, mohon tuliskan id kupon lainnya !", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
                    TF_IdKupon.requestFocus();
                    BTN_Ubah.setEnabled(false);
                    BTN_Hapus.setEnabled(false);
                    BTN_Batal.setEnabled(false);
                }
                else {
                   
                    sql = "INSERT INTO database_kupon_breakfast VALUES ("
                    + "'" + id_kupon + "'"
                    + ",'" + no_pengunjung + "'"
                    + ",'" + id_kamar + "'"
                    + ",'" + theDate + "'"
                    + ",'" + jam_sarapan + "')";

                    BTN_Ubah.setEnabled(true);
                    BTN_Hapus.setEnabled(true);
                    BTN_Batal.setEnabled(true);

                    stat.executeUpdate(sql);
                     JOptionPane.showMessageDialog(null, "Data berhasil di simpan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                    TF_IdKupon.setText("");
                    TF_NoPengunjung.setText("");
                    TF_IdKamar.setText("");
                    DC_TanggalKupon.setCalendar(null);
                    CB_JamSarapan.setSelectedIndex(0);
                   
                    TampilData();

                }
                stat.close();

            }
            catch(Exception exc) {
                System.err.println("Terjadi kesalahan : " + exc);
            }
        }
    }//GEN-LAST:event_BTN_SimpanActionPerformed

      private void TampilData() {
        model = new DefaultTableModel();
        model.addColumn("Id Kupon");
        model.addColumn("No Pengunjung");
        model.addColumn("Id Kamar");
        model.addColumn("Tanggal Kupon");
        model.addColumn("Jam Sarapan");
        TBL_Kupon.setModel(model);

        try {
            stat = koneksi.createStatement();
            data = stat.executeQuery("SELECT * FROM database_kupon_breakfast");
            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("id_kupon"),
                    data.getString("no_pengunjung"),
                    data.getString("id_kamar_pengunjung"),
                    data.getString("tanggal_kupon"),
                    data.getString("jam_sarapan"),
                });
                TBL_Kupon.setModel(model);
         
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
            System.out.println("Form_kupon_sarapan berhasil dikoneksikan ke database_kupon_sarapan");
        } catch (SQLException se) {
            System.out.println("Form_kupon_sarapan gagal dikoneksikan ke database_kupon_sarapan \n" + "Masalah yang dihadapi adalah : " + se);
        } catch (Exception e) {

        }
    }
    private void BTN_BalikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BalikActionPerformed
        this.setVisible(false);
        new HomePage().setVisible(true);
          System.out.print("Form dibalikan ke home page\n");
    }//GEN-LAST:event_BTN_BalikActionPerformed

    private void TBL_KuponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_KuponMouseClicked
         baris = TBL_Kupon.getSelectedRow();
        modela = TBL_Kupon.getModel();
        if (baris != -1) {
            TF_IdKupon.setText(modela.getValueAt(baris, 0).toString());
            TF_NoPengunjung.setText(modela.getValueAt(baris, 1).toString());
            TF_IdKamar.setText(modela.getValueAt(baris, 2).toString());
            DC_TanggalKupon.setDate(getTanggalFromTable(TBL_Kupon,3));
           
            jam = modela.getValueAt(baris, 4).toString();
            switch(jam) {
                case "07:30:00" -> CB_JamSarapan.setSelectedIndex(1);

                case "08:00:00" -> CB_JamSarapan.setSelectedIndex(2);

                case "08:30:00" -> CB_JamSarapan.setSelectedIndex(3);

                case "09:00:00" -> CB_JamSarapan.setSelectedIndex(4);

            }
        }
    }//GEN-LAST:event_TBL_KuponMouseClicked


     public static Date getTanggalFromTable (JTable table, int kolom ) {
        tabel = table;
         str_tgl = String.valueOf(tabel.getValueAt(tabel.getSelectedRow(), kolom));
        tanggal = null;
        try {
            tanggal = new SimpleDateFormat("yyyy-MM-dd").parse(str_tgl);
            
        } catch(ParseException ex) {
            java.util.logging.Logger.getLogger(Form_kupon_breakfast.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tanggal;
    }
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_kupon_breakfast().setVisible(true);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Balik;
    private javax.swing.JButton BTN_Batal;
    private javax.swing.JButton BTN_Hapus;
    private javax.swing.JButton BTN_Simpan;
    private javax.swing.JButton BTN_Ubah;
    private javax.swing.JComboBox<String> CB_JamSarapan;
    private com.toedter.calendar.JDateChooser DC_TanggalKupon;
    private javax.swing.JTable TBL_Kupon;
    private javax.swing.JTextField TF_IdKamar;
    private javax.swing.JTextField TF_IdKupon;
    private javax.swing.JTextField TF_NoPengunjung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

 
}
