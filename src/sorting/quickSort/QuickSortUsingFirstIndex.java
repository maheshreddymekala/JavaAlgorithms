package sorting.quickSort;
import java.util.Arrays;
public class QuickSortUsingFirstIndex {

    public static void main(String[] args) {
        int array [] = new int[] {20,10,2,49,4,1,80,12};
        System.out.println("Array before sorting:"+Arrays.toString(array));
        quickSort(array, 0, array.length-1);
        System.out.println("Array After sorting:"+Arrays.toString(array));


    }
    private static void quickSort(int[] arrayToSort, int low, int high){
        if(low<high){
            int pivot = partition(arrayToSort, low, high);
            quickSort(arrayToSort, low, pivot-1);
            quickSort(arrayToSort, pivot+1, high);
        }


    }
    private static void swap(int[] arrayToSort, int a, int b) {
        int temp = arrayToSort[b];
        arrayToSort[b] = arrayToSort[a];
        arrayToSort[a] = temp;
    }

    private static int partition(int[] arrayToSort, int low, int high) {
        int pivot = arrayToSort[low];
        int l = low;
        int h = high;
        while(l<h) {
            while(arrayToSort[l] <= pivot && l<h){
                l++;
            }
            while(arrayToSort[h]>pivot) {
                h--;
            }
            if(l<h){
                swap(arrayToSort, l, h);
            }
        }
        System.out.println("Pivot: "+pivot+"  list:"+Arrays.toString(arrayToSort));
        swap(arrayToSort,low,h);
        return h;
    }
}
