package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample2 {

	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		List refList = new ArrayList();
		refList.add("Charles");
		refList.add("Jerret");
		
		boolean ifExist = false;
		while (!ifExist) {
			System.out.println("Enter your name");
			String refName = sc.next();
			
			if(refList.contains(refName)) {
				System.out.println("Name exist");
				
			} else {
				refList.add(refName);
				System.out.println(refList);
				ifExist = true;
				
			}
			
		}
		}
		
	
	
}
