package com.AdvanceLibraryManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdvanceLibraryManagementSystem.model.BookData;
import com.AdvanceLibraryManagementSystem.repository.BookDetailsRepo;

@Service
public class BookDetailsService {

	@Autowired
	BookDetailsRepo bdRepo;

	public void addBookDetails(BookData bddata) {
		bdRepo.save(bddata);
	}

	public void deleteBookDetails(BookData bddata) {
		bdRepo.deleteById(bddata.getId());
	}

	public void updateBookDetails(BookData bddata) {
		bdRepo.save(bddata);
	}
}
