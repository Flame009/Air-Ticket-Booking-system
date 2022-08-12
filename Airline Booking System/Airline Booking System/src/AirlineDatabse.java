
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




  import java.sql.*;  
   
public class AirlineDatabse {
    

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            
            String  Query="Select * from BOOKING where username=Rahma";
            Class.forName("com.mysql.jbdc.Driver");
            Connection con=DriverManager.getConnection("jbdc:mysql://localhost/APT3040_Project","root","");
            
            //create sql statement
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(Query);
            rs.next();
            String sname=rs.getString(2);
            System.out.println(sname);
              con.close();
        }
           
         catch(Exception e)
         {
             System.out.println("Connection Successful");
        }
    }}

    


    

