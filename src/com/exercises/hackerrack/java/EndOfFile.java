package com.exercises.hackerrack.java;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int countLines = 0;
        while(scanner.hasNextLine()){
            System.out.println(++countLines + " " + scanner.nextLine());
        }
    }
}
