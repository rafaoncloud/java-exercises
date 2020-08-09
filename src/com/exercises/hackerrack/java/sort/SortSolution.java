package com.exercises.hackerrack.java.sort;

import com.exercises.hackerrack.java.collections.Arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class SortSolution {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(SortSolution.class.getResource("sort-testcase.txt").getPath());
        Scanner in = new Scanner(file);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        // Clean comparing approach
        Collections.sort(studentList,Comparator.comparingDouble(Student::getCgpa).reversed().
                thenComparing(Student::getFname).thenComparingInt(Student::getId));

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}




