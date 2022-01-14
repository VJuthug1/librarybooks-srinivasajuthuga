package com.galvanize.tmo.paspringstarter;

import java.util.List;

public class Books {
	
	private List<Book> books;
	
	public Books()
	{
		
	}
	
	public Books(List<Book> books) {
		this.books = books;
	}
	
	public List<Book> getBooks(){
		return books;
	}
	

}
