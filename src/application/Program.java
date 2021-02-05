package application;

import java.text.ParseException;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post post1 = new Post (
				Post.sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 12);
		
		post1.addComment(c1);
		post1.addComment(c2);
		
		System.out.println(post1);

	}

}
