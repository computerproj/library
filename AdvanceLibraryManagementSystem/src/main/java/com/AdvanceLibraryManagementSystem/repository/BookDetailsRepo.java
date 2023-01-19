package com.AdvanceLibraryManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.AdvanceLibraryManagementSystem.model.BookData;

@Repository
public interface BookDetailsRepo extends JpaRepository<BookData, Long> {

	@Query("SELECT t FROM BookData t WHERE t.bookName LIKE CONCAT('%',?1, '%')")
	List<BookData> searchBookByName(String name);
}
