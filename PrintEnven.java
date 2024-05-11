import java.util.*;

public class PrintEnven {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Print all even numbers till n.

    System.out.print("Enter a no. = ");
    int num = sc.nextInt();

    for (int i = 1; i < num; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }

    }

  }
}
