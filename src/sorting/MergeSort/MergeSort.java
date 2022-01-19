package sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {

    private static void split(int[] arrayToSort, int[] arrayFirstPart, int[] arraySecondPart) {
        for(int i = 0; i < arrayToSort.length; i++) {
            if(i<arrayFirstPart.length) {
                arrayFirstPart[i] = arrayToSort[i];
            } else {
                arraySecondPart[i-arrayFirstPart.length] = arrayToSort[i];
            }
            System.out.println("Split Array First part"+ Arrays.toString(arrayFirstPart) + "  second part"+ Arrays.toString(arraySecondPart));

        }

    }
    private static void merge(int[] arrayToSort, int[] arrayFirstPart, int[] arraySecondPart) {
        int mergeIndex = 0;
        int firstIndex = 0;
        int secondIndex = 0;

        while(firstIndex < arrayFirstPart.length && secondIndex < arraySecondPart.length) {
            if(arrayFirstPart[firstIndex] <= arraySecondPart[secondIndex]){
                arrayToSort[mergeIndex] = arrayFirstPart[firstIndex];
                firstIndex++;
            } else if(arraySecondPart[secondIndex] <= arrayFirstPart[firstIndex]) {
                arrayToSort[mergeIndex] = arraySecondPart[secondIndex];
                secondIndex++;
            }
            mergeIndex++;
        }
        if(firstIndex < arrayFirstPart.length){
            while(mergeIndex < arrayToSort.length) {
                arrayToSort[mergeIndex++] = arrayFirstPart[firstIndex];
            }
        }
        if(secondIndex < arraySecondPart.length) {
            while(mergeIndex < arrayToSort.length) {
                arrayToSort[mergeIndex++] = arraySecondPart[secondIndex++];
            }
        }

    }
    private static void mergeSort(int[] arrayToSort) {
        int arrayLength = arrayToSort.length;
        if(arrayLength == 1) {
            return;
        }
        int midPoint = arrayLength/2;
        int[] arrayFirstPart = new int[midPoint];
        int[] arraySecondPart = new int[arrayLength-midPoint];
        split(arrayToSort, arrayFirstPart, arraySecondPart);

        mergeSort(arrayFirstPart);
        mergeSort(arraySecondPart);

        merge(arrayToSort, arrayFirstPart, arraySecondPart);
        System.out.println("Sorted Array"+ Arrays.toString(arrayToSort));

    }

    public static void main(String[] args) {
        int array [] = new int[] {20,10,2,2,49,4,1,80,2,12};
        mergeSort(array);
    }
}
