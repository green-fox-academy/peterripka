public class DiagonalMatrix {

    public static void main(String[] args) {

        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int[][] multiArray = new int[4][4];

        for (int r = 0; r < multiArray.length; r++) {
            for (int c = 0; c < multiArray[r].length; c++) {
                if (c == r) {
                    multiArray[r][c] = 1;
                } else {
                    multiArray[r][c] = 0;
                }
            }
        }
        for (int r = 0; r < multiArray.length; r++) {
            for (int c = 0; c < multiArray[r].length; c++) {
                System.out.print(multiArray[r][c] + " ");
            }
            System.out.println("\n");
        }
    }
}
