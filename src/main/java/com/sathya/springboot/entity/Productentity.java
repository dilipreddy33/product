package com.sathya.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Productentity {
	@Id
	private Long id;
	private String name;
	private String brand;
	private String madeIn;
	private double price;
	private int quantity;
	private int discountrate;
	private double taxrate;
	private double discountprice;
	private double offerprice;
	private double finalprice;
	private double stockvalue;
}
