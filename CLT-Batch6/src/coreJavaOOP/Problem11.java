package coreJavaOOP;

import java.util.Arrays;

public class Problem11 {
	
	public static int removedupe(int arr[], int n) {
		if (n==0 || n==1) {
			return n;
		}
		
		int temp []= new int [n];
		int j = 0;
		for (int i = 0; i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp [j++]=arr[n-1];
		
		for(int i=0;i<j;i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String []args) {
		int arr[] = {1,2,3,1,2,3,4};
		Arrays.sort(arr);
		int length = arr.length;
		length = removedupe(arr,length);
		//print array
		for(int i =0; i<length;i++) {
			if(arr[i] ==4 ) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i]+", ");
			}
			}
		}
		
	}

	
	


