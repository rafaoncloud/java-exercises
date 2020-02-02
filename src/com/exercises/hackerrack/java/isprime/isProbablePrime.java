package com.exercises.hackerrack.java.isprime;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.Scanner;

public class isProbablePrime {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //String n = scanner.nextLine();

        // The following number is prime
        String n = "20988936657440586486151264256610222593863921";
        BigInteger bigInteger = new BigInteger(n);
        System.out.println(bigInteger.isProbablePrime(1) ? "prime" : "not prime");

        // The following number is not prime
        n = "20988936657440586486151264256610222593863922";
        bigInteger = new BigInteger(n);
        System.out.println(bigInteger.isProbablePrime(1) ? "prime" : "not prime");

    }
}
