package com.exercises.hackerrack.java.priorityqueue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/*class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // Student with the highest cumulative GPA is served first
        // Descending
        if (o1.getCgpa() < o2.getCgpa())
            return 1;
        else if (o1.getCgpa() > o2.getCgpa()) {
            return -1;
        }

        // Ascending order
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        }

        // Ascending order
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        }
        return 0;
    }
}*/

class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {

    private Queue<Student> studentQueue;

    /**
     * @param events
     * @return students yet to to be served in a priority order
     */
    public List<Student> getStudents(List<String> events) {
        List<Student> orderedStudentList = new ArrayList<>();
        studentQueue = new PriorityQueue<>(Comparator
                .comparing(Student::getCgpa).reversed() // Descendent order
                .thenComparing(Student::getCgpa)
                .thenComparing(Student::getId));

        for (String event : events) {
            String[] tokens = event.split(" ");

            if (tokens[0].compareToIgnoreCase("ENTER") == 0) {
                String name = tokens[1];
                double cgpa = Double.valueOf(tokens[2]);
                int id = Integer.valueOf(tokens[3]);
                studentQueue.add(new Student(id, name, cgpa));
            } else if (tokens[0].compareToIgnoreCase("SERVED") == 0) {
                studentQueue.poll();
            }
        }

        while (!studentQueue.isEmpty()){
            orderedStudentList.add(studentQueue.poll());
        }

        return orderedStudentList;
    }
}

public class PriorityQueueSolution {

    private static Scanner scan;
    private final static Priorities priorities = new Priorities();

    public static Scanner setupScanner() throws FileNotFoundException {
        File file = new File(PriorityQueueSolution.class.getResource("priorityqueue-testcase.txt").getPath());
        Scanner sc = new Scanner(file);
        return sc;
    }

    public static void main(String[] args) throws FileNotFoundException {
        scan = setupScanner();
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        scan.close();

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
