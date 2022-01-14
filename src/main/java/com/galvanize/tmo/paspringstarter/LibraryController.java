package com.galvanize.tmo.paspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@RestController
public class LibraryController {
	
	private final LibraryRepository repo;
	
	LibraryController(LibraryRepository repo){
		this.repo = repo;
	}

    @GetMapping("/health")
    public void health() {

    }
    
    @GetMapping("/api/books")
    public Books all(){
    	return new Books(repo.findAll(Sort.by("title").ascending()));
    }
    
    @PostMapping("/api/books")
    ResponseEntity<Book> newBook(@RequestBody Book book) {
    	repo.save(book);
    	return new ResponseEntity<Book>(book, HttpStatus.CREATED);
    }
    
    
    @DeleteMapping("/api/books")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteAll() {
    	repo.deleteAllInBatch();
    }
}
