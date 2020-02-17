
package model;


public class Buku {
    
    
    private String Kode_buku;
    private String Judul_buku;
    private String Pengarang;
    private String Tahun_terbit;
    private String Penerbit;
    private int Jumlah_buku;
    private int hitung;
    private Database db;
    public Buku() {
    }

    public Buku(String Kode_buku, String Judul_buku, String Pengarang, String Tahun_terbit, String Penerbit, int Jumlah_buku) {
        this.Kode_buku = Kode_buku;
        this.Judul_buku = Judul_buku;
        this.Pengarang = Pengarang;
        this.Tahun_terbit = Tahun_terbit;
        this.Penerbit = Penerbit;
        this.Jumlah_buku = Jumlah_buku;
    }

    public String getKode_buku() {
        return Kode_buku;
    }

    public void setKode_buku(String Kode_buku) {
        this.Kode_buku = Kode_buku;
    }

    public String getJudul_buku() {
        return Judul_buku;
    }

    public void setJudul_buku(String Judul_buku) {
        this.Judul_buku = Judul_buku;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public String getTahun_terbit() {
        return Tahun_terbit;
    }

    public void setTahun_terbit(String Tahun_terbit) {
        this.Tahun_terbit = Tahun_terbit;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    public int getJumlah_buku() {
        return Jumlah_buku;
    }

    public void setJumlah_buku(int Jumlah_buku) {
        this.Jumlah_buku = Jumlah_buku;
    }
    
       public String Login() {
		String sql="Select *From login";
		return sql;
	}
       private int hitungStock(){
           hitung = getJumlah_buku() - 1;
           return hitung;
       }
     public String simpan (){
         db = new Database(); //ngbc db
         String input  = "replace INTO buku VALUES ('"+Kode_buku+"','"+Judul_buku+"','"+Pengarang+"','"+Tahun_terbit+"','"+Penerbit+"','"+Jumlah_buku+"')";
         db.setSql(input);
         db.LogikaSimpan(); //mnggl k lgk
         return input;//mengemblikan nilai inputnya biar kebaca
     }
    public String hapusdata (){
        db = new Database();
        String hapus = "Delete from buku where Kode_buku='"+Kode_buku+"'";
        db.setSql(hapus);
        db.LogikaHapus();
        return hapus;
     
     
    }
    
    public String Update (){
        db = new Database();
        String update = "UPDATE buku set Jumlah_buku = '"+ hitungStock() +"' where Kode_buku='"+Kode_buku+"' ";
        db.setSql(update);
        db.LogikaHapus();
        return update;
    }
    
 
    
}
