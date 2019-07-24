package coreJavaOOP;

import java.util.Arrays;

public class Problem13 {

    static void toPrint() {
        int arr[] = {20,20,30,40,50,50,50}; //step 1 : create array
        Arrays.sort(arr);////step 2: sort array
        int length = arr.length;//step 3: set int length to the array length
        Problem11.removeDupeElement(arr,length);//step 4: call removeDupeElement
        int length1 = arr.length;
        System.out.println(removeDupeElement(arr,length));


        }


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
    }

    public static void main(String[] args) {
        toPrint();
    }
}
