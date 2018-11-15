package BlogPost;

public class BlogPostMain {

    public static void main(String[] args) {
        BlogPost first = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost second = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost third = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

        //        System.out.println(first.text+" - is a quote from the book called " +first.title+" published by "+first.authorname+" on "+ first.date);
        //        System.out.println(second.toString());
        //        System.out.println(third);

        Blog myBlog = new Blog();
        myBlog.add( first );
        myBlog.add( second );
        myBlog.add( third );

        myBlog.delete(1);
        myBlog.update(0, third);
        System.out.println(myBlog);

    }
}