package day08;

import java.util.Scanner;

class Person implements MyPrototype{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public MyPrototype clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (MyPrototype)super.clone();
	}
	
	 
	
	
	
	/*
	 * public Person(int id, String name) { this.id = id; this.name = name; }
	 * 
	 * @Override public String toString() { // TODO Auto-generated method stub
	 * return id+" "+ name; }
	 */
	
	
	
}// end of person class

public class ArrayExample  {
	
	public static void main(String[]args) {
		/*
		 * String str[] = {"Physics","Chemistry","Maths"};
		 * 
		 * for(int i = 0; i< str.length;i++) { System.out.println(str[i]);
		 * }//traditional for loop
		 * 
		 * for (String temp : str) { System.out.println(temp); }//for each loop
		 */		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many record you want to enter : ");
		int number = sc.nextInt();
		Person pRef[] = new Person[number];// create a space for the array
		
		for (int i = 0; i < pRef.length; i++) {
			System.out.println("Enter your ID : ");
			int id = sc.nextInt();
			System.out.println("Enter your name : " );
			String name = sc.next();
			
			Person p2Ref = new Person();// insert value to the record in the space
			p2Ref.setId(id);
			p2Ref.setName(name);
			pRef[i]=p2Ref;
		}// end of loop
		
		for (Person person : pRef) {
			System.out.println(person.getId()+" "+person.getName());//person is a reference of person Class
		}
		
		/*
		 * Person[] refPerson = (Person[]) pRef.clone();
		 * 
		 * for(Person test : refPerson) {
		 * System.out.println("ID: "+test.getId()+" Name : "+test.getName()); }
		 */
		
		
	}
	
	
}
