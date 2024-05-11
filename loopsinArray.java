public class loopsinArray {
        public static void main(String[] args) {

                String[] aplhabets = { "a", "b", "c", "d", "e",
                 "f", "g", "h", "i", "j" };

                int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

                // for-each loop

                for (String i : aplhabets) {
                        System.out.println(i);
                }

                System.out.println("\n******************\n");

                for (int i : num) {
                        System.out.println(i);
                }

                System.out.println("\n******************\n");

                // for loop
                for (int i = 0; i < aplhabets.length; i++) {
                        System.out.print(aplhabets[i]);
                        System.out.print(num[i] + " ");

                }

                System.out.println("\n******************\n");

                // while loop
                int i = 0;
                while (i < aplhabets.length) {

                        System.out.print(aplhabets[i]);
                        System.out.print(num[i] + " ");
                        i++;
                }
                System.out.println("\n******************\n");

                // Do-while loop

                int j = 0;
                do {
                        System.out.print(aplhabets[j]);
                        System.out.print(num[j] + " ");
                        j++;
                } while (j < aplhabets.length);
                System.out.println("\n******************\n");

        }
}
