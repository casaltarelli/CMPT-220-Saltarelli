//package com.company;

public class TenNine {
    // ----- Question 10.5 -----
    /* I know the class is supposed to be called "Course" I called it
    "TenNine" just so that I could keep track of what problem I am doing */
    // ----- Global Variable
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

	// JA: No main?
    public static void main(String[] args) {

    }

    // ----- Methods
    public void course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents < students.length) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else if (numberOfStudents > students.length) {
            String[] temp = new String[(students.length * 2)];

            for (int i = 0; i < students.length; i++) {
                temp[i] = students[i];
            }

            students = temp;
        }
    }

    public String[] getStudents() {
        String[] currentStudents = new String[numberOfStudents];

        return currentStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                students[i] = "";

                for (int j = i; j < students.length; j++) {
                    if (i < students.length) {
                        String temp = students[i+1];
                        students[i] = temp;
                    }
                }
            }
        }
    }

    public void clear() {
        for (int i = 0; i < students.length; i++) {
            students[i] = "";
        }
    }
}