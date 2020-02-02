package com.exercises.stringManipulations;

import java.util.Scanner;

public class IncrementChar {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine(); // fun times
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++){

            if(chars[i] == 'z')
                chars[i] = 'a';
            else if(chars[i] == 'Z')
                chars[i] = 'A';
            else if(Character.isAlphabetic(chars[i]))
                chars[i] += 1;

            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' ||
                chars[i] == 'o' || chars[i] == 'u')
                chars[i] = Character.toUpperCase(chars[i]);
        }

        System.out.println(String.valueOf(chars));
    }
}
