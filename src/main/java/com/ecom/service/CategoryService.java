package com.ecom.service;

import java.util.List;
import com.ecom.model.Category;

public interface CategoryService {
	
	public Boolean existsCategory(String name);

	public Category saveCategory(Category category);
	
	public List<Category> getAllCategory(); 
	
	public Boolean deleteCategory(int id);
	
	public Category getCategoryById(int id); 
}
