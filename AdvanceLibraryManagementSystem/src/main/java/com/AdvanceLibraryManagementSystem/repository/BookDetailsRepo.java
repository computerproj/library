package com.AdvanceLibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AdvanceLibraryManagementSystem.model.BookData;

@Repository
public interface BookDetailsRepo extends JpaRepository<BookData, Long> {

}
