package com.exercises.hackerrack.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaStdinStdout {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        try{
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Number is not an Integer!");
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


