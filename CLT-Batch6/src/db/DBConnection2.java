package db;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection2 {
	public static Connection myConnection() {
		Connection con = null;
		FileReader fReader = null;
		//create properties object
		Properties propRef = new Properties();
		
		try {
			fReader = new FileReader("db.properties");
			//load jdbc related properties in above file
			propRef.load(fReader);
			//load the Driver Class
			Class.forName(propRef.getProperty("db_driver_class"));// this key can be anything
			//create the connection
			con = DriverManager.getConnection(
				propRef.getProperty("db_url"),
				propRef.getProperty("db_username"),
				propRef.getProperty("db_password")
				);
				//end of try
			//fileNotFoundException is already caught in IOexception
			} catch (IOException |ClassNotFoundException|SQLException e) {
				System.out.println("DKConnection => DB Connection Error....");
				
		}//end of catch
		return con;
	}//end of myConnection()

}//end of DBConnection2
