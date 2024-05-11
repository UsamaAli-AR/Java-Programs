import java.util.Scanner;
public class temp1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the temperature unit to convert\n1. Celsius\n2. Fahrenheit\n3. Kelvin ");
        int unit = sc.nextInt();

        if (unit < 1 || unit > 3) {
            System.out.println("Invalid unit selected. Please try again.");
            return;
        }

        System.out.print("Enter the temperature value: ");
        double temp = sc.nextDouble();

        double cTemp;

        switch (unit) {
            case 1:
                cTemp = temp * 9 / 5 + 32;
                System.out.printf("\nTemperature in Fahrenheit = %.2f\nTemperature in Kelvin = %.2f\n ", cTemp,
                        temp + 273.15);
                break;

            case 2:
                cTemp = (temp - 32) * 5 / 9;
                System.out.printf("\nTemperature in Celsius = %.2f\nTemperature in Kelvin = %.2f\n ", cTemp,
                        temp + 273.15);
                break;

            case 3:
                cTemp = temp - 273.15;
                System.out.printf("\nTemperature in Celsius = %.2f\nTemperature in Fahrenheit = %.2f\n ", cTemp,
                        cTemp * 9 / 5 + 32);
                break;
        }
    }

}
