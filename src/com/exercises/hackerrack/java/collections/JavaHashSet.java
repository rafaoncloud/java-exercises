package com.exercises.hackerrack.java.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * TEST CASE:
 * 5
 * john tom
 * john mary
 * john tom
 * mary anna
 * mary anna
 */
public class JavaHashSet {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(JavaHashSet.class.getResource("hashset-testcase.txt").getPath());
        Scanner in = new Scanner(file);

        int t = in.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = in.next();
            pair_right[i] = in.next();
        }
    }
}
