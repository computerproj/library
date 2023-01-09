package com.AdvanceLibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AdvanceLibraryManagementSystem.model.CategoryModel;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryModel, Long> {
	public void deleteById(Long id);
}
