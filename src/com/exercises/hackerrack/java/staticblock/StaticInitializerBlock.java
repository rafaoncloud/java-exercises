package com.exercises.hackerrack.java.staticblock;

import java.util.Scanner;

public class StaticInitializerBlock {

    private static Scanner scanner = new Scanner(System.in);
    private static int B = scanner.nextInt();
    private static int H = scanner.nextInt();
    private static boolean flag = false;

    static{
        if(B <= 0 || H <= 0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            flag = true;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
