package day13;
import java.io.*;
import java.util.Scanner;
public class ReadAndWrite {
	
	public static void main(String []args) {
		DataInputStream in = null;
		Scanner sc = new Scanner(System.in);
		String  choice ;
		try {
			boolean newFile = false;
			System.out.println("Creating a file... Enter the name for it" + "example abc.doc");
			 String createFile = sc.next();
			 sc.nextLine();
			 
			File f = new File(createFile);
			System.out.println(f.exists()  );
			
			System.out.println(f.createNewFile());
			System.out.println(f.exists() );
			
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			boolean exist = false;
			
			while (!exist) {
				System.out.println("Do you want to enter text into your file?");
				choice = sc.next();
				sc.nextLine();
				if(choice.equals("yes")) {
					System.out.println("Enter input");
					String input = sc.nextLine();
					bw.write(input);
					bw.newLine();
			} else {
				exist = true;
			}
				}
			bw.close();
			
			FileInputStream fs = new FileInputStream(f);
			in = new DataInputStream(fs);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String str;
			String []words = null;
			int wc = 0;
			while((str = br.readLine())!=null) {
				System.out.println(str);
				words = str.split(" ");
				wc = wc+words.length;
			}
			in.close();
			System.out.println("Number of word is "+wc);
		} catch (IOException e) {
			
		} finally {
			
		}
	}

}
