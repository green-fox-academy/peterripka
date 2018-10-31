public class PrintAll {
    public static void main(String[] args) {

        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`

        int[] numbers = new int[]{4, 5, 6, 7};

        for ( int element : numbers) {
            System.out.println(element);
        }
    }
}
