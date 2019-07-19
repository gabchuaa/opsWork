package coreJavaOOP;

public class Problem8 {
	public static void main(String[]args) {
		int i,j;
		for(i = 5;i > 1;i--) {
			
				for(j = 0; j<i;j++) {
					System.out.print("*"+" ");
				}
				for(int k = 0;k<(j-2);k++) {
					System.out.print("*"+" ");
				}
				if(i==2) {
					System.out.print("\n*");
				}
				
				System.out.println("\n");

		}
		
	}

}
