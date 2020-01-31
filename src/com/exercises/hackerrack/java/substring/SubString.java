package com.exercises.hackerrack.java.substring;

import java.util.Scanner;

/**
 * Sample Input
 * Helloworld
 * 3 7
 *
 * Sample Output
 * lowo
 */
public class SubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}
