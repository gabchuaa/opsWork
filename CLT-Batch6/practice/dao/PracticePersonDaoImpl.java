package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import connection.DBConnection;
import db.PracticeMyConnection;
import model.practiceUser;


public class PracticePersonDaoImpl implements PracticePersonDao {
	Connection coRef;
	PreparedStatement psRef;
	
	public  Connection prepareConnection() throws SQLException, ClassNotFoundException{

		String connectionURL = "jdbc:mysql://localhost:3306/clt6";

		String uname = "root";
		String pwd = "password";

		//Register JDBC Driver

		Class.forName("com.mysql.jdbc.Driver");

		//open a connection

		Connection ref = DriverManager.getConnection(connectionURL, uname, pwd);
		return ref;
	}
	
	void getConnection() {
		try {
			coRef = PracticeMyConnection.prepareConnection();
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println("DB Connection error..");
		}
	}
	
	@Override
	public void addPerson(practiceUser pRef) {
		getConnection();
		try {
			psRef = coRef.prepareStatement("insert into practiceuser (userID, Name, Password,DateOfBirth) values(?,?,?,?)");
			psRef.setString(1,pRef.getUserID());
			psRef.setString(2,pRef.getUserName());
			psRef.setString(3,pRef.getUserPassword());
			psRef.setString(4, pRef.getUserDob());
			
			psRef.executeUpdate();
			System.out.println("Record added Successfully");
		} catch(SQLException e) {
			System.out.println("Exeception caught... not able to add");
		}finally {
			try {
				coRef.close();
			} catch(SQLException e) {
				System.out.println("Exeception caught... not able to close connection");
			}
		}
		
		
	}

	@Override
	public void updatePerson(practiceUser pRef) {
		getConnection();
		try { 
			psRef = coRef.prepareStatement("update practiceuser set Name = ?, Password = ?, DateOfBirth = ? where userID = ?");
			
			psRef.setString(1, pRef.getUserName());
			psRef.setString(2, pRef.getUserPassword());
			psRef.setString(3, pRef.getUserDob());
			psRef.setString(4, pRef.getUserID());
			
			psRef.executeUpdate();
			
			System.out.println("Record updated successfully");
		}
		catch (Exception e) {
			System.out.println("Exception caught.. not able to update record");
		}
		
	}

	@Override
	public List<practiceUser> listPerson() {
		List<practiceUser> myList = new ArrayList<>();
		Statement st;
		try {
			st = prepareConnection().createStatement();
			String sql = "SELECT * FROM practiceuser";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				practiceUser pu = new practiceUser();
				pu.setUserName(rs.getString(2));
				pu.setUserID(rs.getString(1));
				pu.setUserPassword(rs.getString(3));
				pu.setUserDob(rs.getString(4));
				myList.add(pu);
			}
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return myList;
	}

	@Override
	public void getPersonById(String id) {
		Statement st;
		try {
			st = prepareConnection().createStatement();
			String sql = "SELECT * FROM practiceuser WHERE userID = " + id +""; 
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				practiceUser pu = new practiceUser();
				System.out.println("User ID : "+rs.getString(1)+" Name : "+rs.getString(2));
			}
		}catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void removePerson(String id) {
		Statement st;
		try {
			st = prepareConnection().createStatement();
			String sql = "DELETE FROM practiceuser " + "WHERE userID ='" + id + "'";
			st.executeUpdate(sql);
			System.out.println("Record deleted successfully");
			
		}catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}

	
	

