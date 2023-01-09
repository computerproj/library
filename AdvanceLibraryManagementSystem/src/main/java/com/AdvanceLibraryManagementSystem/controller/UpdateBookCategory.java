package com.AdvanceLibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AdvanceLibraryManagementSystem.model.CategoryModel;
import com.AdvanceLibraryManagementSystem.model.ConstantInfo;
import com.AdvanceLibraryManagementSystem.model.ResponseSend;
import com.AdvanceLibraryManagementSystem.service.CategoryService;

@RestController
@RequestMapping("/category")
public class UpdateBookCategory {

	@Autowired
	CategoryService cateBook;

	@PostMapping("/updateCategory")
	public ResponseSend updateBookCategory(@RequestBody CategoryModel catData) {
		ResponseSend response = new ResponseSend();
		try {
			cateBook.update(catData);
			response.setStatusCode(ConstantInfo.DELETE_BOOK_CATEGORY_SAVE_MSG_CODE);
			response.setStatusMessage(ConstantInfo.UPDATE_BOOK_CATEGORY_MASSAGE_SAVE);

		} catch (Exception exp) {
			response.setStatusCode(309);
			response.setStatusMessage("ERROR");
		}
		return response;
	}
}
