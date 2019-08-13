package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionCS {
	public static Connection prepareConnection() throws SQLException,ClassNotFoundException{
		String connectionURL = "jdbc:mysql://localhost:3306/clt6";
		
		String dbName = "root";
		String dbPw = "password";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection ref = DriverManager.getConnection(connectionURL,dbName,dbPw);
		return ref;
		
	}
}
