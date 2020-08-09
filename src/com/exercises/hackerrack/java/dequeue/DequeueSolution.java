package com.exercises.hackerrack.java.dequeue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Dequeue -  abstract data type that generalizes a queue, for which elements
// can be added to or removed from either the front (head) or back (tail)

// N — total number of integers
// M — size of the subarray

// Find the maximum number of unique integers among all the possible contiguous subarrays of size
// Time limit is 3 seconds for this problem with M and N up to 100000

// Output: Print the maximum number of unique integers among all possible contiguous subarrays of size.

// Example
// 6 3 (M and N)
// 5 3 5 2 3 2 (integers)

// s1 = {5,3,5} Has 2 unique numbers
// s2 = {5,3,2} Has 3 unique numbers (maximum amount of unique numbers found)
// ...
// s4 = {2,3,2} Has 2 unique numbers

// Instead of read everything and keep in an array,

public class DequeueSolution {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(DequeueSolution.class.getResource("dequeue-testcase.txt").getPath());
        Scanner in = new Scanner(file);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            set.add(num);

            if(deque.size() == m){
                max = set.size() > max ? set.size() : max; // Unique values
                int first = deque.remove();
                // Remove the first value from subarray in the set if it's not presented in
                // the subarray portion, before adding the remaining num (i.e., next num)
                if(!deque.contains(first)){
                    set.remove(first);
                }
            }
        }
        System.out.println(max);
    }
}



