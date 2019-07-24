package service;

import pojo1.UserAccount;

public interface ServiceLogin {
	
	public void verifyLogin(UserAccount ref);
	public void verifyRegisteredEmail(UserAccount ref);

}
