package com.exercises.hackerrack.java.bitset;

import java.io.*;
import java.util.*;

/**
 * Input Format
 * n — length of the 2 bitsets (B1 and B2)
 * m — the number of operations to perform
 *
 * Possible Operations
 * AND <set> <set>
 * OR <set> <set>
 * XOR <set> <set>
 * FLIP <set> <index>
 * SET <set> <index>
 *
 * <set> takes value 1 or 2
 * <index> integer denoting a bit's index in the BitSet corresponding to a <set>
 * The result is assigned to the left operand: B2 and B1 to B2
 *
 */
public class BitSetSolution {

    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        File file = new File(BitSetSolution.class.getResource("bitset-testcase.txt").getPath());
        Scanner in = new Scanner(file);

        int N = in.nextInt();
        BitSet[] bitSetArr = new BitSet[2];
        bitSetArr[0] = new BitSet(N);
        bitSetArr[1] = new BitSet(N);

        int M = in.nextInt();
        for(int i = 0; i < M; i++){
            String operation = in.next();
            int operand1 = in.nextInt();
            int operand2 = in.nextInt();
            operand1--;
            switch (operation.toUpperCase()){
                case "AND":
                    operand2--;
                    bitSetArr[operand1].and(bitSetArr[operand2]);
                    break;
                case "OR":
                    operand2--;
                    bitSetArr[operand1].or(bitSetArr[operand2]);
                    break;
                case "XOR":
                    operand2--;
                    bitSetArr[operand1].xor(bitSetArr[operand2]);
                    break;
                case "FLIP":
                    bitSetArr[operand1].flip(operand2);
                    break;
                case "SET":
                    bitSetArr[operand1].set(operand2);
                    break;
                default:
                    break;
            }
            System.out.println(bitSetArr[0].cardinality() + " " + bitSetArr[1].cardinality());
        }
        in.close();
    }

    public static String printBitSet(BitSet bitSet){
        String str = "";
        for(int i = 0; i < bitSet.size(); i++){
             str += String.valueOf(bitSet.get(i) ? 1 : 0);
        }
        return str;
    }
}
