package gr.aueb.cf.ch5;


import java.util.Scanner;

/**
 * Εφαρμογή που εμφανίζει μενού 6 επιλογών για εκτύπωση
 * αστεριών σε διάφορα σχήματα. Ο χρήστης επιλέγει σχήμα
 * και αριθμό αστεριών, και το πρόγραμμα συνεχίζει μέχρι
 * να επιλεγεί η Έξοδος.
 */
public class StarsApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int n = 0;
        final int EXIT = 6;

        while (true) {
            printMenu();
            choice = getOneInt();
            if (choice == EXIT) {
                System.out.println("Έξοδος από το πρόγραμμα..");
                break;
            }
            if (!isChoiceValid(choice)) {
                System.out.println("Μη έγκυρη επιλογή παρακαλώ επιλέξτε ξανά");
                continue;
            }
            System.out.println("Παρακαλώ δώστε έναν ακέραιο");
            n = getOneInt();
            getResultOnChoice(choice, n);
        }
    }

    /**
     * Εκτυπώνει το μενού επιλογών.
     */
    public static void printMenu() {
        System.out.println("Επιλέξτε μια από τις παρακάτω επιλογές");
        System.out.println("1 Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2 Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3 Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4 Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5 Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6 Έξοδος");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    /**
     * Καλεί την κατάλληλη μέθοδο εκτύπωσης ανάλογα με την επιλογή.
     *
     * @param choice η επιλογή του χρήστη (1-5)
     * @param n      ο αριθμός των αστεριών
     */
    public static void getResultOnChoice(int choice, int n) {
        switch (choice) {
            case 1 -> printStars1(n);
            case 2 -> printStars2(n);
            case 3 -> printStars3(n);
            case 4 -> printStars4(n);
            case 5 -> printStars5(n);
        }
    }

    /**
     * Εκτυπώνει n αστεράκια οριζόντια σε μία γραμμή.
     */
    public static void printStars1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" * ");
        }
        System.out.println();
    }

    /**
     * Εκτυπώνει n αστεράκια κάθετα (ένα ανά γραμμή).
     */
    public static void printStars2(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" * ");
        }
    }

    /**
     * Εκτυπώνει n γραμμές με n αστεράκια η καθεμία (τετράγωνο).
     */
    public static void printStars3(int n) {
        for (int i = 1; i <= n; i++) {
            printStars1(n);
        }
    }

    /**
     * Εκτυπώνει n γραμμές με αστεράκια από 1 έως n (αύξουσα τριγωνική μορφή).
     */
    public static void printStars4(int n) {
        for (int i = 1; i <= n; i++) {
            printStars1(i);
        }
    }

    /**
     * Εκτυπώνει n γραμμές με αστεράκια από n έως 1 (φθίνουσα τριγωνική μορφή).
     */
    public static void printStars5(int n) {
        for (int i = n; i >= 1; i--) {
            printStars1(i);
        }
    }
}
