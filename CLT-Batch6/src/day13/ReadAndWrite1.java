package day13;

import java.util.Scanner;
import java.io.*;

public class ReadAndWrite1 {
	
	public static void main(String []args) {
		DataInputStream in = null;
		Scanner sc = new Scanner(System.in);
		try {
			boolean exist1 = false; //to set condition for while
			while(!exist1) { //will loop when while is not = true
				System.out.println("Enter the file name");
				String fileName = sc.next();
				sc.nextLine();
				if(!fileName.contains(".doc")) {//to check if file contain.doc? word if not will ask user to type again
					System.out.println("Please enter .doc at the end");
				}else {
					exist1 = true;//once enter here straight break exist1 while loop
					
					boolean newFile = false;
					File f = new File(fileName);
					System.out.println(f.exists());// if file exist will return true if not false
					
					newFile = f.createNewFile();//create new file
					
					System.out.println(newFile);//if file have been created it will return true / else false
					
					System.out.println(f.exists());//just to check again if file exist
					
					FileWriter fw = new FileWriter(f);//Creating FileWriter and assign f to it
					BufferedWriter bw = new BufferedWriter(fw);//Create bufferedWriter and assign fw to it
					
					boolean cont = false;// to set condition for while
					while (!cont) {//if cont is false it will loop// in this case only when user enter Stop then the condition will be triger to true
						System.out.println("Do you want to enter text into file?");
						String choice = sc.next();
						sc.nextLine();
						if(choice.equalsIgnoreCase("yes")) {// to check if user input is yes, if so then will ask user to enter word
							System.out.println("Enter word to write");
							String input = sc.nextLine();
							bw.write(input);//to take the input and write into the file
							bw.newLine();//to skip a line
						}// end of if 
						else {
							System.out.println("Stop");
							cont = true;
						}//end of else for if(choice)
					}// end of while
					bw.close();
					//going to start reader
					FileInputStream  fs = new FileInputStream(f);//assign f to it
					in = new DataInputStream(fs);//assign fs to it
					BufferedReader br = new BufferedReader(new InputStreamReader(in));//assign in to it
					
					String str ; 
					String [] words = null;// later on will be used to store word into it
					int wc = 0;// later on will be used to count how many word 
					
					while((str = br.readLine())!= null) {//while loop will start when br have next line.
						System.out.println(str);//to print out they words in the doc
						words = str.split(" ");//to split whatever words inside after space
						wc = wc+words.length;//add the count to wc by using words.length
						System.out.println("No of word : "+wc);//print out no of word count
					}
					in.close();
					br.close();
					if(f.delete()) {// to delete file
						System.out.println(f+" deleted");//if file delete print message
					} else {//if file not exist
						System.out.println("File not found");
					}
					
			}//end of else for if(contain)
			 
				
			}//end of whileExist
			
			
		} //end of try
		catch (IOException e) {
			System.out.println("Interrupted");
		}//end of catch
	}

}
