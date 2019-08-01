package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnection {

	public static Connection prepareConnection()throws SQLException,ClassNotFoundException
	{
		//database URL
		//3306 is the default port for mysql
		String connectionURL = "jdbc:mysql://localhost:3306/clt6";
		
		//database credentials
		String uname="root";
		String pw1="password";
		
		//Register JDBC Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//open a Connection
		Connection ref = DriverManager.getConnection(connectionURL,uname,pw1);
		return ref;
	}
	
}
