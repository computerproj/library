package com.AdvanceLibraryManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdvanceLibraryManagementSystem.model.CategoryModel;
import com.AdvanceLibraryManagementSystem.repository.CategoryRepo;


@Service
public class CategoryService {
	@Autowired
	CategoryRepo cateRipo;

	public void add(CategoryModel obj) {
		cateRipo.save(obj);
	}

	public void update(CategoryModel obj) {
		cateRipo.save(obj);
	}

	public void delete(CategoryModel obj) {
		cateRipo.deleteById(obj.getId());
	}
}
