package coreJavaOOP;

public class Problem10 {
	public static void main(String a[]){
	    int[] arr1 = {1,5,10,20,40,80};
	    int[] arr2 = {6,7,20,80,100};
	    int[] arr3 = {3,4,15,20,30,70,80,120};
	    for(int i=0;i<arr1.length;i++){//start arr1
	        for(int j=0;j<arr2.length;j++){//start arr2
	            for(int k=0;k<arr3.length;k++){//start arr3 //loop from arr1 to arr3
	                if((arr1[i]== arr2[j]) & arr1[i]==arr3[k]){//if any element is same from the 3 array
	                    System.out.print(arr1[i] +" ");//it will be printed out here
	                }
	            }

	        }
	    }
	}

}
