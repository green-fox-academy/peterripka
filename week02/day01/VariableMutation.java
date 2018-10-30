public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a += 10;
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b -= 7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c *= 2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e *= (e*e);
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean whichIsBigger = f1 > f2;
        System.out.println(whichIsBigger);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        boolean IfDoublegG2Bigger = (2 * g2) > f2;
        System.out.println(IfDoublegG2Bigger);


        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        int h11= 11;
        boolean eleven = ((h % h11) == 0);
        System.out.println(eleven);


        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        boolean Ifi1isbiggerthani2 = (i1 > i2 * i2) && (i1 < (i2 * i2 *i2));
        System.out.println(Ifi1isbiggerthani2);



        int j = 1521;
        int j1 = 3;
        int j2 = 5;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean divthreeorfive = (((j % j1) == 0) || ((j % j2) == 0));
        System.out.println(divthreeorfive);

        String k = "Apple";
        //fill the k variable with its content 4 times
        for (int i = 0; i < 4; i++) {
            System.out.println(k);
        }
    }
}