package controller;

import dao.Authentication;
import dao.AuthenticationImpl;
import service.ServiceLogin;
import service.ServiceLoginImpl;

import java.util.InputMismatchException;
import java.util.Scanner;
import pojo.UserAccount;
public class LoginRequest  {
	
	UserAccount userInfo = new UserAccount();
	Scanner sc = new Scanner(System.in);
	AuthenticationImpl verifyAuth = new AuthenticationImpl();
	ServiceLoginImpl verifyService = new ServiceLoginImpl();
	
	public void sendLoginRequest() {
		printHomePage();
	}//end of sendLoginRequest

	public void printHomePage (){// exceptionHandling done
		//Print out the choice for user to enter
		System.out.println("User Home Page :");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Forget Password");
		System.out.println("4. Logout (exit)");
		 //prompt user to enter
		boolean invalid = true;
			while(invalid) {// using the while to loop handle catch method
				try {		// during the while loop if the valid option is selected, invalid will change to false and it will stop the loop
				System.out.println("Enter your choice : "); //else it print invalid input and go back to loop again
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					printRegister();
					invalid = false;
					break;
				case 2:
					printLogin();
					invalid = false;
					break;
				case 3:
					printForgetPassword();
					invalid = false;
					break;
				case 4:
					printLogout();
					invalid = false;
					break;
					default:
						System.out.println("Invalid input");
						printHomePage();
						invalid = false;
						}
				}catch (InputMismatchException e) {
					System.out.println("Invalid input");
					sc.next();
					continue; 
					}
				} 
			}//end of printHome

	void printRegister(){
		verifyService.verifyRegisteredEmail(userInfo);
	}// end of printRegister



	void printLogin(){
		System.out.println("Enter User ID : ");
		String userID = sc.next();
		System.out.println("password : ");
		String password = sc.next();
		userInfo.setUserEmail(userID);
		userInfo.setUserPassword(password);
		verifyService.verifyLogin(userInfo);
	}//end of printLogin

	void printForgetPassword(){
		System.out.println("Enter User ID : ");
		String userID = sc.next();
		System.out.println("Enter security key : ");
		String userSk = sc.next();
		userInfo.setUserEmail(userID);
		userInfo.setSecurityKey(userSk);
		verifyService.verifySecurityKey(userInfo);
		
	}//end of printForgetPassword

	void printLogout(){
		System.out.println("Logout Successfully!!!");
	}// end of printLogout
}
