package com.exercises.hackerrack.java;

import java.util.Scanner;

public class IfElse {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if(n % 2 != 0){
            System.out.println("Weird");
        }else if(n == 2 || n == 4 || n > 20){
            System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }
    }
}
