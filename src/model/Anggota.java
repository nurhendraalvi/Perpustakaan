
package model;


public class Anggota {
    private String Kode_anggota;
    private String Nama_anggota;
    private String Jenis_kelamin;
    private String Tempat_lahir;
    private String Tanggal_lahir;
    private String Alamat;
    private String No_hp;
    private Database db;

    public Anggota() {
    }

    
    
    public String getKode_anggota() {
        return Kode_anggota;
    }

    public void setKode_anggota(String Kode_anggota) {
        this.Kode_anggota = Kode_anggota;
    }

    public String getNama_anggota() {
        return Nama_anggota;
    }

    public void setNama_anggota(String Nama_anggota) {
        this.Nama_anggota = Nama_anggota;
    }

    public String getJenis_kelamin() {
        return Jenis_kelamin;
    }

    public void setJenis_kelamin(String Jenis_kelamin) {
        this.Jenis_kelamin = Jenis_kelamin;
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

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNo_hp() {
        return No_hp;
    }

    public void setNo_hp(String No_hp) {
        this.No_hp = No_hp;
    }
    
    public String Login() {
		String sql="Select * from login";
		return sql;
	}
     public String simpan (){
         db = new Database(); //ngbc db
         String input  = "replace INTO anggota VALUES ('"+Kode_anggota+"','"+Nama_anggota+"','"+Jenis_kelamin+"','"+Tempat_lahir+"','"+Tanggal_lahir+"','"+Alamat+"','"+No_hp+"')";
         db.setSql(input);
         System.out.println(input);
         db.LogikaSimpan(); //mnggl k lgk
         return input;//mengemblikan nilai inputnya biar kebaca
     }
    public String hapusdata (){
        db = new Database();
        String hapus = "Delete from anggota where Kode_anggota='"+Kode_anggota+"'";
        db.setSql(hapus);
        db.LogikaHapus();
        return hapus;
     
     
    }
    
    
    
}