package com.exercises.algorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {50, 10, 23, 56, 100, 3, 1, 10, 20};
        System.out.println(Arrays.toString(arr));
        System.out.println();

        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }
    /**
     *  low: Starting index,  high: Ending index */
    private static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int partition_index = partition(arr, low, high);

            quickSort(arr, low, partition_index - 1);  // Before partition index
            quickSort(arr, partition_index + 1, high); // After partition index
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element
        for (int j=low; j<high; j++)
        {
            if (arr[j] < pivot) // If current element is smaller than the pivot
            {
                i++;
                int temp = arr[i]; // swap arr[i] and arr[j]
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
