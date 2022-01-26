package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class PersonelDetails {
	
	@Id
	private String sellerId;
	private String sellerName;
	private String address;
	private String mobileOrEmail;
	private String contactDetails;
	
	public PersonelDetails(String sellerId, String sellerName, String address, String mobileOrEmail,
			String contactDetails) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.address = address;
		this.mobileOrEmail = mobileOrEmail;
		this.contactDetails = contactDetails;
	}
}
