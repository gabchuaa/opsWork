package coreJavaOOP;

public class Problem12 {
	public static void main (String args[]){
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int largest = arr[0];
        int secondLargest = arr[0];
        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }
        System.out.println("Second largest number is:" + secondLargest);
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];

            }
        }
        System.out.println("Second smallest number is:" + secondSmallest);
    }
}



