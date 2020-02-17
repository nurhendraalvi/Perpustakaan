
package model;


public class Peminjam extends Buku {
    
    private String Kode_buku;
    private String Kode_anggota;
    private String Tanggal_pinjam;
    private String Tanggal_kembali;
    private int Lama_pinjam;
    private int Denda;
    private String Kode_petugas;
    private int stok;
    private Database db;

    public Peminjam() {
    }

    public Peminjam(String Kode_buku, String Kode_anggota, String Tanggal_pinjam, String Tanggal_kembali, int Lama_pinjam, int Denda, String Kode_petugas) {
        this.Kode_buku = Kode_buku;
        this.Kode_anggota = Kode_anggota;
        this.Tanggal_pinjam = Tanggal_pinjam;
        this.Tanggal_kembali = Tanggal_kembali;
        this.Lama_pinjam = Lama_pinjam;
        this.Denda = Denda;
        this.Kode_petugas = Kode_petugas;
    }

    public String getKode_buku() {
        return Kode_buku;
    }

    public void setKode_buku(String Kode_buku) {
        this.Kode_buku = Kode_buku;
    }

    public String getKode_anggota() {
        return Kode_anggota;
    }

    public void setKode_anggota(String Kode_anggota) {
        this.Kode_anggota = Kode_anggota;
    }

    public String getTanggal_pinjam() {
        return Tanggal_pinjam;
    }

    public void setTanggal_pinjam(String Tanggal_pinjam) {
        this.Tanggal_pinjam = Tanggal_pinjam;
    }

    public String getTanggal_kembali() {
        return Tanggal_kembali;
    }

    public void setTanggal_kembali(String Tanggal_kembali) {
        this.Tanggal_kembali = Tanggal_kembali;
    }

    public int getLama_pinjam() {
        return Lama_pinjam;
    }

    public void setLama_pinjam(String Tanggal_harus_kembali) {
        this.Lama_pinjam = Lama_pinjam;
    }

    public int getDenda() {
        return Denda;
    }

    public void setDenda(int Denda) {
        this.Denda = Denda;
    }

    public String getKode_petugas() {
        return Kode_petugas;
    }

    public void setKode_petugas(String Kode_petugas) {
        this.Kode_petugas = Kode_petugas;
    }
    
    private int getStok(){
        stok = getJumlah_buku() - 1;
        return stok;
    }
    public String simpan (){
         db = new Database();
         String input  = "replace INTO peminjam VALUES ('"+Kode_buku+"','"+Kode_anggota+"','"+Tanggal_pinjam+"','"+Tanggal_kembali+"','"+Lama_pinjam+"','"+Denda+"')";
         db.setSql(input);
         db.LogikaSimpan();
         return input;
     }
    public String hapusdata (){
        db = new Database();
        String hapus = "Delete from buku where Kode_buku='"+Kode_buku+"'";
        db.setSql(hapus);
        db.LogikaHapus();
        return hapus;
     
    }
    
    public String UPBuku(){
        db = new Database();
        String SQLUpdateBUKU = "UPDATE buku set Jumlah_buku = '"+ getStok() +"' where Kode_buku = '"+ getKode_buku() +"'";
        db.UpdateBuku(SQLUpdateBUKU);
        
        return SQLUpdateBUKU;
    }
    
}
