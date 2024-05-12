import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {

        int Mynum = (int) (Math.random() * 100);
        int usernum;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Guess the Number (1-100) = ");
            usernum = sc.nextInt();

            if (Mynum == usernum) {
                System.out.println("Congratulation You guessed it Right");
                break;

            } else if (Mynum > usernum) {
                System.out.println("Your number is small");
            } else if (Mynum < usernum) {
                System.out.println("Your number is large");
            }

        } while (usernum >= 0);

        System.err.println("My number is " + Mynum);

    }
}
