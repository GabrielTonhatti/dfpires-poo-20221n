package br.edu.fatecfranca.ex3;

import java.util.ArrayList;
import java.util.List;

public class Post {

	private int code;
	private String text;
	private String author;
	private int like;
	private List<Comment> comments;

	public Post() {
		this.comments = new ArrayList<>();
	}

	public Post(int code, String text, String author, int like, List<Comment> comments) {
		this.code = code;
		this.text = text;
		this.author = author;
		this.like = like;
		this.comments = comments;
	}

	public Post(int code, String text, String author) {
		this.code = code;
		this.text = text;
		this.author = author;
		this.like = 0;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		if(this.comments.remove(comment)) {
			System.out.println("Comment removido com sucesso");
		} else {
			System.out.println("Comment não existe");			
		}
	}
 
}
