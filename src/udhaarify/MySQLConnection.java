/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udhaarify;
import java.sql.*;
/**
 *
 * @author Dheeraj
 */

public class MySQLConnection {
    static Connection con = null;
    public static void main(String args[]) throws SQLException{
    }
    public static Connection getConnection()
    {
        if (con != null) 
        return con;
        // get database, username, password from settings file
        return getConnection("udhaarify", "root", "Dheeraj1234!");
    }

    private static Connection getConnection(String db_name,String user_name,String password)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/"+db_name+"?user="+user_name+"&password="+password);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;        
    }
}
