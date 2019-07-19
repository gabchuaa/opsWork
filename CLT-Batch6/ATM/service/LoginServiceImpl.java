package service;

import dao.LoginDAO;
import dao.LoginDAOImpl;
import pojo.UserAccount;

public class LoginServiceImpl implements LoginService{

	LoginDAO refLoginDAO;
	
	@Override
	public void checkStatus(UserAccount ref) {
	
		refLoginDAO = new LoginDAOImpl();
		if(refLoginDAO.loginValidate(ref)==true) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("Not valid...");
		}
		
	}
	
	

}
