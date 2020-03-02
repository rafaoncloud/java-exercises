package com.exercises.hackerrack.java.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TEST CASE:
 * 5
 * 5 41 77 74 22 44
 * 1 12
 * 4 37 34 36 52
 * 0
 * 3 20 22 33
 * 5
 * 1 3
 * 3 4
 * 3 1
 * 4 3
 * 5 5
 */
public class Arraylist {

    public Arraylist() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Enter your code here. Read input from STDIN.
        // Print output to STDOUT.
        File file = new File(Arraylist.class.getResource("arraylist-testcase.txt").getPath());
        Scanner scanner = new Scanner(file);
        System.out.print("Read n: ");
        int n = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> list = new ArrayList<>();

        System.out.println("Reading integer arrays...");
        for(int i = 0; i < n; i++){
            String inputStr = scanner.nextLine();
            int [] arr = Stream.of(inputStr.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            List<Integer> asList = Arrays.stream(arr).boxed().collect(Collectors.toList());
            asList.remove(0); // Size of the list
            list.add(asList);
        }
        System.out.print("Read q: ");
        int q = Integer.parseInt(scanner.nextLine());
        System.out.println("Reading queries [x y]...");
        for(int i = 0; i < q; i++){
            String inputStr = scanner.nextLine();
            int [] arr = Stream.of(inputStr.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            try {
                int row = arr[0] - 1;
                int col = arr[1] - 1;
                System.out.println(list.get(row).get(col));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
