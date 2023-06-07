package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCeXEMPLO3 {
	
	static final String DB_URL = "jdbc:mysql://localhost/sistemainternoloja";
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idUsuario = 2301;
		String QUERY = "SELECT senha FROM funcionarios where id=";
		QUERY = QUERY + String.valueOf(idUsuario);
		String senhaTextField = "1234";
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
				
		         ResultSet rs = stmt.executeQuery(QUERY);
		      ) {		      
		      
		             rs.getInt("senha");
		         
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }
		
	}

}
