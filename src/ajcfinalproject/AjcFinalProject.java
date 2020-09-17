package ajcfinalproject;
import java.sql.*;
import java.io.*;

public class AjcFinalProject {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException  {
        Boolean running = false;

        while(!running){
            messages.introduction();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            System.out.println("You entered the following: " + userInput);
            
            
            if (userInput.toUpperCase().equals("END") || userInput.toUpperCase().equals("E")){
                running = true;
            }
        }   
//        Connection c = connection.getConnection();
    }

}
