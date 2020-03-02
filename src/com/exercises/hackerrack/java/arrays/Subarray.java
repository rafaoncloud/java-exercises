package com.exercises.hackerrack.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN.
        // Print output to STDOUT.

        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //int[] arr = new int[n];

        int n = 5;
        int[] arr = {1, -2, 4, -5, 1};

        int countNegativeSubArrays = 0;
        int sum = 0;

        /*for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }*/

        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                // end is exclusive
                int[] subarray = Arrays.copyOfRange(arr,start,end + 1);
                sum = Arrays.stream(subarray).sum();

                if(sum < 0){
                    countNegativeSubArrays++;
                }
            }
        }
        System.out.println(countNegativeSubArrays);
    }
}
