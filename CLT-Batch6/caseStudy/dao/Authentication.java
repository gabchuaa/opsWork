package dao;

import pojo.UserAccount1;

public interface Authentication {

	public boolean checkLogin(UserAccount1 ref);
	public boolean toSecurityKey(UserAccount1 ref);
	

	
}
