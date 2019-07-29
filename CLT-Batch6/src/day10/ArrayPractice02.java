package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


class Place{
	String destination;
	
	Place(String destination){
		this.destination = destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getDestination() {
		return destination;
	}

	@Override
	public String toString() {
		return "Destination : " + destination;
	}
	
	
	
	
}


public class ArrayPractice02 {
	

	public static void main(String []args) {
		List refPlace = new ArrayList();
		refPlace.add(new Place("Changi business Park"));
		refPlace.add(new Place("Plaza Sing"));
		refPlace.add(new Place("Punggol"));
		refPlace.add(new Place("Jurong"));
		Scanner sc = new Scanner(System.in);
		
		Iterator itr = refPlace.iterator();
		while (itr.hasNext()) {
			System.out.println("Do you want to continue");
			String choice = sc.next();
			if(choice.equals("yes")) {
				if(itr.hasNext()) {
					System.out.println(itr.next());
					System.out.println("================================");
					System.out.println("Do you want to remove destination?");
					String choice1 = sc.next();
					if(choice1.equals("yes")) {
						itr.remove();
						System.out.println("Destination remove");
						System.out.println("==========================");
					}
				} 
				if(!itr.hasNext()) {
					System.out.println("End of destination");
				}
					
				
			} else {
				System.out.println("Stop");
				break;
			}
			
		}
		refPlace.forEach(temp -> {
			System.out.println(temp);
		});
		
		
		
	
		
		
	}
	
	
	
	
	
}
