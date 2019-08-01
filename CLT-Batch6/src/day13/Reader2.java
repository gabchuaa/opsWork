package day13;
import java.io.*;

public class Reader2 {

	public static void main(String[] args) throws IOException{
		FileReader fr = null;
		
		try {
			
		fr = new FileReader("Sample.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		
		}
		catch(IOException e) {
			
			System.out.println("File not found");
		
		}
		finally {
			
			fr.close();
		
		}
	}

}