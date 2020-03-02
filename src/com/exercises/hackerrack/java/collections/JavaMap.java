package com.exercises.hackerrack.java.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] argh) throws FileNotFoundException {

        File file = new File(JavaMap.class.getResource("map-testcase.txt").getPath());
        Scanner in = new Scanner(file);
        Map<String,Integer> phoneNumbersMap = new HashMap<>();

        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneNumbersMap.put(name,phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            if(phoneNumbersMap.containsKey(s)){
                System.out.println(s + "=" + phoneNumbersMap.get(s));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
