package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Απλός υπολογιστής τσέπης που εμφανίζει μενού με
 * πρόσθεση αφαίρεση πολλαπλασιασμό διαίρεση και mod
 * ο χρήστης επιλέγει στη συνέχεια δίνει τις τιμές εισόδου
 * και λαμβάνει το αποτέλεσμα.Αυτό επαναλαμβάνεται μέχρι να επιλέξει έξοδο.
 */
public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        final int EXIT = 6;

        while(true) {
            printMenu();
            choice = getOneInt();
            if (choice == EXIT) {
                System.out.println("Εξοδος");
                break;

            }
            if (!isChoiceValid(choice)) {
                System.out.println("Μη εγκυρη επιλογη Παρακαλω προσπαθηστε ξανα");
                continue;
            }
            System.out.println("Δωστε δυο ακεραιους ");
            num1 = getOneInt();
            num2 = getOneInt();
            result = getResultOnChoice(choice, num1, num2);
            System.out.println("Το αποτελεσμα είναι: "+ result);

        }




    }

    public static void printMenu() {
        System.out.println("Επιλεξτε μια απο τις παρακατω επιλογες");
        System.out.println("1 προσθεση");
        System.out.println("2 αφαιρεση");
        System.out.println("3 πολλαπλασιαμος");
        System.out.println("4 διαιρεση");
        System.out.println("5 mod");
        System.out.println("6 εξοδος");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {

        return choice >= 1 && choice <= 5;
    }

    public static int getResultOnChoice(int choice, int num1, int num2) {



        return switch (choice) {

                case 1 -> add(num1 , num2);
                case 2 -> sub(num1 , num2);
                case 3 -> mul(num1 , num2);
                case 4 -> div(num1 , num2);
                case 5 -> mod(num1 , num2);
                default -> 0;


            };


        }

        public static int add(int a, int b) {
        return a + b;
        }


        public static int sub(int a , int b) {
        return a - b;
        }


        public static int mul(int a, int b) {
        return a * b;
        }


        public static int div(int a, int b) {
            if (b == 0) {
                return 0;
            }
            return a / b;
        }

        public static int mod(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a % b;
        }
    }

