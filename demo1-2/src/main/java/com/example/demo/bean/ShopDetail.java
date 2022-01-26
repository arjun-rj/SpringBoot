package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class ShopDetail {

	@Id
	private String shopId;
	private String sellerId;
	private String shopName;
	private String shopAddress;
	private String gst;
	
	public ShopDetail(String shopId, String sellerId, String shopName, String shopAddress, String gst) {
		super();
		this.shopId = shopId;
		this.sellerId = sellerId;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.gst = gst;
	}
	
	
}
