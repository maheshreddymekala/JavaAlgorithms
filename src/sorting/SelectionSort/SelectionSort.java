package sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
/**
 * Time complexity for quick sort is average is O(n2)
 * space complexity is O(1) extra space
 * O(n) swaps
 * *******/
    public static void main(String[] args) {
        int[] arrayToSort =  {6,4,2,1,7,3,5,8,10};
        for(int i=0; i<arrayToSort.length; i++) {
            for(int j=i+1; j<arrayToSort.length; j++) {
                if(arrayToSort[i]>arrayToSort[j]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[i];
                    arrayToSort[i] = temp;
                }
            }
        }
        System.out.println("Sorted array: "+ Arrays.toString(arrayToSort));
    }
}
