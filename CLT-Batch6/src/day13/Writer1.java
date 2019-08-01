package day13;
import java.io.*;
class Reader{
	DataInputStream in = null;
	public void toReader() throws IOException {
		try {
			FileInputStream fs = new FileInputStream("abcxyz.doc");
			in = new DataInputStream(fs);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e ) { // Catch Exception
			  System.out.println("File not found");
			}
			
			finally {
				in.close();
			}
	}
	}
	


public class Writer1 {
	
	public static void main(String [] args) {
		Reader refReader = new Reader();
		try {
			boolean newFile = false;
			File f = new File("abcxyz.doc");
			System.out.println(f.exists() +" First check for file");//look for a real file // false true
			
			newFile = f.createNewFile();//maybe create a file!
			System.out.println(newFile+" If file not found it will create new file");
			System.out.println(f.exists()+" Second check for file"); //look again */ // true false
			
			FileWriter fw = new FileWriter("abcxyz.doc");
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write("this is filewrite");
			//br.flush();
			br.newLine();
			//br.flush();
			br.write("thank you..");
			br.newLine();
			br.write("Java");
			br.newLine();
			br.write("SAP");
			br.newLine();
			br.write(".Net");
			br.close();
			refReader.toReader();
		} catch (IOException e){
			System.out.println("File not found");
		} 
		
		
	}

}
