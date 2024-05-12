import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the temperature unit to convert:\n1. Celsius\n2. Fahrenheit\n3. Kelvin");
        int unit = sc.nextInt();

        System.out.print("Enter the temperature value: ");
        double temp = sc.nextDouble();

        double convertedTemp;

        switch (unit) {
            case 1:
                convertedTemp = temp * 9 / 5 + 32;
                System.out.printf("\nTemperature in Fahrenheit = %.2f\nTemperature in Kelvin = %.2f\n\n", convertedTemp, (temp + 273.15));
                break;

            case 2:
                convertedTemp = (temp - 32) * 5 / 9;
                System.out.printf("\nTemperature in Celsius = %.2f\nTemperature in Kelvin = %.2f\n\n", convertedTemp, (temp + 273.15));
                break;

            case 3:
                convertedTemp = temp - 273.15;
                System.out.printf("\nTemperature in Celsius = %.2f\nTemperature in Fahrenheit = %.2f\n\n", convertedTemp, (temp * 9 / 5 + 32));
                break;

            default:
                System.out.println("Invalid unit selected.");
                break;
        }
    }
}
