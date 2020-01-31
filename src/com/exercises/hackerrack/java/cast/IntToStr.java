package com.exercises.hackerrack.java.cast;

import java.util.Calendar;
import java.util.Scanner;

public class IntToStr {

    public static void main(String[] args) {
        //Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        try{
            String str = String.valueOf(n);
            System.out.println("Good job");
        }catch(Exception e){
            System.out.println("Wrong answer");
        }
    }
}
