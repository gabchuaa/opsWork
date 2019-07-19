package coreJavaOOP;

public class Problem6 {
public static void main(String[]args) {
	int i,j;
	for(i = 1;i < 6;i++) {
		for(j = 0; j<i;j++) {
			System.out.print("*"+" ");
		}
		for(int k = 0;k<(j-2);k++) {
			System.out.print("*"+" ");
			
		}
		System.out.println("\n");
	}
	
}
}

