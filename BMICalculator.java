import java.util.Scanner;
public class BMICalculator {

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void interpretBMI(double bmi) {
        System.out.print("BMI Interpretation: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t██████╗ ███╗   ███╗██╗  ");
        System.out.println("\t██╔══██╗████╗ ████║██║  ");
        System.out.println("\t██████╔╝██╔████╔██║██║  ");
        System.out.println("\t██╔══██╗██║╚██╔╝██║██║  ");
        System.out.println("\t██████╔╝██║ ╚═╝ ██║██║  ");
        System.out.println("\t╚═════╝ ╚═╝     ╚═╝╚═╝  ");

        System.out.println("  ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ████████╗ ██████╗ ██████╗  ");
        System.out.println(" ██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗╚══██╔══╝██╔═══██╗██╔══██╗ ");
        System.out.println(" ██║     ███████║██║     ██║     ██║   ██║██║     ███████║   ██║   ██║   ██║██████╔╝ ");
        System.out.println(" ██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║   ██║   ██║   ██║██╔══██╗ ");
        System.out.println(" ╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║   ██║   ╚██████╔╝██║  ██║ ");
        System.out.println("  ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝ ");

        System.out.print("\nEnter weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("\nEnter height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.println("_______________________________");
        System.out.println("\n Your BMI is: " + bmi);
        System.out.println("_______________________________\n");

        interpretBMI(bmi);
        System.out.println("\n_______________________________\n");
        scanner.close();
    }

   
}
