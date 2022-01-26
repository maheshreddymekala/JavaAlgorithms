package sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    /**
     * Time complexity for quick sort is average is O(n2)
     * space complexity is O(1) extra space
     * O(n2) swaps and O(n2) comparisons
     * *******/
    public static void main(String[] args) {
        int[] arrayToSort =  {6,4,2,1,7,3,5,8,10};
        for(int i=0; i<arrayToSort.length-1; i++){
            for(int j=i+1; j>0; j--) {
                int x = j-1;
                if(arrayToSort[j]<arrayToSort[x]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[x];
                    arrayToSort[x] = temp;
                } else {
                    break;
                }
            }

        }
        System.out.println("Sorted array: "+ Arrays.toString(arrayToSort));
    }

}
