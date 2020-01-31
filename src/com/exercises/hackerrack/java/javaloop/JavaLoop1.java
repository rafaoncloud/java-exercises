package com.exercises.hackerrack.java.javaloop;

import java.util.Scanner;

public class JavaLoop1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N < 2 || N > 20){
            return;
        }
        for(int i = 1; i <= 10; i++){
            int res = N * i;
            System.out.println(N + " x " + i + " = " + res);
        }
        scanner.close();
    }
}
