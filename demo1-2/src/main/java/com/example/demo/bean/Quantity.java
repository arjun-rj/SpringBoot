package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Quantity {

	@Id
	private String productId;
	private int quantity;
	
	public Quantity(String productId, int quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}
	
	
}
