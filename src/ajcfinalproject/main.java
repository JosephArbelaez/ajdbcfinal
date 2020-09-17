package ajcfinalproject;
import java.sql.*;
import java.io.*;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException  {
        Boolean running = false;
        Connection c = connection.getConnection();
        
        messages.introduction();
        messages.end();
//        while(!running){
//            
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String userInput = reader.readLine();
//            System.out.println("You entered the following: " + userInput);
//            
//            
//            if (userInput.toUpperCase().equals("END") || userInput.toUpperCase().equals("E")){
//                running = true;
//            }  
//        }
    }
}
