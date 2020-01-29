package com.exercises.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {50, 10, 23, 56, 100, 3, 1, 10, 20};
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[] res = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }

    private static int[] bubbleSort(final int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
