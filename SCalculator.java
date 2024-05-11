 import java.util.Scanner;
 
public class SCalculator {
   

    public static void main(String[] args) {

        System.out.println("\t \t Welcome to our Calculator\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter a number: ");
        double num2 = sc.nextDouble();

        System.out.println("\t \tSelect an Option \nAddition (1) \nSubtraction (2) \nMultiplication(3) \nDivision (4)\n");
        int option = sc.nextInt();

        switch (option) {

            case 1:
                System.out.println("Addition =" + (num1 + num2));
                break;

            case 2:
                System.out.println("Subtraction = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Multiplcation = " + (num1 * num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Division = " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }

}
