package ajcfinalproject;

import java.sql.*;

public class connection {
    static private Connection c;
    static Connection myConn = null;
    static String user = "U06ika";
    static String pass = "53688776651";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (c == null) {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://wgudb.ucertify.com:3306/U06ika", user, pass);
        } 
        return c;
        }
    }
