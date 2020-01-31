package com.exercises.hackerrack.java.stdinstdout;

import java.util.Scanner;

/**
 * Sample Input
 * java 100
 * cpp 65
 * python 50
 *
 * Sample Output
 * ================================
 * java           100
 * cpp            065
 * python         050
 * ================================
 */
public class OutputFormating {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next(); // Word
            int x=sc.nextInt(); // Number
            //Complete this line
            int stringLen = s1.length();
            int numEmptySpaces = 15 - stringLen;
            String spaces = "";
            for(int idx = 0; idx < numEmptySpaces; idx++){
                spaces += ' ';
            }

            String xString = String.valueOf(x);
            while(xString.length() < 3){
                xString = String.valueOf('0' + xString);
            }
            System.out.println(s1 + spaces + xString);
        }
        System.out.println("================================");
    }
}
