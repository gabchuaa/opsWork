package day13;


import java.io.*;

public class Reader1 {

	public static void main(String[] args) throws IOException {

		DataInputStream in = null;
		try {
			// Open the file that is the first command line parameter
			//FileInputStream fs = new FileInputStream("c:\\file\\demo.txt"); // Absolute path
			FileInputStream fs = new FileInputStream ("Sample.txt");
			// Get the object of DataInputStream
			in = new DataInputStream(fs);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String str;
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			
		} catch (Exception e ) { // Catch Exceptiom
		  System.out.println("File not found");
		}
		
		finally {
			in.close();
		}
	}

}