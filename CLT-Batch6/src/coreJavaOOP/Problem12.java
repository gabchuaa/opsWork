package coreJavaOOP;

import java.util.Arrays;

public class Problem12 {
	public static void main(String args[] ) {
		
		int arr[] = new int []{10,20,40,87,2,45};
		Arrays.sort(arr);
		int largest = arr[0];
		int smallest =arr [0];
		int secondSmallest= arr[0];
		int	secondLargest = arr[0];
		
		for(int i =0; i<arr.length;i++) {
			
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
				
			}    else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i]; 
			} else if(arr[i]<smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if(arr[i] < secondSmallest && arr[i] !=smallest) {
				secondSmallest = arr[i];
			}
                
			
        }  
          
        if (secondLargest == Integer.MIN_VALUE || secondSmallest == Inte) 
             System.out.print("There is no second largest"+ 
                                 " element\n"); 
        else
             System.out.print("The second largest element"+ 
                                      " is "+ secondLargest); 
    } 
			}
			
			
			
		


