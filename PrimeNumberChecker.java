import java.util.*;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no.= ");
        int num = sc.nextInt();

        int check = 0;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                check++;
            }
        }

        if (check == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Non-Prime");
        }

    }
}
