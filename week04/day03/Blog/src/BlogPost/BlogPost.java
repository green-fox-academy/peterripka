package BlogPost;

public class BlogPost {
    String authorname;
    String title;
    String text;
    String date;

    public BlogPost(String authorname, String title, String text, String date) {
        this.authorname = authorname;
        this.title = title;
        this.text = text;
        this.date = date;
    }

    @Override
    public String toString() {
        return this.text+" is a quote from the book called " +this.title+" published by "+this.authorname+" on "+ this.date;
    }
}
