package dao;

import pojo.UserAccount;

public class AuthenticationImpl implements Authentication  {

	
	boolean status;
	boolean skStatus;
	String dbUserID1 = "xyz@gmail.com",dbUserPass1 ="xyz1234";
	String dbUserID2 = "opt@gmail.com",dbUserPass2 ="xyz123" ,dbSecurityKey2 = "black";


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
			|| ref.getUserEmail().equals(dbUserID2) && ref.getUserPassword().equals(dbUserPass2)
			){
			status = true;
		} else {
			status = false;
		}
		return status;
	}// end of checkLogin
	
	public boolean verifySecurityKey(UserAccount ref) {
		if(ref.getUserEmail().equals(dbUserID2) && ref.getSecurityKey().equals(dbSecurityKey2)) {
			skStatus = true;
		} else {
			skStatus = false;
		}
		return skStatus;
	}//end of verifySecurityKey



}
