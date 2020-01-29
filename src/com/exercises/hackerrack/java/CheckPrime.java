package com.exercises.hackerrack.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime{
    public void checkPrime(int... args){
        for (int arg : args) {
            boolean flag = true;
            int sqrt = (int)Math.round(Math.sqrt(arg));
            for(int i = 2; i <= sqrt; i++){
                if(arg % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag && arg != 1){
                System.out.print(arg + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num){
        boolean flag = true;
        int sqrt = (int)Math.round(Math.sqrt(num));
        for(int i = 2; i <= sqrt; i++){
            if(num % i == 0){
                flag = false;
                return false;
            }
        }
        if(flag && num != 1){
            return true;
        }
        return false;
    }
}

/**
 * Sample Input
 * 2
 * 1
 * 3
 * 4
 * 5
 *
 * Sample Output
 * 2
 * 2
 * 2 3
 * 2 3 5
 */
public class CheckPrime {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}


