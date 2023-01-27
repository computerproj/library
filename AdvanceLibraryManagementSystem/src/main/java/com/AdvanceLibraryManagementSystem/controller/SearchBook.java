package com.AdvanceLibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AdvanceLibraryManagementSystem.model.BookData;
import com.AdvanceLibraryManagementSystem.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchBook {

	@Autowired SearchService ss;
	
	@GetMapping("/bookdetails")
	public ResponseEntity<List<BookData>> searchBookDetails(@RequestParam("query") String st) {
		return ResponseEntity.ok(ss.searchByName(st.trim()));
	}
}
