/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import static java.time.Clock.system;
import static java.time.InstantSource.system;


/**
 *
 * @author hp
 */
public class koneksi {
    
    private String databaseName="2210010049";
    private String username="root";
    private String password="";
    private String lokasi="jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    private String paramkodepemakaian;
    
    
    public koneksi(){
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          koneksiDB=DriverManager.getConnection(lokasi,username,password);
          System.out.println("Database Terkoneksi");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
    public void simpanPemakaian(String paramkodePemakaian, String paramkodeBarang, String paramnip, String paramkodeBagian,
            String paramtanggalPakai, int keperluan, int paramstatusPegawai, String paramkodebarang, String paramnik, String paramkodebagian, String paramtanggalpakai, String paramstatuspegawai, String paramkeperlua, int paramkeperluan) {
      
        try{
          String SQL ="INSERT INTO Pemakaian (kodePemakaian, kodeBarang, nip, kodeBagian, tanggalPakai, keperluan, statusPegawai)"
                   + "VALUE(?,?,?,?,?,?,?)";
                   
          PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
          perintah.setString(1, paramkodepemakaian);
          perintah.setString(2, paramkodebarang);
          perintah.setString(3, paramnik);
          perintah.setString(4, paramkodebagian);
          perintah.setString(5, paramtanggalpakai);
          perintah.setInt(6, paramkeperluan);
          perintah.setString(7, paramstatuspegawai);
          perintah.executeUpdate();
          System.out.println("Data berhasil disimpan");
          } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    public void ubahPemakaian(String paramkodePemakaian, String paramkodeBarang, String paramnip, String paramkodeBagian,
            String paramtanggalPakai, int keperluan, int paramstatusPegawai, String paramkodebarang, String paramnik, String paramkodebagian, String paramtanggalpakai, String paramstatuspegawai, String paramkeperlua, int paramkeperluan, String tanggalpakai, String nip) {
      
        try{
          String SQL;
            SQL = "UPDATE pemakaian SET kodepemakaian =?, kodebarang =?, kodebagian =?, tanggalpakai =?, statuspegawai =?, keperluan=? WHERE nip=?";

                   
          PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
          perintah.setString(1, paramkodepemakaian);
          perintah.setString(2, paramkodebarang);
          perintah.setString(3, paramkodebagian);
          perintah.setString(4, paramtanggalpakai);
          perintah.setString(5, paramstatuspegawai);
          perintah.setInt(6, paramkeperluan);
          perintah.setString(7, nip);
          perintah.executeUpdate();
          System.out.println("Data berhasil disimpan");
          } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    public void caripemakaian(String kodepemakaian){
        try {
            String SQL="SELECT*FROM pemakaian WHERE kodepemakaian=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, kodepemakaian);
            ResultSet data = perintah.executeQuery();
            while(data.next())
                System.out.println("KODEPEMAKAIAN:"data.getString(kodepemakaian));
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }

        public void caripemakaian(String paramkodepemakaian) {
            try {
                String SQL="SELECT*FROM pemakaian WHERE kodepemakaian=?";
                PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
                perintah
}
}
        }
    }

    public void simpanPemakaian(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

