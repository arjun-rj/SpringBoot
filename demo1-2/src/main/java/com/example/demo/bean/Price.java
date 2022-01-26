package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Price {

	@Id
	private String productId;
	private Double price;
	public Price(String productId, Double price) {
		super();
		this.productId = productId;
		this.price = price;
	}
}
