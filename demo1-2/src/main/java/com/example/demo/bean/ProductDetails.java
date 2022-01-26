package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class ProductDetails {

	@Id
	private String shopId;
	private String productId;
	private String productName;
	public ProductDetails(String shopId, String productId, String productName) {
		super();
		this.shopId = shopId;
		this.productId = productId;
		this.productName = productName;
	}
	
	
}
