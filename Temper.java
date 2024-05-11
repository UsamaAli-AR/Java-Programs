import java.util.Scanner;

public class Temper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the temperature unit to convert\n1. Celsius\n2. Fahrenheit\n3. Kelvin ");
        int unit = sc.nextInt();

        System.out.print("Enter the temperature value:");
        double temp = sc.nextDouble();

        double cTemp;

        switch (unit) {
            case 1:
                cTemp = temp * 9 / 5 + 32;
                System.out.print("\nTemperature in Fahrenheit = " + cTemp + "\nTemperature in Kelvin = "
                        + (temp + 273.15) + "\n \n");
                break;

            case 2:
                cTemp = (temp - 32) * 5 / 9;
                System.out.printf("\nTemperature in Celcius = " + cTemp + "\nTemperature in Kelvin = " + (temp + 273.15)
                        + "\n \n");
                break;

            case 3:
                cTemp = temp - 273.15;
                System.out.printf("\nTemperature in Celcius = " + cTemp + "\nTemperature in Fahrenheit = "
                        + (temp * 9 / 5 + 32) + "\n \n");
                break;

            default:
                System.out.println("Invalid unit selected.");
                break;

        }
    }

}
