package gr.aueb.cf.ch5;

import java.util.Scanner;

public class IsPrimeApp {
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Δοκιμη");



        int num = 0;
        boolean result = false;
        System.out.println("Παρακαλω δωστε εναν ακεραιο");
        num = scanner.nextInt();
        result = isPrime(num);
        System.out.printf("Ο αριθμός %d είναι ακέραιος ? : %b%n ", num, result);

    }

    public static boolean isPrime(int num) {
        if (num < 2){
            return false;
        }
        for (int i =2; i < num; i++ ){
            if (num % i == 0) {
                return false;
            }
        }
        return true;


    }
}
