package com.exercises.hackerrack.java.md5;

import java.util.*;

/**
 * Sample Input
 * HelloWorld
 *
 * Sample Output
 * 68e109f0f40ca72a15e05cc22786f8e6
 */
public class JavaMD5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static byte[] getMD5(String text){
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(text.getBytes());

            return messageDigest;
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String toHexString(byte[] bytes){
        String hashPrintable = "";
        for (byte b : bytes) {
            hashPrintable += String.format("%02x", b);
        }
        return hashPrintable;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String input = scanner.nextLine();

        byte[] hash = getMD5(input);
        String hexPrintable = toHexString(hash);

        System.out.println(hexPrintable);
    }
}

