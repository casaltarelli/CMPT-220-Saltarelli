package com.company;

import java.util.ArrayList;

public class ElevenFive {
    // ----- Question 11.5 -----
    /* This class is supposed to be called "Course" however I called it
    "ElevenFive" so I can keep track of the problem I am working on" */
    // ----- Global Variables
    private String courseName;
    private ArrayList<String> students = new ArrayList<String>();
    private int numberOfStudents;

    public static void main(String[] args) {

    }

    // ----- Methods
    public ElevenFive(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudents(String student) {
        // Exercise from Question 10.9
    }
}
