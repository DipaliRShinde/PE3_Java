package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        try {
            StudentMarks.checkGradeRange();
        } catch (Exception e) {
            System.out.println("Grade is out of range");
        }
    }

    public static void checkGradeRange() throws Exception {
        int numOfStudents;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        numOfStudents = scan.nextInt();
        int[] stuGrades = new int[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1) + " : ");
            stuGrades[i] = scan.nextInt();

            if (stuGrades[i] > 0 && stuGrades[i] <= 100) {
                System.out.println("Grade for student " + (i + 1) + " is between 1 to 100.");
            } else {
                throw new Exception("Error");
            }
        }
    }
}
