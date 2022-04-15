package tugasbesar;
import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Form_reservasi extends javax.swing.JFrame {
public static Connection koneksi;
public static ResultSet data;
public static String sql, kode_reserve,id_pengunjung,kode_kamar,id_kupon,tanggal_masuk,tanggal_keluar,value,date1,date2,date, hari;
public static int jumlah_anak, jumlah_dewasa, ok, baris;
public static DefaultTableModel model;
public static Statement stat;
public static PreparedStatement pst;
public static Boolean a;
public static long diffInMilies,diff;
public static SimpleDateFormat sdf;
public static Date tk,tm;

    
    public Form_reservasi() {
        initComponents();
        KoneksiDatabase();
        TampilData();
        setLocationRelativeTo(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TF_KodeKamar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_KodeReservasi = new javax.swing.JTextField();
        BTN_Hapus = new javax.swing.JButton();
        BTN_Ubah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_Reservasi = new javax.swing.JTable();
        BTN_Simpan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TF_IdKupon = new javax.swing.JTextField();
        BTN_Balik = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TF_Hari = new javax.swing.JTextField();
        BTN_Batal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        DC_TanggalMasuk = new com.toedter.calendar.JDateChooser();
        DC_TanggalKeluar = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        CB_Dewasa = new javax.swing.JComboBox<>();
        CB_Anak = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Reservasi");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/tugasbesar/logo.jpg")).getImage());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Kode reservasi");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Id kupon sarapan");

        TF_KodeKamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_KodeKamar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TF_KodeKamar.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal masuk");

        TF_KodeReservasi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_KodeReservasi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TF_KodeReservasi.setMargin(new java.awt.Insets(2, 0, 2, 2));

        BTN_Hapus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Hapus.setText("Hapus");
        BTN_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_HapusActionPerformed(evt);
            }
        });

        BTN_Ubah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Ubah.setText("Ubah");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Form Reservasi  Hotel Harapan Bangsa");
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 29));

        TBL_Reservasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode reservasi", "Kode kamar", "Jumlah anak", "Jumlah dewasa", "Tanggal masuk", "Tanggal keluar", "Hari menginap", "Id kupon sarapan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TBL_Reservasi.getTableHeader().setReorderingAllowed(false);
        TBL_Reservasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_ReservasiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBL_Reservasi);

        BTN_Simpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Simpan.setText("Simpan");
        BTN_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SimpanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Kode kamar");

        TF_IdKupon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_IdKupon.setMargin(new java.awt.Insets(2, 0, 2, 2));

        BTN_Balik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Balik.setText("Balik");
        BTN_Balik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BalikActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal keluar");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Jumlah Anak");

        TF_Hari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_Hari.setMargin(new java.awt.Insets(2, 0, 2, 2));

        BTN_Batal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_Batal.setText("Batal");
        BTN_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BatalActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Hari menginap");

        DC_TanggalMasuk.setDateFormatString("yyyy/MM/dd");
        DC_TanggalMasuk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N


        DC_TanggalKeluar.setDateFormatString("yyyy/MM/dd");
        DC_TanggalKeluar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Jumlah Dewasa");

        CB_Dewasa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CB_Dewasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        CB_Anak.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CB_Anak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih-", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TF_KodeReservasi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DC_TanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_Anak, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_IdKupon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_Hari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_KodeKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Dewasa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DC_TanggalKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_Balik)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_Simpan)
                        .addGap(52, 52, 52)
                        .addComponent(BTN_Ubah)
                        .addGap(52, 52, 52)
                        .addComponent(BTN_Hapus)
                        .addGap(52, 52, 52)
                        .addComponent(BTN_Batal)
                        .addGap(256, 256, 256))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(TF_KodeReservasi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(DC_TanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(CB_Anak, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_IdKupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TF_KodeKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DC_TanggalKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(CB_Dewasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(TF_Hari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Simpan)
                    .addComponent(BTN_Ubah)
                    .addComponent(BTN_Hapus)
                    .addComponent(BTN_Batal))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_Balik)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SimpanActionPerformed
        kode_reserve = TF_KodeReservasi.getText();
        kode_kamar = TF_KodeKamar.getText();
        CB_Anak.getSelectedItem();
        CB_Dewasa.getSelectedItem();

        id_kupon = TF_IdKupon.getText();
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        tanggal_masuk = sdf.format(DC_TanggalMasuk.getDate());
        tanggal_keluar = sdf.format(DC_TanggalKeluar.getDate());
        
        
        tm = DC_TanggalMasuk.getDate();
        tk = DC_TanggalKeluar.getDate();
        diffInMilies = Math.abs(tk.getTime() - tm.getTime());
        diff = TimeUnit.DAYS.convert(diffInMilies, TimeUnit.MILLISECONDS);
        date = String.valueOf(diff);
        TF_Hari.setText(String.valueOf(date));
        
           if (TF_KodeReservasi.getText().trim().equals("") || TF_KodeKamar.getText().trim().equals("") || TF_IdKupon.getText().trim().equals("") ||CB_Anak.getSelectedItem() == null|| CB_Dewasa.getSelectedItem() ==  null) {
            JOptionPane.showMessageDialog(null, "Mohon lengkapi data terlebih dahulu", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
            BTN_Ubah.setEnabled(false);
            BTN_Hapus.setEnabled(false);
            BTN_Batal.setEnabled(false);
        }
           
           if (tk.getTime() == tm.getTime()) {
             JOptionPane.showMessageDialog(null, "Tanggal masuk tidak boleh sama dengan tanggal keluar", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
             BTN_Ubah.setEnabled(false);
             BTN_Hapus.setEnabled(false);
             BTN_Batal.setEnabled(false);
           }
           
            if (tk.getTime() < tm.getTime()) {
             JOptionPane.showMessageDialog(null, "Tanggal keluar tidak boleh lebih awal dari tanggal masuk", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
             BTN_Ubah.setEnabled(false);
             BTN_Hapus.setEnabled(false);
             BTN_Batal.setEnabled(false);
           } 
            
         
             
        else {
            try {
                stat = koneksi.createStatement();
                data = stat.executeQuery("SELECT * FROM database_reservasi WHERE kode_reservasi = " + TF_KodeReservasi.getText());

                if (data.next()) {
                    JOptionPane.showMessageDialog(null, "Kode rservasi [" + kode_reserve + "]sudah ada, mohon tuliskan kode reservasi  lainnya", "PERHATIKAN", JOptionPane.WARNING_MESSAGE);
                    TF_KodeReservasi.requestFocus();
                    BTN_Ubah.setEnabled(false);
                    BTN_Hapus.setEnabled(false);
                    BTN_Batal.setEnabled(false);
                } 
                
           
                else {
                    sql = "INSERT INTO database_reservasi VALUES ("
                    + "" + kode_reserve + ""
                    + ",'" + kode_kamar + "'"
                    + ",'" + CB_Anak.getSelectedItem()  + "'"
                    + ",'" + CB_Dewasa.getSelectedItem() + "'"
                    + ",'" + tanggal_masuk + "'"    
                    + ",'" + tanggal_keluar + "'"   
                    + ",'" + date + "'"   
                    + ",'" + id_kupon + "')";
                    
                    BTN_Ubah.setEnabled(true);
                    BTN_Hapus.setEnabled(true);
                    BTN_Batal.setEnabled(true);
                    
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                    stat.executeUpdate(sql);
                    TF_KodeReservasi.setText("");
                    TF_KodeKamar.setText("");
                    TF_Hari.setText("");
                    CB_Anak.setSelectedIndex(0);
                    CB_Dewasa.setSelectedIndex(0);
                    DC_TanggalMasuk.setCalendar(null);
                    DC_TanggalKeluar.setCalendar(null);
                    TF_Hari.setText("");
                    TF_IdKupon.setText("");
                    
                    TampilData();

                }
                stat.close();

            }
            catch(Exception exc) {
                System.err.println("Terjadi kesalahan : " + exc);
            }
        }
    }//GEN-LAST:event_BTN_SimpanActionPerformed

    private void TBL_ReservasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_ReservasiMouseClicked
        baris = TBL_Reservasi.getSelectedRow();
        TableModel model = TBL_Reservasi.getModel();
        
        if (baris != -1) {
            TF_KodeReservasi.setText(TBL_Reservasi.getValueAt(baris,0).toString());
            TF_KodeKamar.setText(TBL_Reservasi.getValueAt(baris,1).toString());
            CB_Anak.setSelectedItem(TBL_Reservasi.getValueAt(baris,2).toString());
            CB_Dewasa.setSelectedItem(TBL_Reservasi.getValueAt(baris,3).toString());
            DC_TanggalMasuk.setDate(getTanggalFromTable(TBL_Reservasi,4));
            DC_TanggalKeluar.setDate(getTanggalFromTable(TBL_Reservasi,5));
            TF_Hari.setText(TBL_Reservasi.getValueAt(baris,6).toString());
            TF_IdKupon.setText(TBL_Reservasi.getValueAt(baris,7).toString());
        }
        
       
    }//GEN-LAST:event_TBL_ReservasiMouseClicked

    private void BTN_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_UbahActionPerformed
        ok = JOptionPane.showConfirmDialog(null, "Yakin ingin mengubah data ini ? ", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (ok == 0) {
            if (TF_KodeReservasi.getText().trim().equals("")) {
                  JOptionPane.showMessageDialog(null, "Tidak ada data yang diubah, mohon ubah data terlebih dahulu", "Ubah Data", JOptionPane.WARNING_MESSAGE);
                TF_KodeReservasi.requestFocus();
            } 
            else {
               
            try {
                baris = TBL_Reservasi.getSelectedRow();
                value = (TBL_Reservasi.getModel().getValueAt(baris, 0).toString());
                Date tm = DC_TanggalMasuk.getDate();
                 Date tk = DC_TanggalKeluar.getDate();
                 diffInMilies = Math.abs(tk.getTime() - tm.getTime());
                 diff = TimeUnit.DAYS.convert(diffInMilies, TimeUnit.MILLISECONDS);
                 date = String.valueOf(diff);
                TF_Hari.setText(String.valueOf(date));
                sql = "UPDATE database_reservasi SET kode_kamar = ?, jumlah_anak = ?, jumlah_dewasa = ?, tanggal_masuk = ?, tanggal_keluar = ?,hari_menginap = ?, id_kupon_sarapan = ? WHERE kode_reservasi =  " + value;
                pst = koneksi.prepareStatement(sql);
                pst.setString(1,TF_KodeKamar.getText());
                pst.setString(2, CB_Anak.getSelectedItem().toString());
                pst.setString(3, CB_Dewasa.getSelectedItem().toString());
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                date1 = sdf.format(DC_TanggalMasuk.getDate());
                pst.setString(4, date1);
                date2 = sdf.format(DC_TanggalKeluar.getDate());
                pst.setString(5, date2);
                String dateing = String.valueOf(date);
                pst.setString(6,dateing);
                
                pst.setString(7, TF_IdKupon.getText());
                JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Ubah data", JOptionPane.INFORMATION_MESSAGE); 
                TF_KodeReservasi.requestFocus();
                pst.executeUpdate();
                
                model.setRowCount(0);
               
                  TF_KodeReservasi.setText("");
                  TF_KodeKamar.setText("");
                  CB_Anak.setSelectedIndex(0);
                  CB_Dewasa.setSelectedIndex(0);
                  DC_TanggalMasuk.setDate(null);
                  DC_TanggalKeluar.setDate(null);
                  TF_Hari.setText("");
                   TF_IdKupon.setText("");
                   TampilData();
                
            }
            
            catch(Exception exc) {
                System.err.println("Error : " + exc);
            }
            }
            }
    }//GEN-LAST:event_BTN_UbahActionPerformed

    private void BTN_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_HapusActionPerformed
        ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini ?" , "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        
        if (ok == 0) {
            try {
                baris = TBL_Reservasi.getSelectedRow();
                value = TBL_Reservasi.getValueAt(baris, 0).toString();
                sql = "DELETE FROM database_reservasi WHERE kode_reservasi = " + value;
                pst = koneksi.prepareStatement(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
                pst.executeUpdate();
                 model = (DefaultTableModel)TBL_Reservasi.getModel();
                model.setRowCount(0);
                TampilData();
                TF_KodeReservasi.setText("");
                TF_KodeKamar.setText("");
                CB_Anak.setSelectedIndex(0);
                CB_Dewasa.setSelectedIndex(0);
                DC_TanggalMasuk.setDate(null);
                DC_TanggalKeluar.setDate(null);
                TF_Hari.setText("");
                TF_IdKupon.setText("");
                
            }
            
            catch (SQLException exc) {
                System.err.println(sql);
                System.err.println("Error : " + exc);
            }
        }
    }//GEN-LAST:event_BTN_HapusActionPerformed

    private void BTN_BalikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BalikActionPerformed
        this.setVisible(false);
        new HomePage().setVisible(true);
       System.out.print("Form dibalikan ke home page\n");
    }//GEN-LAST:event_BTN_BalikActionPerformed

    private void BTN_BatalActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin membatalkan data ini ?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
             JOptionPane.showMessageDialog(null, "Data berhasil di batalkan", "Hapus data", JOptionPane.INFORMATION_MESSAGE);
             TF_KodeReservasi.setText("");
            TF_KodeKamar.setText("");
            CB_Anak.setSelectedIndex(0);
            CB_Dewasa.setSelectedIndex(0);
            DC_TanggalMasuk.setDate(null);
            DC_TanggalKeluar.setDate(null);
            TF_Hari.setText("");
            TF_IdKupon.setText("");
    }

    }
      private void TampilData() {
       model = new DefaultTableModel();
       model.addColumn("Kode reservasi");
       model.addColumn("Kode Kamar");
       model.addColumn("Jumlah Anak");
       model.addColumn("Jumlah Dewasa");
       model.addColumn("Tanggal masuk");
       model.addColumn("Tanggal keluar");
       model.addColumn("Hari menginap");
       model.addColumn("Id kupon sarapan");
       TBL_Reservasi.setModel(model);
       
       try {
           stat = koneksi.createStatement();
           data = stat.executeQuery("SELECT * FROM database_reservasi");
           while (data.next()) {
               model.addRow(new Object []{
                   data.getString("kode_reservasi"),
                   data.getString("kode_kamar"),
                   data.getString("jumlah_anak"),
                   data.getString("jumlah_dewasa"),
                   data.getString("tanggal_masuk"),
                   data.getString("tanggal_keluar"),
                   data.getString("hari_menginap"),
                   data.getString("id_kupon_sarapan")
               });
               TBL_Reservasi.setModel(model);
           }
       }
       catch (Exception e) {
           System.err.println("Terjadi kesalahan : " + e);
       }
   }
      
      
        private void KoneksiDatabase() {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
          
       }
       catch (ClassNotFoundException cnf) {
           
       }
       try {
           koneksi = DriverManager.getConnection("jdbc:mysql://localhost/database_hotel", "root", "");
           System.out.println("Form_reservasi berhasil dikoneksikan ke database_reservasi");
       }
       catch (SQLException se) {
           System.out.println("Form_reservasi gagal dikoneksikan ke database_reservasi \n" + "Masalah yang dihadapi adalah : " + se);
       }
       catch (Exception e) {
           
       }
   }   
        
  public static Date getTanggalFromTable (JTable table, int kolom ) {
        JTable tabel = table;
        String str_tgl = String.valueOf(tabel.getValueAt(tabel.getSelectedRow(), kolom));
        Date tanggal = null;
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
                new Form_reservasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Balik;
    private javax.swing.JButton BTN_Batal;
    private javax.swing.JButton BTN_Hapus;
    private javax.swing.JButton BTN_Simpan;
    private javax.swing.JButton BTN_Ubah;
    private javax.swing.JComboBox<String> CB_Anak;
    private javax.swing.JComboBox<String> CB_Dewasa;
    private com.toedter.calendar.JDateChooser DC_TanggalKeluar;
    private com.toedter.calendar.JDateChooser DC_TanggalMasuk;
    private javax.swing.JTable TBL_Reservasi;
    private javax.swing.JTextField TF_Hari;
    private javax.swing.JTextField TF_IdKupon;
    private javax.swing.JTextField TF_KodeKamar;
    private javax.swing.JTextField TF_KodeReservasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
