package electricity.billing.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        //Class.forName("com.mysql.cj.jdbc.Driver");
        try{
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","@avengers1234COC");
        s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
