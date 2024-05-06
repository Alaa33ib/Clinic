import java.sql.*;
import javax.swing.*;

public class ClinicConnection 
{ 
   static GUITest w1;
   public static void main(String args[])
   {
     try
     {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic management system","root","");  
        Statement statement = connection.createStatement();
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        w1 = new GUITest();         
        connection.close();    
     }
     catch (Exception e)
     {  System.out.println(e); }
   } 
}
    

