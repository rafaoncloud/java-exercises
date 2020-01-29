package com.exercises.hackerrack.java;

import java.util.Scanner;

/**
 *  Sample Input
 *  2
 *  0 2 10
 *  5 3 5
 *
 *  Sample Output
 *  2 6 14 30 62 126 254 510 1022 2046
 *  8 14 26 50 98
 */
public class JavaLoop2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            String result = "";
            for(int threshold = 0; threshold < n; threshold++){
                int serie = a;
                for(int idx = 0; idx <= threshold; idx++){
                    serie += Math.pow(2, idx) * b;
                }
                result += serie + " ";
            }
            System.out.println(result);
        }
        in.close();
    }
}
