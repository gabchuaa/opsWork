package day10;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day08.ArrayExample;

class Customer {
	String name;
	
	Customer (String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
}//end of Customer

public class ArrayExample03 {
	public static void main(String []args) {
		
		List refList = new ArrayList();
		refList.add(new Customer("Charles"));
		refList.add(new Customer("Charles"));
		refList.add(new Customer("Jerret"));
		Scanner sc = new Scanner (System.in);
		
		
		boolean exist = false;
		while (!exist) {
			
			System.out.println("Enter Name : ");
			String name = sc.next();
			if(refList.contains(new Customer(name))) {
				System.out.println("Name exist");
				
			} else {
				refList.add(new Customer(name));
				exist = true;
			}	
		}
		
		

		
		
		System.out.println(refList);
		
	}
	
	
	
	

}
