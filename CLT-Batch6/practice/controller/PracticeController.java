package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.practiceUser;
import service.PracticeService;
import service.PracticeServiceImpl;

public class PracticeController {
	PracticeService prefService = new PracticeServiceImpl();
	practiceUser userRef = new practiceUser();
	
	public void printOption() {
		Scanner sc = new Scanner (System.in);
		System.out.println("1.Register user \n2.Update user \n3.Show Registered User Info \n4.Show selected User Info \n5.Delete User");
		int choice = sc.nextInt();
		sc.nextLine();
		try {
			switch (choice) {
			case 1:
				askUserInput();
				break;
			case 2:
				askUserUpdateInput();
				break;
			case 3:
				askListPerson();
				break;
			case 4:
				askUserID();
				break;
			case 5:
				removeUserID();
				break;
				default:
					System.out.println("Wrong input");
					printOption();
			} 
		}catch(InputMismatchException e) {
			System.out.println("Enter number only!!");
		} 
	}
	
	public void askUserInput() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user ID");
		String userID = sc.next();
		sc.nextLine();
		System.out.println("Enter your name");
		String userName = sc.next();
		sc.nextLine();
		System.out.println("Enter your Password ");
		String password = sc.next();
		sc.nextLine();
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
		sc.nextLine();
		System.out.println("Enter your name");
		String userName = sc.next();
		sc.nextLine();
		System.out.println("Enter your Password ");
		String password = sc.next();
		sc.nextLine();
		System.out.println("Enter your Date of birth in MM/DD/YYYY");
		String date = sc.next();
		sc.nextLine();
		userRef.setUserID(userID);
		userRef.setUserName(userName);
		userRef.setUserPassword(password);
		userRef.setUserDob(date);
		prefService.updatePerson(userRef);
		
		
	}
	
	public void askListPerson() {
		List<practiceUser> list; 
		list= listPerson();
		  System.out.println("User ID \tName \t\tPassword\tDOB "); 
		  for(int i=0;i<list.size();i++){
		 
		 System.out.println(list.get(i).getUserID() + "\t\t" +
		list.get(i).getUserName() + "\t\t" + list.get(i).getUserPassword() + "\t\t" +
		 list.get(i).getUserDob());
		 
		listPerson();
	}
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
