package com.exercises.hackerrack.java;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat formatterUS = NumberFormat.getCurrencyInstance(new Locale("en","US"));
        NumberFormat formatterIndia = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat formatterChina = NumberFormat.getCurrencyInstance(new Locale("zh","CN"));
        NumberFormat formatterFrance = NumberFormat.getCurrencyInstance(new Locale("fr","FR"));

        String us = formatterUS.format(payment);
        String india = formatterIndia.format(payment);
        String china = formatterChina.format(payment);
        String france = formatterFrance.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
