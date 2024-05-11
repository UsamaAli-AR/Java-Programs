import java.util.*;
public class SumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. = ");
        int n = sc.nextInt();

        int j = 0;
        for (int i = 1; i <= n; i++) {
            j = i + j;
        }
        System.out.println(j);
    }

}
