package model;

import java.time.LocalDate;

public class practiceUser {
private String userID;
private String userName;
private String userPassword;
private String userDob;

public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public String getUserDob() {
	return userDob;
}
public void setUserDob(String date) {
	this.userDob = date;
}


}
