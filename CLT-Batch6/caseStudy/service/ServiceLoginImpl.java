package service;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.LoginRequest;
import dao.Authentication;
import dao.AuthenticationImpl;
import pojo.UserAccount;

public class ServiceLoginImpl implements ServiceLogin  {
	Authentication refAuthentication;
	Scanner sc = new Scanner(System.in);
	Authentication verifyAuth = new AuthenticationImpl();
	UserAccount userInfo = new UserAccount();
	
	public void verifySecurityKey(UserAccount userInfo) {
		if(verifyAuth.toSecurityKey(userInfo)==true) {
			boolean exist = false;
			while (!exist) {
				System.out.println("Enter new password");
				System.out.println("Enter Password : ");
				String password = sc.next();
				String password1;
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
					System.out.println("Your password has been reset successfully!!");
					System.out.println();
					exist = true;
				} else {
					System.out.println("Password doesn't match");
				}
			}//end of while (exist)
			LoginRequest refLoginRequest = new LoginRequest();
			refLoginRequest.printHomePage();
			
				} else {
					System.out.println("Information given is wrong");
				}
	}//end of verifySecurityKey
	
	@Override 
	public void verifyLogin(UserAccount userInfo) {//get reference from UserAccount // to use in printLogin method to verify login
		
			if(verifyAuth.checkLogin(userInfo)==true) { // To check refAuthentication.checkLogin, base on the condition return
				System.out.println("Login success");	  // it will print out the different output
				printAccountOptions(); // if login success call printAccountOption()
			}
				else {
				System.out.println("Wrong information given");
			}
		}//end of verifyLogin
	
	
	public void printAccountOptions(){ // to be use for 2.Login for printing of option and selecting option and call it method
		//Print out the choice for user to enter
		System.out.println("Type 1 : Check Available Bank Balance");
		System.out.println("Type 2 : Deposit Amount");
		System.out.println("Type 3 : Withdraw Amount");
		 //prompt user to enter
		boolean invalid = true;
		while(invalid) {
			try {
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				checkBalance(userInfo);
				invalid = false;
				break;
			case 2:
				depositAmount(userInfo);
				invalid = false;
				break;
			case 3:
				withdrawAmount(userInfo);
				invalid = false;
				break;
			
				default:
					System.out.println("Invalid input");
					printAccountOptions();
					invalid = false;
			}// end of switch
	}// end of try
			catch (InputMismatchException e) {
		System.out.println("Invalid input");
		sc.next();
		continue; 
	}//end of catch
			}//end of while 
		}//end of printAccountOptions
	
	public void checkBalance(UserAccount userInfo){ // method to check UserAccount Balance
		System.out.println("Available Balance "+userInfo.getUserBalance());
		System.out.println("Wish to Continue? (y/n)");
		String refInput = sc.next();
		if(refInput.equals("y")) {
			printAccountOptions();
		} else {
			System.out.println("Thanks for Banking with Us!!!");
			LoginRequest refLoginRequest = new LoginRequest();
			refLoginRequest.printHomePage();
			
		}
		
	}//end of checkBalance
	
	public void depositAmount(UserAccount userInfo) { // Method to deposit money into UserAccount
		System.out.println("Enter amount : ");
		int amount = sc.nextInt();
		while(amount<0) {
				System.out.println("Amount can't be negative!!");
				System.out.println("Enter amount : ");
				amount = sc.nextInt();
				if(amount>0) {
					break;
				}
			} 
		toDeposit(amount);
		System.out.println(amount+" dollar deposited successfully!!");
		System.out.println("Wish to Continue? (y/n)");
		String refInput = sc.next();
		if(refInput.equals("y")) {
			printAccountOptions();
		} else {
			System.out.println("Thanks for Banking with Us!!!");
			LoginRequest refLoginRequest = new LoginRequest();
			refLoginRequest.printHomePage();
		}
	}//end of depositAmount
		
	public void toWithdraw(int amount) {
		int amountAfterdeduction;
		amountAfterdeduction = userInfo.getUserBalance()-amount;
		userInfo.setUserBalance(amountAfterdeduction);
	}//end of toWithdraw
	
	public void toDeposit(int amount) {
		int amountAfterDeposit;
		amountAfterDeposit = userInfo.getUserBalance()+amount;
		userInfo.setUserBalance(amountAfterDeposit);
	}// end of toDeposit
	
	
	public void withdrawAmount(UserAccount userInfo) {// Method to withdraw money into UserAccount
		String refInput;
		boolean invalidAmount = true;
		while(invalidAmount) {
			System.out.println("Enter amount : ");
			int amount = sc.nextInt();
			if(amount<0 || amount>userInfo.getUserBalance()) {
				System.out.println("Sorry!! insufficient balance");
				System.out.println("Wish to continue? (y/n) : ");
				refInput = sc.next();
				if(refInput.equals("y")) {
					printAccountOptions();
					invalidAmount = false;
				} else {
					System.out.println("Thanks for Banking with Us!!!");
					LoginRequest refLoginRequest = new LoginRequest();
					refLoginRequest.printHomePage();
					invalidAmount = false;
				}// end of  refInput if else statement
			}
			else {
				toWithdraw(amount);
				System.out.println(" Transaction Successful");
				System.out.println("Wish to Continue? (y/n)");
				refInput = sc.next();
				if(refInput.equals("y")) {
					printAccountOptions();
				} else {
					System.out.println("Thanks for Banking with Us!!!");
					LoginRequest refLoginRequest = new LoginRequest();
					refLoginRequest.printHomePage();
				}// end of  refInput if else statement
					}//end of amount if else statement 
				invalidAmount = false;
			}//invalidAmount
		}//withdrawAmount
		
	@Override
	public void verifyRegisteredEmail(UserAccount userInfo) { // method to verify register 
		boolean exist = false;
		boolean exist1 = false;
		System.out.print("Enter Email address : ");
		String userID = sc.next();
		
			while(!exist) {
				verifyAuth = new AuthenticationImpl();
				if (userID.equals(userInfo.getUserEmail()) || userID.equals("xyz@gmail.com"))   {
					System.out.println("email address already exist");
					System.out.print("Enter Email address : ");
					userID = sc.next();
				}//end of if method
				else {
					exist = true;
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
				exist1 = true;}//end of if statement
			else {
				System.out.println("Password doesn't match");
			}
		}//end of while exist1
		LoginRequest refLoginRequest = new LoginRequest();
		refLoginRequest.printHomePage();
		
			}//end of verifyRegisteredEmail
	
}//end of class ServiceLogin
		
	

	
	

