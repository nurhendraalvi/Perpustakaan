
package model;

public class Petugas {
    
    private String Kode_petugas;
    private String Tempat_lahir;
    private String Tanggal_lahir;
    private String Jenis_kelamin;
    private String No_hp;
    private String Alamat;
    private Database db;

    public Petugas() {
    }

    public String getKode_petugas() {
        return Kode_petugas;
    }

    public void setKode_petugas(String Kode_petugas) {
        this.Kode_petugas = Kode_petugas;
    }

    public String getTempat_lahir() {
        return Tempat_lahir;
    }

    public void setTempat_lahir(String Tempat_lahir) {
        this.Tempat_lahir = Tempat_lahir;
    }

    public String getTanggal_lahir() {
        return Tanggal_lahir;
    }

    public void setTanggal_lahir(String Tanggal_lahir) {
        this.Tanggal_lahir = Tanggal_lahir;
    }

    public String getJenis_kelamin() {
        return Jenis_kelamin;
    }

    public void setJenis_kelamin(String Jenis_kelamin) {
        this.Jenis_kelamin = Jenis_kelamin;
    }

    public String getNo_hp() {
        return No_hp;
    }

    public void setNo_hp(String No_hp) {
        this.No_hp = No_hp;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }
    
     public String Login() {
		String sql="Select *From login";
		return sql;
	}
     public String simpan (){
         db = new Database(); //ngbc db
         String input  = "replace INTO petugas VALUES ('"+Kode_petugas+"','"+Tempat_lahir+"','"+Tanggal_lahir+"','"+Jenis_kelamin+"','"+No_hp+"','"+Alamat+"')";
         db.setSql(input);
         System.out.println(input);
         db.LogikaSimpan(); //mnggl k lgk
         return input;//mengemblikan nilai inputnya biar kebaca
     }
    public String hapusdata (){
        db = new Database();
        String hapus = "Delete from petugas where Kode_petugas='"+Kode_petugas+"'";
        db.setSql(hapus);
        db.LogikaHapus();
        return hapus;
     
     
    }
    
    
    
}
