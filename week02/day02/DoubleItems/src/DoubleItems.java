public class DoubleItems {
    public static void main(String[] args) {

        // - Create an array variable named `numList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array
        // Then print the modified array

        int[] numlist = new int[]{3, 4, 5, 6, 7};

        for (int i = 0; i <numlist.length; i++) {
            numlist[i] *= 2;
        }

        for (int element : numlist) {
            System.out.println(element);
        }
    }
}
