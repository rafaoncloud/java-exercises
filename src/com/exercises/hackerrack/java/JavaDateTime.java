package com.exercises.hackerrack.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class JavaDateTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(year,month - 1,day, 0,0,0);
        Date date = calendar.getTime();
        System.out.println(date);
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        return simpleDateformat.format(date);
    }


    public static void main(String[] args) throws IOException {

        int month = 8;
        int day = 5;
        int year = 2015;

        String res = JavaDateTime.findDay(month, day, year);
        System.out.println(res);
    }
}
