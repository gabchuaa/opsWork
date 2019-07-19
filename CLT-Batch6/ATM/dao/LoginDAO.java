package dao;

import pojo.UserAccount;

public interface LoginDAO {
	boolean loginValidate(UserAccount ref);
	
}
