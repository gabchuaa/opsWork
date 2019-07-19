package coreJavaOOP;

public class Problem10 {
	public static void main(String a[]){
	    int[] arr1 = {1,5,10,20,40,80};
	    int[] arr2 = {6,7,20,80,100};
	    int[] arr3 = {3,4,15,20,30,70,80,120};
	    for(int i=0;i<arr1.length;i++){
	        for(int j=0;j<arr2.length;j++){
	            for(int k=0;k<arr3.length;k++){
	                if((arr1[i]== arr2[j]) & arr1[i]==arr3[k]){
	                    System.out.print(arr1[i] +" ");
	                }
	            }

	        }
	    }
	}

}
