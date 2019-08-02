package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;
import model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection coRef;
	PreparedStatement pRef;
	
	void getConnection() {
		try {
			coRef = DBConnection.prepareConnection();
		} catch(ClassNotFoundException|SQLException e) {
			System.out.println("DB Connection error..");
		}
	}
	
	@Override
	public void addemployee(Employee refEmployee) {
		getConnection();
		try {
			pRef = coRef.prepareStatement("insert into employee(id,name,password) values(?,?,?)");
			pRef.setInt(1,refEmployee.getEmployeeID);
			pRef.setInt(2,refEmployee.getEmployeeName);
			pRef.setInt(3,refEmployee.getEmployeePassword);
			
			pRef.executeUpdate();
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
	
	

}
