package sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Time complexity for quick sort is average is O(n2)
 * space complexity is O(1) extra space
 * O(n2) swaps and O(n2) comparisons
 * *******/
    public static void main(String[] args) {
        int[] arrayToSort =  {6,4,2,1,7,3,5,8,10};
        for(int i=0; i<arrayToSort.length; i++){
            boolean swapped = false;
            for(int j=0; j<i+1; j++) {
                if(arrayToSort[j]>arrayToSort[j+1]) {
                    int temp = arrayToSort[j+1];
                    arrayToSort[j+1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        System.out.println("Sorted array: "+ Arrays.toString(arrayToSort));
    }

}
