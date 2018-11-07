public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int codinghrs = 6;
        int codingdys = 5;
        int codingwks = 17;
        int totalcodinghrs = (codinghrs * codingdys * codingwks);
        System.out.println("The total coding hours in a course for GF a student is: " + totalcodinghrs);

        double averagehrs = 52;
        double averageprcnt;
        averageprcnt = (codingdys * codinghrs / averagehrs);
        System.out.println("The average coding hours in a week for a GF student is: " + averageprcnt);
    }
}
