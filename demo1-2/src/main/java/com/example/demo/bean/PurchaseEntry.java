package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class PurchaseEntry {

	@Id
	private Integer purchaseID;
	private int quantity;
	private Double price;
	private String gst;
}
