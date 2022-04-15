package tugasbesar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HotelHarapanBangsa {
   public static Connection con;
   public static Statement stm;
   public static String url,user,pass;
   
    public static void main(String[] args) {
        try {
            url = "jdbc:mysql://localhost/database_hotel";
            user = "root";
            pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("Koneksi data hotel berhasil");
            new LoginPage().setVisible(true);
        }
        catch (Exception e) {
            System.err.println("Koneksi gagal " + e.getMessage());
            
        }     
    }  
}
