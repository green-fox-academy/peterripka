public class Shifter implements CharSequence {

    private String s;
    private int place;

    public Shifter(String s, int place) {
        this.s = s;
        this.place = place;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int index) {
        return s.charAt( index + place );
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return s.subSequence( start + place, end + place );
    }
}
