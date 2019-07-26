package corejava;

import java.util.Arrays;

public class Problem12 {

	static void findSecondLargest(int arr[],int length) {
		int i, first, second;
		first = second = Integer.MIN_VALUE;
		for (i = 0; i < length ; i++)
		{
            /* If current element is smaller than
            first then update both first and second */
			if (arr[i] > first)
			{
				second = first;
				first = arr[i];
			}

            /* If arr[i] is in between first and
               second then update second  */
			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.println("There is no second largest"+
					" element\n");
		else
			System.out.println("The second largest element"+
					" is "+ second);
	}





	static void findSecondSmallest(int arr[],int length) {

		int first, second, arr_size = arr.length;

		/* There should be atleast two elements */
		if (arr_size < 2)
		{
			System.out.println(" Invalid Input ");
			return;
		}

		first = second = Integer.MAX_VALUE;
		for (int i = 0; i < arr_size ; i ++)
		{
            /* If current element is smaller than first
              then update both first and second */
			if (arr[i] < first)
			{
				second = first;
				first = arr[i];
			}

            /* If arr[i] is in between first and second
               then update second  */
			else if (arr[i] < second && arr[i] != first)
				second = arr[i];
		}
		if (second == Integer.MAX_VALUE)
			System.out.println("There is no second" +
					"smallest element");
		else
			System.out.println("The second Smallest" +
					" element is " + second);

	}

	static void toPrint(){
		int arr[] = new int[]{10, 20, 40, 87, 2, 45};
		Arrays.sort(arr);
		int length = arr.length;
		Problem12.findSecondLargest(arr,length);
		Problem12.findSecondSmallest(arr,length);
	}



	public static void main(String args[]) {
		toPrint();

	}
}
			
			
			
		


