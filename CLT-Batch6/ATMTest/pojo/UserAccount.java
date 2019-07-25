package pojo;

public class UserAccount {
	
	private String userEmail;
	private String userPassword;
	private String securityKey;
	private int userBalance = 0; //set userBalance default value to 0

	//getter
	public String getUserEmail() {
		return userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public String getSecurityKey() {
		return securityKey;
	}

	public int getUserBalance() {
		return userBalance;
	}

	//setter
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;
	}

	public void setUserBalance(int userBalance) {
		this.userBalance = userBalance;
	}
	
	public void setDepositAmount(int userBalance) {
		this.userBalance += userBalance;
	}
	public void setWithdrawAmount(int userBalance) {
		this.userBalance -= userBalance;
	}
	
}
