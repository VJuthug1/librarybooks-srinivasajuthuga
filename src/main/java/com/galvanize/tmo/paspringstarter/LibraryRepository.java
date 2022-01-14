package com.galvanize.tmo.paspringstarter;


import org.springframework.data.jpa.repository.JpaRepository;


public interface LibraryRepository extends JpaRepository<Book,Long>{
	

}