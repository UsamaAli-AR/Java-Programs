import java.util.*;

public class Marks2Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        int marks;
        do {
            System.out.println("Please enter 1 to Continue or 0 to Exit");
            input = sc.nextInt();

            if (input == 1) {
                System.out.print("Enter marks (out of 100)= ");
                marks = sc.nextInt();

                if (marks <= 100 && marks >= 90) {
                    System.out.println("\nThis is Good\n");
                } else if (marks <= 89 && marks >= 60) {
                    System.out.println("\nThis is also Good\n");
                } else if (marks <= 59 && marks >= 0) {
                    System.out.println("\nThis is Good as well\n");
                } else {
                    System.out.println("\nInvalid marks. \n \tPlease enter marks between 0 and 100.\n");
                }

                System.out.println(" \t \t _______________\n");
            }
        } while (input == 1);

        System.out.println("\nThank you\n");
        sc.close();

    }
}
