package com.redislabs.productService.model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service
public class ProductService {
	
	Jedis jedis = new Jedis("10.0.16.10", 6379);
	
	
	public List<Product> getProducts() {
		
		List<Product> products = new ArrayList<>();
		
		Set<String> productsIdx = jedis.zrevrange("redisshop:all-productsSorted",0,10);
		
		productsIdx.stream().forEach((product) -> {
			  
			  Map<String, String> values = jedis.hgetAll("redisshop:product:"+product);
			  Product prod = new Product(values.get("id"),values.get("imagePath"), values.get("title"),
					      values.get("description"), Float.parseFloat(values.get("price")));
			  
			  products.add(prod);
			  
		});
		
		return products;
	   
	}
	
	public Product getProduct(String productId) {
		
		Map<String, String> values = jedis.hgetAll("redisshop:product:"+productId);
		Product product = new Product(values.get("id"),values.get("imagePath"), values.get("title"),
				  values.get("description"), Float.parseFloat(values.get("price")));
		
	    return product;
	}
}
