package com.example.grade_calculator;

public class GradeCalculator {
    public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public static double calculateAverage(int m1, int m2, int m3) {
        return calculateTotal(m1, m2, m3) / 3.0;
    }

    public static boolean isPass(double average) {
        return average >= 40.0;
    }

    public static String getGrade(double average) {
        if (average >= 90) return "A+";
        if (average >= 80) return "A";
        if (average >= 70) return "B";
        if (average >= 60) return "C";
        if (average >= 50) return "D";
        if (average >= 40) return "E";
        return "F";
    }

    public static void main(String[] args) {
        int m1 = 85, m2 = 78, m3 = 92;
        int total = calculateTotal(m1, m2, m3);
        double average = calculateAverage(m1, m2, m3);
        String grade = getGrade(average);

        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);
        System.out.println("Result  : " + (isPass(average) ? "PASS" : "FAIL"));
    }
}
