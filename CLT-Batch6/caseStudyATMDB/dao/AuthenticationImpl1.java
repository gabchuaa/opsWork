package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MyConnectionCS;
import pojo.UserAccount1;

public class AuthenticationImpl1 implements Authentication1  {

	@Override
	public List<UserAccount1> listUsers() throws ClassNotFoundException, SQLException {
		List <UserAccount1> myList = new ArrayList<>();
		Connection con = MyConnectionCS.prepareConnection();
		Statement st = con.createStatement();
		
		String sql = "SELECT * FROM atm_userinfo";
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			UserAccount1 refUser = new UserAccount1(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDouble(4)); 
			myList.add(refUser);
			
		}
		return myList;
	}
	
	@Override
	public void addUser(UserAccount1 ref) throws ClassNotFoundException, SQLException {
		Connection con = MyConnectionCS.prepareConnection();
		Statement st = con.createStatement();
		
		String sql = "INSERT INTO atm_userinfo" +
		             "value ("+
		
	}

	@Override
	public void checkLogin(UserAccount1 ref) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawAmt(UserAccount1 ref, double amt) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositAmt(UserAccount1 ref, double amt) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean loginValidate(UserAccount1 ref) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateUser(UserAccount1 ref) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showBalance(UserAccount1 Ref) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	
	



}
