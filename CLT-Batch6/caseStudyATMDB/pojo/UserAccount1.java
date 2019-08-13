package pojo;

public class UserAccount1 {
	
	private String userEmail;
	private String userPassword;
	private String securityKey;
	private double userBalance = 0; //set userBalance default value to 0

	
	public UserAccount1() {
		
	}
	
	
	
	public UserAccount1(String userEmail, String userPassword, String securityKey, double userBalance) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.securityKey = securityKey;
		this.userBalance = userBalance;
	}



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

	public double getUserBalance() {
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

	public void setUserBalance(double userBalance) {
		this.userBalance = userBalance;
	}
	
	
}
