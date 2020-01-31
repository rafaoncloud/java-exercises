package com.exercises.hackerrack.java.singleton;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class JavaSingletonPattern{

    public static JavaSingletonPattern singleInstance = null;
    public String str = "";

    private JavaSingletonPattern(){}

    public static JavaSingletonPattern getSingleInstance(){
        if(singleInstance == null){
            singleInstance = new JavaSingletonPattern();
        }
        return singleInstance;
    }

    public void printString() {
        System.out.println("Hello I am a singleton! Let me say " + str + " to you");
    }

    public static void main(String[] args) {
        JavaSingletonPattern instance = JavaSingletonPattern.getSingleInstance();
        Scanner scanner = new Scanner(System.in);

        instance.str = scanner.nextLine();
        instance.printString();
    }
}
