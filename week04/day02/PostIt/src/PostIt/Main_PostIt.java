package PostIt;

public class Main_PostIt {

    public static void main(String[] args) {
        PostIt first = new PostIt("orange", "Idea 1", "blue");
        PostIt second = new PostIt("pink", "Awesome", "black");
        PostIt third = new PostIt("yellow", "Superb!", "green");

        System.out.println(first.backgroundColor +  " " + first.text +  " " + first.textColor);
        System.out.println(second.backgroundColor +  " " + second.text +  " "  + second.textColor);
        System.out.println(third.backgroundColor +  " " + third.text +  " " + third.textColor);
    }
}