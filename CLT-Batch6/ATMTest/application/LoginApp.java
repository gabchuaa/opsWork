package application;


import controller.LoginRequest;

public class LoginApp {

	public static void main (String []args) {
		LoginRequest myLogin = new LoginRequest();
		myLogin.sendLoginRequest();
	}


}
