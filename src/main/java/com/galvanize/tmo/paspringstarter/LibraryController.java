package com.galvanize.tmo.paspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Sort;
import java.util.List;

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
    List<Book> all(){
    	return repo.findAll(Sort.by("title").ascending());
    }
    
    @PostMapping("/api/books")
    Book newBook(@RequestBody Book newBook) {
    	return repo.save(newBook);
    }
    
    @DeleteMapping("/api/books")
    void deleteAll() {
    	repo.deleteAll();
    }
}