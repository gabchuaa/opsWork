package service;

import pojo.UserAccount;

public interface ServiceLogin {
	
	public void verifyLogin(UserAccount userInfo);
	public void verifyRegisteredEmail(UserAccount userInfo);
	public void verifySecurityKey(UserAccount userInfo);

}
