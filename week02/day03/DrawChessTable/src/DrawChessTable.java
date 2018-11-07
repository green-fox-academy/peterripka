public class DrawChessTable {
    public static void main(String[] args) {

        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        int squareSize = 8;

        for (int r=1; r<=squareSize/2; r++){
            for (int c=0; c<squareSize/2; c++) {
                System.out.print("% ");
            }
            System.out.print("\n");
            for (int k=0; k<squareSize/2; k++) {
                System.out.print(" %");
            }
            System.out.print("\n");

        }
    }
}


