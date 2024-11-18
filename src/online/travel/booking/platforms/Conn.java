package online.travel.booking.platforms;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
   
    Conn(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql:///onlinetravelbookingplatformss ","root","22980011");
        s = c.createStatement();
        }
        catch(Exception e){
        e.printStackTrace();
    }
        
    }
}
