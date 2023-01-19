package com.AdvanceLibraryManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdvanceLibraryManagementSystem.model.BookData;
import com.AdvanceLibraryManagementSystem.repository.BookDetailsRepo;

@Service
public class SearchService {

	@Autowired BookDetailsRepo bdr;
	
	public List<BookData> searchByName(String str) {
		List<BookData> bd = bdr.searchBookByName(str);
		return bd;
	}
}