package com.exercises.hackerrack.java.bigvalues;

import java.util.*;

public class BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        java.math.BigInteger num1 = new java.math.BigInteger(sc.next());
        java.math.BigInteger num2 = new java.math.BigInteger(sc.next());

        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}