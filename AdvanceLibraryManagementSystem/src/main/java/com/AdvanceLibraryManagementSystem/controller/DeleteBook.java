package com.AdvanceLibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AdvanceLibraryManagementSystem.model.BookData;
import com.AdvanceLibraryManagementSystem.model.ConstantInfo;
import com.AdvanceLibraryManagementSystem.model.ResponseSend;
import com.AdvanceLibraryManagementSystem.service.BookDetailsService;

@RestController
@RequestMapping("/book")
public class DeleteBook {

	@Autowired
	BookDetailsService bdService;

	@PostMapping("/deletebookdetails")
	public ResponseSend deleteBook(@RequestBody BookData bdata) {

		ResponseSend res = new ResponseSend();
		try {
			bdService.deleteBookDetails(bdata);
			res.setStatusCode(ConstantInfo.DELETE_BOOK_SAVE_MSG_CODE);
			res.setStatusMessage(ConstantInfo.DELETE_BOOK_SAVE_MSSSAGE);
		} catch (Exception e) {
			// TODO: handle exception
			res.setStatusCode(303);
			res.setStatusMessage("Error");
		}
		return res;
	}
}
