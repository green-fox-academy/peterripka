package BlogPost;

import java.util.ArrayList;

public class Blog {
    ArrayList<BlogPost> blogPosts;

    public Blog() {
        blogPosts = new ArrayList<>();
    }

    public void add(BlogPost blogPost) {
        blogPosts.add( blogPost );
    }

    public void delete(int a) {
        blogPosts.remove( a );
    }

    public void update(int b, BlogPost blogPost) {
        blogPosts.set( b, blogPost );
    }
    @Override
    public String toString() {
        return "Blog{" +
                "blogPosts=" + blogPosts +
                '}';
    }
}
