package coreJavaOOP;

import java.util.Arrays;

public class Problem11 {
	
	static void toPrint() {
		int arr[] = {1,2,3,1,2,3,4}; //step 1 : create array 
		Arrays.sort(arr);////step 2: sort array
		int length = arr.length;//step 3: set int length to the array length
		Problem11.removeDupeElement(arr,length);//step 4: call removeDupeElement
		for(int i =0;i<length;i++) { 
			if (arr[i]==4) {
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i]+",");
			
		
		}
	}//end of toPrint
	
	static int removeDupeElement(int arr[],int n) {//step 5
		  int replaceIndex = 0;
	        int i,j;
	        for(i=0; i<n; i++){ //step 6: loop i<n
	            for(j=i+1; j<n; j++){//step 7: at the same time start a j loop which start at a value ahead of i
	                if(arr[j]!=arr[i]){//step8: if array value is different from i and j it will go skip array and go to the next step
	                    break;
	                }
	            }
	            
	            arr[replaceIndex++] = arr[i];// arr[i] is copied to arr[replaceIndex]
	            i = j-1; // to avoid scanning duplicate element
	            
	        }
	       
	        return replaceIndex;
	    }//end of removeDupeElement
		
	
	
public static void main(String []args) {
	toPrint();
}
}

	
	


