package com.example;

public class App {

    public String calculateGrade(int m1, int m2, int m3) {

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        if (average >= 90)
            return "A";
        else if (average >= 75)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else
            return "Fail";
    }

}
