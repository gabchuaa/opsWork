package corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11Practice {
	
	static void toPrint() {
		int arr [] = {1,2,3,1,2,3,4};
		Arrays.sort(arr);
		int length = arr.length;
		Problem11.removeDupeElement(arr, length);
		for(int i =0;i<length;i++) {
			if(arr[i] == 4) {
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i]+", ");
		
		
		}
}
	
	static int removeDupeElement(int arr[],int n) {
		 int replaceIndex = 0;
		 int i,j;
		 for( i = 0;i<n;i++) {
			 for(j = i+1;j<n;j++) {
				 if(arr[i]!=arr[j]) {
					 break;
				 }
			 }
			 arr [replaceIndex++] = arr[i];
			 i = j-1;
			 
	    }
		 return replaceIndex;}
	
		
	
	
public static void main(String []args) {
	toPrint();
}
}
