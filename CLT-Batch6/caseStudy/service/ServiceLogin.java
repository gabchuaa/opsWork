package service;

import pojo.UserAccount1;

public interface ServiceLogin {
	
	public void verifyLogin(UserAccount1 userInfo);
	public void verifyRegisteredEmail(UserAccount1 userInfo);
	public void verifySecurityKey(UserAccount1 userInfo);

}
