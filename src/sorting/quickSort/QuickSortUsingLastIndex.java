package sorting.quickSort;

import java.util.Arrays;

public class QuickSortUsingLastIndex {
/**
 * Time complexity for quick sort is average is (nlogn)
 * space complexity is O(Logn) extra space
 * worst case for space complexity is O(N)
 * **/
    private static void swap(int[] arrayToSort, int low, int high) {
        int temp = arrayToSort[high];
        arrayToSort[high] = arrayToSort[low];
        arrayToSort[low] = temp;

    }

    private static int partition(int[] arrayToSort, int low, int high) {
        int pivot = arrayToSort[high];
        int l = low;
        int h = high;
        while(l<h) {
            while(arrayToSort[l]<=pivot && l<h) {
                l++;
            }
            while(arrayToSort[h] > pivot) {
                h--;
            }
            if(l<h) {
                swap(arrayToSort, l, h);
            }
        }
        swap(arrayToSort, l, high);
        return l;
    }

    private static void quickSort(int[] arrayToSort, int low, int high) {
        if(low<high) {
            int pivot = partition(arrayToSort, low, high);
            quickSort(arrayToSort, low, pivot-1);
            quickSort(arrayToSort, pivot+1, high);
        }

    }

    public static void main(String[] args){
        int[] arrayToSort =  {6,4,2,1,7,3,5,8,10};
        quickSort(arrayToSort, 0, arrayToSort.length-1);
        System.out.println("Sorted array: "+ Arrays.toString(arrayToSort));
    }
}
