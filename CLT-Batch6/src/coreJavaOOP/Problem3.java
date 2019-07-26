package coreJavaOOP;

public class Problem3 {
public static void main(String []args) {
		
		int i,j;
		for(i=1; i<=6; i++) {
			for(j=0; j<i;j++) {
				System.out.print((char)(i+64));//cast char and +64 ref to ascii table
			}									// in this case i+64 = 65 which mean is letter a
			System.out.println();				// following increment will be B and so on
			
		}
	}

}
