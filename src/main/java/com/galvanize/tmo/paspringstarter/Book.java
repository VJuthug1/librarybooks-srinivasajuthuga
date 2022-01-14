package com.galvanize.tmo.paspringstarter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	
	private @Id @GeneratedValue Long id;
	private String author;
	private String title;
	private String yearPublished;
	
	Book(){
		
	}
	
	Book(String author, String title, String yearPublished){
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
	}
	
	public Long getID() {
		return id;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getYearPublished() {
		return yearPublished;
	}
	
	


}