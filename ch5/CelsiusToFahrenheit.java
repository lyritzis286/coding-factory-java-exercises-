package gr.aueb.cf.ch5;

import java.util.Scanner;


public class CelsiusToFahrenheit {
    static Scanner scanner = new Scanner(System.in);
    static final double EPSILON = 0.0001;
    public static void main(String[] args) {
        double expected1 = 32.0;
        double actual1 = celciusToFahrenheit(0);
        System.out.printf("0 C->Αναμενομενο : %.2f, Πραγματικο : %.2f,Σωστο? %b%n",expected1,actual1,Math.abs(expected1-actual1)<EPSILON);


        double c = 0.0;
        double result = 0.0;

        System.out.println("Παρακαλω δωστε την θερμοκρασια σε βαθμους κελσιου");
        c = scanner.nextDouble();
        result = celciusToFahrenheit(c);
        System.out.printf("Η θερμοκρασια σε Fahrenheit ειναι : %.2f ", result);

    }

    public static double celciusToFahrenheit(double c) {
        return  c * 9/5 + 32;
    }
}
