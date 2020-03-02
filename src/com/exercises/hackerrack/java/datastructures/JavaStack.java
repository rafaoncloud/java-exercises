package com.exercises.hackerrack.java.datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * TEST CASE:
 * {}()   true
 * ({()}) true
 * {}(    false
 * []     true
 */
public class JavaStack {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(JavaStack.class.getResource("stack-testcase.txt").getPath());
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String input=sc.next();
            if(isBalanced(input))
                System.out.println("true");
            else
                System.out.println("false");
        }

        sc.close();
    }

    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {

                if (ch == ']' && !stack.isEmpty() && stack.pop() == '[') {
                    continue;
                } else if (ch == '}' && !stack.isEmpty() && stack.pop() == '{') {
                    continue;
                } else if (ch == ')' && !stack.isEmpty() && stack.pop() == '(') {
                    continue;
                } else {

                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
