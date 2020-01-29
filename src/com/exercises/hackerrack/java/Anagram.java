package com.exercises.hackerrack.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Sample Input
 * debit card
 * bad credit
 *
 * Sample Output
 * Anagrams
 */
public class Anagram {

    private static boolean isAnagram(String a, String b) {
        // Remove whitespaces
        a = a.replaceAll("\\s","").toLowerCase();
        b = b.replaceAll("\\s","").toLowerCase();

        if(a.length() != b.length()){
            return false;
        }

        a = sortString(a);
        b = sortString(b);

        for(int idx = 0; idx < a.length(); idx++){
            if(a.charAt(idx) != b.charAt(idx)){
                return false;
            }
        }
        return true;
    }

    private static String sortString(String a){
        char[] chars;
        chars = a.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
