package totest;

import java.util.Scanner;

public class TestUserLogin {
	
	Scanner sc = new Scanner(System.in);
	 static String id  ;
	 static String password  ;


public boolean login() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id");
	String uID = sc.nextLine();
	System.out.println("Enter password");
	String uPassword = sc.nextLine();
	
	if (uID.equals(id) && uPassword.equals(password))
	{
		return true;
	}
	else if(uID.equals("") || uID.equals(" ") ||uPassword.equals("") || uPassword.equals(" ")) {
		System.out.println("do not enter empty value");
		return false;
	}
	else {
		return false;
	}
	
	
}




}
