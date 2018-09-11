package com.redislabs.productService.model;

public class Product {
	
	String _id = "";
	String imagePath = "";
	String title = "";
	String description = "";
	float price = 0.00F;
	
	
	public Product() {
		
	}

	public Product(String _id, String imagePath, String title, String description, float price ) {
		
		this._id= _id;
		this.imagePath= imagePath;
		this.title = title;
		this.description =description;
		this.price = price;
	}

	public String get_id() {
		return _id;
	}


	public void set_id(String _id) {
		this._id = _id;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
