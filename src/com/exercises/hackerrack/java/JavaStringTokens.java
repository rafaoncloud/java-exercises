package com.exercises.hackerrack.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        if(s == null || s.trim().equals("") ){
            System.out.println('0');
            return;
        }else if(s.length() > 400000 || !s.matches("[A-Za-z !,?._'@]+")){
            return;
        }

        // The plus sign splits with any size of blank spaces
        String[] arr = s.trim().split("[ !,?.\\\\_'@]+");
        System.out.println(arr.length + " " + Arrays.toString(arr));

        scan.close();
    }
}
