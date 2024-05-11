public class ExceptionHandling {
    public static void main(String[] args) {

        int[] num = { 21, 22, 1, 12132, 33434, 65, 67, 6, 889, 9 };

        try {
            System.err.println(num[2]);
        } catch (Exception e) {
            System.out.println("NOt found");
        }

        System.out.println("Usama");

    }
}