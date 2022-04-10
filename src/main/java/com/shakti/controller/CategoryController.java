package com.shakti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shakti.bean.Category;
import com.shakti.service.*;

@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@RequestMapping("/categories")
	public List<Category> getAllCategory()
	{
		return categoryService.getAllcategory();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/categories")
	public void addcategory(@RequestBody Category category)
	{
		categoryService.addcategory(category);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/categories/{id}")
	public void updatecategory(@PathVariable String id, @RequestBody Category category)
	{
		categoryService.updatecategory(id, category);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/categories/{id}")
	public void Deletecategory(@PathVariable String id)
	{
		categoryService.deletecategory(id);
	}
	
	
}
