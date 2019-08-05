package application;

import java.util.List;

import controller.PracticeController;
import model.practiceUser;

public class PracticePresentation {
	
	
	public static void main(String []args) {
		PracticeController pc = new PracticeController();
		
		//pc.askUserUpdateInput();
		
		/*
		 * //List method List<practiceUser> list; list= pc.listPerson();
		 * System.out.println("User ID \tName \t\tPassword\tDOB "); for(int
		 * i=0;i<list.size();i++){
		 * 
		 * System.out.println(list.get(i).getUserID() + "\t\t" +
		 * list.get(i).getUserName() + "\t\t" + list.get(i).getUserPassword() + "\t\t" +
		 * list.get(i).getUserDob());
		 * 
		 * } pc.listPerson();
		 */
		//pc.askUserID();
		pc.removeUserID();
	}
}
