package org.test.examples.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")

public class Products {
	@Id
	String id;
	int productId;
	String prodName;
	String prodDesc;
	Double prodPrice;
	String prodImage;
	String date;
	
	public Products() {
		
	}
	public Products(String id,String prodName,String prodDesc,Double prodPrice,String prodImage,String date,int productId) {
		this.id = id;
		this.productId = productId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodPrice = prodPrice;
		this.prodImage = prodImage;
		this.date = date;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public Double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdImage() {
		return prodImage;
	}
	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", productId=" + productId + ", prodName=" + prodName + ", prodDesc=" + prodDesc
				+ ", prodPrice=" + prodPrice + ", prodImage=" + prodImage + ", date=" + date + "]";
	}


}
