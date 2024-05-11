public class multidimensionalarrays {
    public static void main(String[] args) {

        int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };


        String [][] alpha = { { "a" , "b" , "c" , "d"},
                { "e" , "f" , "g" , "h" } };

        /*
         * System.out.println(num[1][3]);
         * change vlaue of elements in multidimensional arrays
         * num[1][3] = 11;
         * System.out.println(num[1][3]);
         */

        // for loop in multidimensional arrays

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]);
            }
        }
        

System.out.println();

        for (int a = 0; a < alpha.length; a++) {
            for (int b = 0; b < alpha[a].length; b++) {
                System.out.print(alpha[a][b]);
            }

        }
    }

}