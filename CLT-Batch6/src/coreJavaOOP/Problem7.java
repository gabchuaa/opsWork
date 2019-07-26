package coreJavaOOP;

public class Problem7 {
	public static void main(String[] args) {
	    for (int i = 1; i <= 5; i++)
	    {
	        int temp = i;//assign temp to i value
	        for (int j = 1; j <= i; j++)
	        {
	            System.out.print(temp + " ");
	            temp = temp + 1; // once temp is print it will increment by 1
	        }					 // result will only show on 2nd iterator and so on
	        temp = temp - 2; // by doing temp = temp-2 is to apply for k loop
							 //the value will always be the same as the first
	        for (int k = i - 1; k >= 1; k--)
	        {
	            System.out.print(temp + " ");//
	            temp = temp - 1;
	        }
	        System.out.println();
	    }
	}


}




