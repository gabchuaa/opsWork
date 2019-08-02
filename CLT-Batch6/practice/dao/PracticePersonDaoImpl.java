package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import connection.DBConnection;
import db.PracticeDatabase;
import db.PracticeMyConnection;
import model.practiceUser;

public class PracticePersonDaoImpl implements PracticePersonDao {
	Connection coRef;
	PreparedStatement psRef;
	
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getPersonById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
