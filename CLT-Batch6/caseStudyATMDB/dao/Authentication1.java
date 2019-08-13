package dao;

import java.sql.SQLException;
import java.util.List;

import pojo.UserAccount1;

public interface Authentication1 {

	
	public void addUser(UserAccount1 ref) throws ClassNotFoundException, SQLException;
	public void checkLogin(UserAccount1 ref) throws ClassNotFoundException, SQLException;
	public void withdrawAmt(UserAccount1 ref, double amt) throws ClassNotFoundException, SQLException;
	public void depositAmt(UserAccount1 ref, double amt) throws ClassNotFoundException, SQLException;
	public  List<UserAccount1> listUsers() throws ClassNotFoundException, SQLException;
	boolean loginValidate(UserAccount1 ref) throws ClassNotFoundException, SQLException;
	public void updateUser(UserAccount1 ref) throws ClassNotFoundException, SQLException;
	public void showBalance(UserAccount1 Ref) throws ClassNotFoundException, SQLException;

	
}
