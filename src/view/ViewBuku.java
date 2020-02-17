package view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Buku;



public class ViewBuku extends javax.swing.JFrame {
    private DefaultTableModel tabel;

    public ViewBuku() {
        initComponents();
            String[] judul={"Kode Buku","Judul Buku","Pengarang","Tahun Terbit","Penerbit","Jumlah Buku"}; //untuk nama pada tabel
            tabel = new DefaultTableModel (judul,0); // untuk penamaan pada tabel
            jTable1.setModel(tabel);
        tampil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JudulBuku = new javax.swing.JLabel();
        Pengarang_ = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Penerbit_ = new javax.swing.JLabel();
        JumlahBuku = new javax.swing.JLabel();
        Kode_buku = new javax.swing.JTextField();
        Judul_buku = new javax.swing.JTextField();
        Pengarang = new javax.swing.JTextField();
        Tahun_terbit = new javax.swing.JTextField();
        Penerbit = new javax.swing.JTextField();
        Jumlah_buku = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Ubah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Cari = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Keluar = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Kode Buku");

        JudulBuku.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        JudulBuku.setForeground(new java.awt.Color(255, 102, 102));
        JudulBuku.setText("Judul Buku");

        Pengarang_.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Pengarang_.setForeground(new java.awt.Color(255, 102, 102));
        Pengarang_.setText("Pengarang");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Tahun Terbit");

        Penerbit_.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Penerbit_.setForeground(new java.awt.Color(255, 102, 102));
        Penerbit_.setText("Penerbit");

        JumlahBuku.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        JumlahBuku.setForeground(new java.awt.Color(255, 102, 102));
        JumlahBuku.setText("Jumlah Buku");

        Kode_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kode_bukuActionPerformed(evt);
            }
        });

        Simpan.setBackground(new java.awt.Color(204, 204, 204));
        Simpan.setForeground(new java.awt.Color(255, 102, 102));
        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

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

        Ubah.setBackground(new java.awt.Color(204, 204, 204));
        Ubah.setForeground(new java.awt.Color(255, 102, 102));
        Ubah.setText("UBAH");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });

        Hapus.setBackground(new java.awt.Color(204, 204, 204));
        Hapus.setForeground(new java.awt.Color(255, 102, 102));
        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Cari.setText("CARI");
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });

        jLabel10.setText("KEYWORD");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Keluar.setText("KELUAR");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        kembali.setText("KEMBALI");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("BUKU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Reset.setForeground(new java.awt.Color(255, 102, 102));
        Reset.setText("RESET");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JudulBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pengarang_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Kode_buku, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(Judul_buku)
                            .addComponent(Pengarang))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Penerbit_)
                            .addComponent(jLabel5)
                            .addComponent(JumlahBuku))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reset)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Penerbit, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(Jumlah_buku)
                                .addComponent(Tahun_terbit)))))
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Simpan)
                        .addGap(42, 42, 42)
                        .addComponent(Ubah)
                        .addGap(56, 56, 56)
                        .addComponent(Hapus))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel10)
                        .addGap(37, 37, 37)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Cari)
                        .addGap(60, 60, 60)
                        .addComponent(Keluar)
                        .addGap(34, 34, 34)
                        .addComponent(kembali)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Kode_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JudulBuku)
                            .addComponent(Judul_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Penerbit_))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JumlahBuku)
                            .addComponent(Pengarang_)
                            .addComponent(Pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tahun_terbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jumlah_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Simpan)
                    .addComponent(Ubah)
                    .addComponent(Hapus)
                    .addComponent(Reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cari)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Keluar)
                    .addComponent(kembali))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Kode_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kode_bukuActionPerformed
      
    }//GEN-LAST:event_Kode_bukuActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        Kode_buku.setText(tabel.getValueAt(selectedRow, 0).toString()); // pengambilan data dari tabel sesuai yang di klik
        Judul_buku.setText(tabel.getValueAt(selectedRow, 1).toString());
        Pengarang.setText(tabel.getValueAt(selectedRow, 2).toString());
        Tahun_terbit.setText(tabel.getValueAt(selectedRow, 3).toString());
        Penerbit.setText(tabel.getValueAt(selectedRow, 4).toString());
        Jumlah_buku.setText(tabel.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_UbahActionPerformed

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_CariActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        
//        LogikaSimpan simpan = new LogikaSimpan();
           //    simpan.LogikaSimpan(input);//menyimpandata 
           Buku buku = new Buku(); //inisialisasi kelas buku
           buku.setKode_buku(Kode_buku.getText());
           buku.setJudul_buku(Judul_buku.getText()); //buat nge set data , pemanggilan database ada d buku
           buku.setPengarang(Pengarang.getText());
           buku.setTahun_terbit(Tahun_terbit.getText());
           buku.setPenerbit(Penerbit.getText());
           buku.setJumlah_buku(Integer.parseInt(Jumlah_buku.getText()));
           
           
           buku.simpan(); // memanggil fungsi simpan di kelas buku
        tampil();
    }//GEN-LAST:event_SimpanActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
//        Menu menu = new Menu ();
        
  //      menu.setVisible(true);
        Menu menu = new Menu ();
        
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow(); // pengambilan urutan baris dalam tabel
        if(selectedRow >= 0 ){
            String idHapus = jTable1.getValueAt(selectedRow, 0).toString(); //ngambil data kode buku yang di klik dalam tabel
            Buku buku = new Buku (); 
            buku.setKode_buku(idHapus); //od hapus untuk ngisi parameter d buku
            buku.hapusdata(); //mengambil dari yang ada d class buku
            tampil();
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        Kode_buku.setText("");
        Judul_buku.setText("");
        Pengarang.setText("");
        Tahun_terbit.setText("");
        Penerbit.setText("");
        Jumlah_buku.setText("");
    }//GEN-LAST:event_ResetActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cari;
    private javax.swing.JButton Hapus;
    private javax.swing.JLabel JudulBuku;
    private javax.swing.JTextField Judul_buku;
    private javax.swing.JLabel JumlahBuku;
    private javax.swing.JTextField Jumlah_buku;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField Kode_buku;
    private javax.swing.JTextField Penerbit;
    private javax.swing.JLabel Penerbit_;
    private javax.swing.JTextField Pengarang;
    private javax.swing.JLabel Pengarang_;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Simpan;
    private javax.swing.JTextField Tahun_terbit;
    private javax.swing.JButton Ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton kembali;
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
            ResultSet data = koneksi.createStatement().executeQuery("SELECT * FROM  buku`"); // nampil data
            while (data.next()){
                String [] dat = {data.getString(1),data.getString(2),data.getString(3),data.getString(4),data.getString(5), data.getString(6)};        
                tabel.addRow (dat); // ngeloop untuk memasukan ke dalam tabel perbarisnya
        }
        }catch (SQLException ex) {
               System.out.print(ex);
        }
        }
    
}
