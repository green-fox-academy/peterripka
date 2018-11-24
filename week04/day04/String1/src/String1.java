public class String1 {

    public static void main(String[] args) {

        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.

        String stringInput = "alex, xilofon, pixel, pax, tuxedo";
        System.out.println( stringConverter( stringInput ) );
    }

    private static String stringConverter(String toConvert) {
        if (toConvert.length() == 0) {
            return "";
        } else if (toConvert.charAt( 0 ) == 'x') {
            return "y" + stringConverter( toConvert.substring( 1 ) );
        } else {
            return toConvert.charAt( 0 ) + stringConverter( toConvert.substring( 1 ) );
        }
    }
}

