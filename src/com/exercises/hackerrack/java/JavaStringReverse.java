package com.exercises.hackerrack.java;

import java.util.Scanner;

/**
 * Sample Input
 * madam
 *
 * Sample Output
 * Yes
 */
public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(JavaStringReverse.isPalindrome(A))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public static boolean isPalindrome(String s){
        int end = s.length() - 1;

        for(int start = 0; start < (s.length() / 2) ;start++){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            end--;
        }
        return true;
    }
}
