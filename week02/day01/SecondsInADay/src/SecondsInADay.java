public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int secondsinmins = 60;
        int minsinhrs = 60;
        int hrsaday = 24;
        int totalsecsaday = (60 * 60 * 24);

        int remainingsecs = totalsecsaday - (((14 * 60) * 60) + (34 * 60) + 42);

        System.out.println(remainingsecs);
    }
}