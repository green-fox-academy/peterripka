import java.util.HashMap;

public class CountLetters {

    public static HashMap<String, Integer> letterCounter(String text) {
        HashMap<String, Integer> charHashMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (charHashMap.containsKey( Character.toString( text.charAt( i ) ) )) {
                int temp = charHashMap.get( Character.toString( text.charAt( i )));
                charHashMap.put( Character.toString( text.charAt( i ) ), temp + 1 );
            } else charHashMap.put( Character.toString( text.charAt( i ) ), 1 );
        }
        return charHashMap;
    }
}
