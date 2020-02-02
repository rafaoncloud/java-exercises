package com.exercises.hackerrack.java.lambdaexpressions;

import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here
    public static PerformOperation isOdd(){
        return (int a) -> a % 2 != 0;
    }
    public static PerformOperation isPrime(){
        return (int a) -> {
            int sqrt = (int) java.lang.Math.sqrt(a);
            for(int i = 2; i <= sqrt; i++){
                if(a % 2 == 0)
                    return false;
            }
            return true;
        };
    }
    public static PerformOperation isPalindrome(){
        return (int a) -> {
            int sum = 0, r;
            int temp = a;
            while(a > 0)
            {
                r = a % 10;
                sum = (sum*10)+r;
                a = a/10;
            }
            if(temp==sum)
                return true;

            return false;
        };
    }
}

/**
 * Sample Input
 * 10
 * 3 1234321
 */
public class LambdaExpression {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

