package com.exercises.hackerrack.java.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaList {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(JavaList.class.getResource("list-testcase.txt").getPath());
        Scanner scanner = new Scanner(file);

        // Size of the list
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> list = null;
        String queryInput = null;

        // Get a list with the input values separated with blank spaces
        String inputStr = scanner.nextLine();
        int [] arr = Stream.of(inputStr.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // Perform queries
        int q = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < q; i++){
            inputStr = scanner.nextLine();
            queryInput = scanner.nextLine();
            arr = Stream.of(queryInput.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if(inputStr.trim().equalsIgnoreCase("Insert")){
                    list.add(arr[0],arr[1]);
            }else if(inputStr.trim().equalsIgnoreCase("Delete")){
                list.remove(arr[0]);
            }
        }

        for(Integer val : list)
            System.out.print(val + " ");
    }
}
