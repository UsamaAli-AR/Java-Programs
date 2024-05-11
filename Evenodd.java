import java.util.*;

public class Evenodd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a NUmber= ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("This is an Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }
}
