package service;

import dao.Authentication;
import dao.AuthenticationImpl;
import pojo1.UserAccount;

public class ServiceLoginImpl implements ServiceLogin  {

	Authentication refAuthentication;
	@Override
	public void verifyLogin(UserAccount ref) {//get reference from UserAccount
		refAuthentication = new AuthenticationImpl();//call method from AuthenticationImpl


			if(refAuthentication.checkLogin(ref)==true) { // To check refAuthentication.checkLogin, base on the condition return
				System.out.println("Login success");	  // it will print out the different output

			} else {
				System.out.println("Wrong information given");
			}
		}

	@Override
	public void verifyRegisteredEmail(UserAccount ref) {

	}
}
		
	

	
	

