package view;

import java.sql.Connection;
import java.util.Date;
import java.text.DateFormat;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Peminjam;


public class ViewPeminjam extends javax.swing.JFrame {
private DefaultTableModel tabel;

    public ViewPeminjam() {
        initComponents();
        String[] judul={"Kode Buku","Kode Anggota","Tanggal Pinjam","Tanggal Kembali","Lama Pinjam","Jumlah Denda"}; //untuk nama pada tabel
            tabel = new DefaultTableModel (judul,0); // untuk penamaan pada tabel
            jTable1.setModel(tabel);
        tampil();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Kode_buku = new javax.swing.JLabel();
        Kode_anggota = new javax.swing.JLabel();
        Tanggal_pinjam = new javax.swing.JLabel();
        Tanggaal_kembali = new javax.swing.JLabel();
        Lama_pinjam = new javax.swing.JLabel();
        Denda = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        TPinjam = new javax.swing.JTextField();
        Tkembali = new javax.swing.JTextField();
        Lama_pinjamm = new javax.swing.JTextField();
        Dendaa = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        Hitung = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Kode_buku.setText("Kode buku");

        Kode_anggota.setText("Kode Anggota");

        Tanggal_pinjam.setText("Tanggal Pinjam");

        Tanggaal_kembali.setText("Tanggal kembali");

        Lama_pinjam.setText("Lama Pinjam");

        Denda.setText("Denda");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        TPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPinjamActionPerformed(evt);
            }
        });

        Tkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TkembaliActionPerformed(evt);
            }
        });

        Dendaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DendaaActionPerformed(evt);
            }
        });

        Simpan.setForeground(new java.awt.Color(255, 102, 102));
        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        Ubah.setForeground(new java.awt.Color(255, 102, 102));
        Ubah.setText("UBAH");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });

        Hapus.setForeground(new java.awt.Color(255, 102, 102));
        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Kembali.setForeground(new java.awt.Color(255, 102, 102));
        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        Hitung.setForeground(new java.awt.Color(255, 102, 102));
        Hitung.setText("HITUNG");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 153));
        jLabel1.setText("PEMINJAMAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Tanggaal_kembali)
                                .addComponent(Kode_buku, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Kode_anggota, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Tanggal_pinjam, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Tkembali)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TPinjam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Hitung))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(137, 137, 137)
                                    .addComponent(Simpan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ubah)
                                    .addGap(42, 42, 42)
                                    .addComponent(Hapus))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Lama_pinjam)
                                        .addComponent(Denda))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Dendaa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lama_pinjamm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(509, 509, 509)
                        .addComponent(Kembali)))
                .addContainerGap(116, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lama_pinjam)
                            .addComponent(Lama_pinjamm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kode_buku))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Kode_anggota)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tanggal_pinjam)
                            .addComponent(TPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tanggaal_kembali)
                            .addComponent(Tkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dendaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Denda))
                        .addGap(89, 89, 89)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hitung)
                    .addComponent(Simpan)
                    .addComponent(Ubah)
                    .addComponent(Hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(Kembali)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        Peminjam peminjam = new Peminjam ();
        peminjam.setKode_buku(Kode_buku.getText());
        peminjam.setKode_anggota(Kode_anggota.getText());
        peminjam.setTanggal_pinjam(Tanggal_pinjam.getText());
        peminjam.setTanggal_kembali(Tkembali.getText());
        peminjam.setLama_pinjam(Lama_pinjamm.getText());
        peminjam.setDenda(Integer.parseInt(Denda.getText()));
        
        peminjam.simpan();
     //   peminjam.UPBuku();
        tampil();
    }//GEN-LAST:event_SimpanActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        Kode_buku.setText(tabel.getValueAt(selectedRow, 0).toString());
        Kode_anggota.setText(tabel.getValueAt(selectedRow, 1).toString());
        Tanggal_pinjam.setText(tabel.getValueAt(selectedRow, 2).toString());
        Tanggaal_kembali.setText(tabel.getValueAt(selectedRow, 3).toString());
        Lama_pinjam.setText(tabel.getValueAt(selectedRow, 4).toString());
        Denda.setText(tabel.getValueAt(selectedRow, 0).toString());
        
        
    }//GEN-LAST:event_UbahActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow(); // pengambilan urutan baris dalam tabel
        if(selectedRow >= 0 ){
            String idHapus = jTable1.getValueAt(selectedRow, 0).toString(); //ngambil data kode buku yang di klik dalam tabel
            Peminjam peminjam = new Peminjam ();
            peminjam.setKode_buku(idHapus);
            peminjam.hapusdata();
            tampil();
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu ();
        
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_KembaliActionPerformed

    private void TPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPinjamActionPerformed
        // TODO add your handling code here:
     SimpleDateFormat FormatTanggal  = new SimpleDateFormat("dd MM yyyy");
     //Tanggal_pinjam = FormatTanggal.format(Tanggal_pinjam.get());
    }//GEN-LAST:event_TPinjamActionPerformed

    private void TkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TkembaliActionPerformed

     DateFormat df  = new SimpleDateFormat("dd MM yyyy");
    
        try{
            //konversi string ke tanggal
            Date TanggalCEKIN = df.parse(TPinjam.getText());
            Date TanggalCEKOUT = df.parse(Tkembali.getText());
            //konversi ke milidetik
            long Hari1 = TanggalCEKIN.getTime();
            long Hari2 = TanggalCEKOUT.getTime();
            long diff = Hari2-Hari1;
            long lama = diff/(24*60*60*1000); //1 hari = 24 jam x 60 menit x 60 sekon x 1000 milidetik)
            Lama_pinjamm.setText(Long.toString(lama));
            
            if(lama<=7){
                Dendaa.setText("0");
            }
            else{
                lama = lama-7;
                long den = lama * 1000;
                Dendaa.setText(Long.toString(den));
            }
        }catch(ParseException e){}
        

    }//GEN-LAST:event_TkembaliActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HitungActionPerformed

    private void DendaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DendaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DendaaActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPeminjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Denda;
    private javax.swing.JTextField Dendaa;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Hitung;
    private javax.swing.JButton Kembali;
    private javax.swing.JLabel Kode_anggota;
    private javax.swing.JLabel Kode_buku;
    private javax.swing.JLabel Lama_pinjam;
    private javax.swing.JTextField Lama_pinjamm;
    private javax.swing.JButton Simpan;
    private javax.swing.JTextField TPinjam;
    private javax.swing.JLabel Tanggaal_kembali;
    private javax.swing.JLabel Tanggal_pinjam;
    private javax.swing.JTextField Tkembali;
    private javax.swing.JButton Ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
Connection koneksi;
    Statement statement;
    
    
//membuat fungsi tampil
        private  void tampil (){

            int jumlah = jTable1.getRowCount();//
            for (int i=0; i<jumlah; i++){
                tabel.removeRow(0);
            }
         try {  
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan2","root","");
            ResultSet data = koneksi.createStatement().executeQuery("SELECT * FROM  peminjam`"); // nampil data
            while (data.next()){
                String [] dat = {data.getString(1),data.getString(2),data.getString(3),data.getString(4),data.getString(5), data.getString(6)};        
                tabel.addRow (dat); // ngeloop untuk memasukan ke dalam tabel perbarisnya
        }
        }catch (SQLException ex) {
               System.out.print(ex);
        }
        }



}
