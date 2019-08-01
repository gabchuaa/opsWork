package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Database1 {

	public static void main(String []args) throws ClassNotFoundException,SQLException{
		//Step 1
		Connection con = MyConnection.prepareConnection();
		
		//Execute a query
		System.out.println("Creating table in given database....");
		Statement st = con.createStatement();
		
		//create table
		String sql = "Create TABLE students"+
					 "(mobile INTEGER not NULL,"
					 +"name VARCHAR(25),"+
					 "email varchar(35),"+
					 "PRIMARY KEY (mobile))";
		st.executeUpdate(sql);
		System.out.println("Created table in given database....");
	}
	
}
