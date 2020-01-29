package com.exercises.hackerrack.java;


import java.util.Scanner;

/**
 * Sample Input
 * welcometojava
 * 3
 *
 * Sample Output
 * ava
 * wel
 */
public class JavaSubstringComparisons {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(getSmallestAndLargest(scanner.nextLine(),scanner.nextInt()));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0; i <= s.length() - k; i++){
            String word = s.substring(i,i+k);

            if(word.compareTo(smallest) < 0){
                smallest = word;
            }else if(word.compareTo(largest) > 0){
                largest = word;
            }
        }
        return smallest + "\n" + largest;
    }
}
