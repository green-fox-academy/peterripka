
public class Swap {
    public static void main (String[] args){
        int a = 123;
        int b = 526;

        System.out.println("Eredeti számok:");

        System.out.println(a);
        System.out.println(b);

        System.out.println("Csere utáni számok:");

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}