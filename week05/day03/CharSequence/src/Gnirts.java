public class Gnirts implements CharSequence {

    private String s;

    Gnirts(String s) {
        this.s = s;
    }

    private String reverseString() {
        String reversed = "";
        for (int index = s.length() - 1; index > -1; index--) {
            reversed += s.charAt( index );
        }
        return reversed;
    }

    @Override
    public int length() {
        return reverseString().length();
    }

    @Override
    public char charAt(int index) {
        return this.reverseString().charAt(index);
//        return s.charAt( s.length()-1-index );
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reverseString().substring(start, end);
    }
}