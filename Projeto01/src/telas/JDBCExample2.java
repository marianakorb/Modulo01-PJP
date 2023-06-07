package telas;

// https://www.tutorialspoint.com/jdbc/jdbc-select-records.htm

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {
   static final String DB_URL = "jdbc:mysql://localhost/sistemainternoloja";
   static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT * FROM funcionarios";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      ) {		      
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Nome: " + rs.getString("nome"));
            System.out.print(", funcao: " + rs.getString("funcao"));
            System.out.println(", senha " + rs.getInt("senha"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}