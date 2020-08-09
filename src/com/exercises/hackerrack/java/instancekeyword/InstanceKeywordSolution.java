package com.exercises.hackerrack.java.instancekeyword;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


class Student {
}

class Rockstar {
}

class Hacker {
}

public class InstanceKeywordSolution {

    static String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            if (element instanceof Student)
            a++;
            if (element instanceof Rockstar)
            b++;
            if (element instanceof Hacker)
            c++;
        }
        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        return ret;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList mylist = new ArrayList();
        File file = new File(InstanceKeywordSolution.class.getResource("instanceof-testcase.txt").getPath());
        Scanner sc = new Scanner(file);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) mylist.add(new Student());
            if (s.equals("Rockstar")) mylist.add(new Rockstar());
            if (s.equals("Hacker")) mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}
