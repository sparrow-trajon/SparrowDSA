package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;
    
    
    
    public BlogPost(String title, String author, BlogPostType type, int likes) {
		super();
		this.title = title;
		this.author = author;
		this.type = type;
		this.likes = likes;
	}



	public static void main(String[] args) {
    	
    	List<BlogPost> posts = new ArrayList();
    	BlogPost blogPost= new BlogPost("ABC", "manish", BlogPostType.NEWS, 100);
    	BlogPost blogPost8= new BlogPost("ABC1", "manish", BlogPostType.NEWS, 200);
    	BlogPost blogPost1= new BlogPost("SaurabhGuide", "saurabh", BlogPostType.GUIDE, 900);
    	BlogPost blogPost2= new BlogPost("kunalReview", "kunal", BlogPostType.REVIEW, 800);
    	BlogPost blogPost3= new BlogPost("rekeshNews", "rakesh", BlogPostType.NEWS, 10);
    	BlogPost blogPost4= new BlogPost("lokeshReview", "lokesh", BlogPostType.REVIEW, 500);
    	BlogPost blogPost5= new BlogPost("HimanshuNews", "himanshu", BlogPostType.NEWS, 400);
    	BlogPost blogPost6= new BlogPost("rohtashReview", "rohtash", BlogPostType.REVIEW, 300);
    	BlogPost blogPost7= new BlogPost("proteshGuide", "prithesh", BlogPostType.GUIDE, 200);
    	
    	posts.add(blogPost7);
    	posts.add(blogPost6);
    	posts.add(blogPost5);
    	posts.add(blogPost4);
    	posts.add(blogPost3);
    	posts.add(blogPost2);
    	posts.add(blogPost1);
    	posts.add(blogPost);
    	posts.add(blogPost8);
    	
    	Map<BlogPostType, List<BlogPost>> map= posts.stream().collect(Collectors.groupingBy(BlogPost::getType));
    	
		/*
		 * map.entrySet().stream().forEach(x->{ System.out.println(x.getKey());
		 * System.out.println(Arrays.toString(x.getValue().toArray())); });
		 */
    	
    	
    	 Map<BlogPostType, Map<String, List<BlogPost>>> map1= posts.stream()
    			  .collect(Collectors.groupingBy(BlogPost::getType, Collectors.groupingBy(BlogPost::getAuthor)));
    	 
    	 map1.entrySet().stream().forEach(x->{
    		 System.out.println(x.getKey());
    		 x.getValue().entrySet().stream().forEach(y->{
    			 System.out.println(y.getKey());
    			 System.out.println(Arrays.toString(y.getValue().toArray()));
    		 });
    	 });
    	
    	
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public BlogPostType getType() {
		return type;
	}



	public void setType(BlogPostType type) {
		this.type = type;
	}



	public int getLikes() {
		return likes;
	}



	public void setLikes(int likes) {
		this.likes = likes;
	}



	@Override
	public String toString() {
		return "BlogPost [title=" + title + ", author=" + author + ", type=" + type + ", likes=" + likes + "]";
	}
	
	

}

 enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}
 
 
 class Tuple {
	    BlogPostType type;
	    String author;
		public Tuple(BlogPostType type, String author) {
			super();
			this.type = type;
			this.author = author;
		}
		public BlogPostType getType() {
			return type;
		}
		public void setType(BlogPostType type) {
			this.type = type;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		@Override
		public String toString() {
			return "Tuple [type=" + type + ", author=" + author + "]";
		}
	    
	    
	}