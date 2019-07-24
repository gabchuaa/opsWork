package controller;

import dao.AuthenticationImpl;
import pojo1.UserAccount;
import service.ServiceLogin;

import java.util.Scanner;

public class LoginRequest {
	
	UserAccount userInfo = new UserAccount();
	ServiceLogin verifyLogin;
	Scanner sc = new Scanner(System.in);
	AuthenticationImpl verifyAuth = new AuthenticationImpl();
	
	public void sendLoginRequest() {
		printHomePage();
	}

	void printHomePage(){
		//Print out the choice for user to enter
		System.out.println("User Home Page :");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Forget Password");
		System.out.println("4. Logout (exit)");
		 //prompt user to enter
		System.out.print("Enter Your Choice : ");
		int choice = sc.nextInt();
		System.out.println();


		switch(choice){
			case 1:
				printRegister();
				break;
			case 2:
				printLogin();
				break;
			case 3:
				printForgetPassword();
				break;
			case 4:
				printLogout();
				break;
			default:
				System.out.println("Invalid Input");
				System.out.println("=============================");
				printHomePage();
		}

	}

	void printRegister(){
		boolean exist = false;
		boolean exist1 = false;
		System.out.print("Enter Email address : ");
		String userID = sc.next();
		if(userID.equals(verifyAuth.getDbUserID1())){
			while(!exist) {
				System.out.println("email address already exist");
				System.out.print("Enter Email address : ");
				userID = sc.next();
				if (userID!=(verifyAuth.getDbUserID1())) {

					exist = true;
				}
			}
		}// end of while for userID
		userInfo.setUserEmail(userID);
		System.out.println("Enter Password : ");
		String password = sc.next();
		String password1;
		while(!exist1 ){

			System.out.println("Re-type Password : ");
			password1 = sc.next();
			if(password .equals(password1)){
				//end of while loop for password
				userInfo.setUserPassword(password);
				System.out.print("What is your favourite colour? ");
				String userSecurityKey = sc.next();
				userInfo.setSecurityKey(userSecurityKey);
				System.out.println(userSecurityKey+" is your security key,incase if you forget your password.");
				System.out.println();
				System.out.println("Registration Successful!!");
				System.out.println();
				printHomePage();
				exist1 = true;
			}
		}

		System.out.println("\nPassword doesn't match");
		System.out.println("Re-type Password : ");
		password1 = sc.next();
			}













	void printLogin(){

	}

	void printForgetPassword(){

	}

	void printLogout(){

	}
}
