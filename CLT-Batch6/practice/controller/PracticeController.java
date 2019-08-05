package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.practiceUser;
import service.PracticeService;
import service.PracticeServiceImpl;

public class PracticeController {
	PracticeService prefService = new PracticeServiceImpl();
	practiceUser userRef = new practiceUser();
	
	public void askUserInput() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user ID");
		String userID = sc.next();
		System.out.println("Enter your name");
		String userName = sc.next();
		System.out.println("Enter your Password ");
		String password = sc.next();
		System.out.println("Enter your Date of birth in MM/DD/YYYY");
		String date = sc.next();
		userRef.setUserID(userID);
		userRef.setUserName(userName);
		userRef.setUserPassword(password);
		userRef.setUserDob(date);
		prefService.addPerson(userRef);
		
		
	}
	
	public void askUserUpdateInput() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user ID");
		String userID = sc.next();
		System.out.println("Enter your name");
		String userName = sc.next();
		System.out.println("Enter your Password ");
		String password = sc.next();
		System.out.println("Enter your Date of birth in MM/DD/YYYY");
		String date = sc.next();
		userRef.setUserID(userID);
		userRef.setUserName(userName);
		userRef.setUserPassword(password);
		userRef.setUserDob(date);
		prefService.updatePerson(userRef);
		
		
	}
	
	public List<practiceUser> listPerson(){
		return prefService.listUser();
	}
	
	public void askUserID() {
		prefService.getPersonID(userRef);
	}
	
	public void removeUserID() {
		prefService.removePersionID(userRef);
	}

}
