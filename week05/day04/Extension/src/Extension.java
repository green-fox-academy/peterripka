import java.net.CookieHandler;
import java.util.*;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }

    int median(List<Integer> pool) {
        Collections.sort( pool );
        if (pool.size() % 2 == 0) {
            return (int) ((pool.get( pool.size()/2-1 ) + pool.get( pool.size()/2 ))/2.0);
        } else {
            return pool.get( (pool.size() - 1) / 2 );
        }
    }
    boolean isVowel(char c) {
        return Arrays.asList( 'a', 'u', 'o', 'e', 'i' ).contains(Character.toLowerCase( c ));
    }

    String translate(String teve) {
        String newWord = "";
        for (int i = 0; i < teve.length(); i++) {
            char c = teve.charAt( i );
            if (isVowel( c )) {
                newWord += c + "v" + c;
            }else {
                newWord += c;
            }
        }
        return newWord;
    }
}