public class CompareLength {

    public static void main(String[] args) {

        // - Create an array variable named `p1`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `p2`
        //   with the following content: `[4, 5]`
        // - Print if `p2` has more elements than `p1`

        int[] p1 = new int[]{1, 2, 3};
        int[] p2 = new int[]{4, 5};

        if (p2.length > p1.length) {
            System.out.println("P2 has more elements than P1");
        } else if (p1.length > p2.length) {
            System.out.println("P1 has more elements than P2");
        } else {
            System.out.println("P1 has the same amount of elements as P2");
        }
    }
}
