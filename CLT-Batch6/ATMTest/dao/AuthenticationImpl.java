package dao;

import pojo1.UserAccount;

public class AuthenticationImpl implements Authentication  {

	public boolean sendStatus;

	boolean status;
	String dbUserID1 = "xyz@gmail.com",dbUserPass1 ="xyz1234";
	String dbUserID2 = "opt@gmail.com",dbUserPass2 ="xyz123";


	public String getDbUserID1() {
		return dbUserID1;
	}

	public String getDbUserPass1() {
		return dbUserPass1;
	}

	public String getDbUserID2() {
		return dbUserID2;
	}

	public String getDbUserPass2() {
		return dbUserPass2;
	}

	@Override// To check login information from UserAccount
	public boolean checkLogin(UserAccount ref) { //to validate if dbuserID match getUserEmail
		if((ref.getUserEmail().equals(dbUserID1)&& ref.getUserPassword().equals(dbUserPass1))
			|| ref.getUserEmail().equals(dbUserID2) && ref.getUserPassword().equals(dbUserPass2)){
			status = true;
		} else {
			status = false;
		}
		return status;
	}// end of checkLogin



}
