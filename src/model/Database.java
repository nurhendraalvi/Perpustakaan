
package model;

import view.ViewBuku;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import view.Menu;


public class Database {
    private Connection connection;
    private Statement statement;
    private ResultSet result;
    private Object data [][]=new Object[500][7];
    private String url = "jdbc:mysql://localhost/perpustakaan2";
    private String sql ="";
    private Buku buku = new Buku();
    private Anggota anggota = new Anggota();
    public static Object dataBuku[][]=null;
    
    public Database(){
        
        }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
    
    public void login(String temp1, String temp2) {
		try{
		Buku buku = new Buku();
                Anggota anggota = new Anggota();
                Petugas petugas= new Petugas();
	        Class.forName("com.mysql.jdbc.Driver");
	        connection = DriverManager.getConnection(url,"root","");
	        statement = connection.createStatement();
	        result = statement.executeQuery(buku.Login());
                result = statement.executeQuery(anggota.Login());
                result = statement.executeQuery(petugas.Login());
	        
	        while (result.next()){
	        	String user = result.getString("username");
	        	String pass = result.getString("password");
	        	if (temp1.equals(user) && temp2.equals(pass)){
	        	Menu view= new Menu();
	            view.setVisible(true);
	            break;
	        }
 
	        }    
		}catch (SQLException ex){
	            JOptionPane.showMessageDialog(null,"Belum terkoneksi","hasil",JOptionPane.ERROR_MESSAGE);
	        }
	        catch (ClassNotFoundException ex){
	            JOptionPane.showMessageDialog(null,"driver tidak ditemukan","hasil",JOptionPane.ERROR_MESSAGE);
	    
	        }
	}
        public void LogikaSimpan() {
        try { 
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan2","root","");
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"data berhasil di tambahkan","hasil",JOptionPane.INFORMATION_MESSAGE);
        statement.close();
        connection.close();
    } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Simpan Gagal","Hasil",JOptionPane.ERROR_MESSAGE);
    }   catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Tidak ditemukan","Hasil",JOptionPane.ERROR_MESSAGE);
        }
        
    }
     public void LogikaHapus() {
        try { 
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan2","root","");
        statement = connection.createStatement();
        statement.executeUpdate(sql); 
        JOptionPane.showMessageDialog(null,"data berhasil di hapus","hasil",JOptionPane.INFORMATION_MESSAGE);
        statement.close();
        connection.close();
    } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"hapus Gagal","Hasil",JOptionPane.ERROR_MESSAGE);
    }   catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Tidak ditemukan","Hasil",JOptionPane.ERROR_MESSAGE);
        }
        
    }
     public void UpdateBuku(String upData1) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan2","root","");
            statement = connection.createStatement();
            statement.executeUpdate(upData1);
            statement.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "data gagal di UPDATE");
        }
    }
    
    }
    
       
    

