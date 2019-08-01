package day13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable { // to make serialization class we need to implements Serializable
														 // is to encrypt our file
	//public class SerializationDemo
	
	String name, city;

	transient int mobile;// we can also make static, if we don't want to serialize the variable
	int age;
	
	public static void main(String []args) {
		
		SerializationDemo e = new SerializationDemo();
		e.name = "David";
		e.city = "Melbourne";
		e.mobile = 12454787;
		e.age = 3;
		
		try {
			FileOutputStream fileOut = new FileOutputStream("david.txt");// create
			ObjectOutputStream out = new ObjectOutputStream(fileOut) ;
			out.writeObject(e);
			out.close();
			fileOut.close();
		} catch(IOException i){
			i.printStackTrace();
			return;
		}
	}

}
