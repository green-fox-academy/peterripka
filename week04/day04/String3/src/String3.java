public class String3 {

    public static void main(String[] args) {

        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".

        String stringInput = "alex, xilofon, pixel, pax, tuxedo";
        System.out.println( stringConverter( stringInput ) );
    }

    private static String stringConverter(String toConvert) {
        if (toConvert.length() == 1) {
            return toConvert;
        } else {
            return toConvert.charAt( 0 ) + "*" + stringConverter( toConvert.substring( 1 ) );
        }
    }
}

