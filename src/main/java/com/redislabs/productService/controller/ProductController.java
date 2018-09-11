package com.redislabs.productService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redislabs.productService.model.ProductService;
import com.redislabs.productService.model.Product;
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/getProducts") 
	List<Product> getProducts() {
		
		return productService.getProducts();
	}
	
	@RequestMapping("/getProduct/{productid}") 
	Product getProduct(@PathVariable String productid) {
		
		System.out.println(productid);
		
		return productService.getProduct(productid);
	}

}
