package com.shakti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shakti.bean.Product;
import com.shakti.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductService Service;

	@RequestMapping("/products")
	public List<Product> getAllProduct()
	{
		return Service.getAllproduct();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/products")
	public void addproduct(@RequestBody Product product)
	{
		Service.addproduct(product);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/products/{id}")
	public void updateproduct(@PathVariable String id, @RequestBody Product product)
	{
		Service.updateproduct(id, product);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/products/{id}")
	public void Deleteproduct(@PathVariable String id)
	{
		Service.deleteproduct(id);
	}
	
}
