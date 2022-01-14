package com.galvanize.tmo.paspringstarter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	
	private @Id @GeneratedValue Long id;
	private String author;
	private String title;
	private Long yearPublished;
	
	Book(){
		
	}
	
	Book(String author, String title, Long yearPublished){
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
	
	public Long getYearPublished() {
		return yearPublished;
	}
	
	


}