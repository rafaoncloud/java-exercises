package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data_types {

    public static void main(String[] args) {
        char c = 'A';
        modifyCharacterPrimitive(c);
        System.out.println(c);
        int i = 1;
        modifyIntegerObj(i);
        System.out.println(i);
        double d = 1.11;
        modifyDoublePrimitive(d);
        System.out.println(d);
        char[] cArr = {'a', 'b', 'c'};
        modifyCharArray(cArr);
        System.out.println(Arrays.toString(cArr));
        int[] iArr = {1, 2, 3};
        modifyIntArray(iArr);
        System.out.println(iArr);
        Integer iObj = 1;
        modifyIntegerObj(iObj);
        System.out.println(iObj);
        Character cObj = 'A';
        modifyCharacterObj(cObj);
        System.out.println(cObj);
        String s = "AAA";
        modifyString(s);
        System.out.println(s);
        StringBuilder sb = new StringBuilder("AAA");
        modifyStringBuilder(sb);
        System.out.println(sb);
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add((char)2);
        list.add((char)3);
        modifyList(list);
        System.out.println(list);
    }

    private static void modifyCharacterPrimitive(char c){
        c += 1;
    }

    private static void modifyIntPrimitive(int i){
        i += 1;
    }

    private static void modifyDoublePrimitive(double d){
        d += 1;
    }

    private static void modifyCharArray(char[] arr){
        arr[0] += 1;
    }

    private static void modifyIntArray(int[] arr){
        arr[0] += 1;
    }

    private static void modifyIntegerObj(Integer i){
        i += 1;
    }

    private static void modifyCharacterObj(Character c){
        int value = c.charValue();
        value += 1;
        c = (char) value;
    }

    private static void modifyString(String s){
        s += "BBB";
    }

    private static void modifyStringBuilder(StringBuilder sb){
        sb.replace(0,2,"B");
    }

    private static void modifyList(List<Character> list){
        list.add(0,(char)(list.get(0) + 1));
    }
}
