package com.sathya.springboot.MVC.model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productmodel {
	private String name;
	private String brand;
	private String madeIn;
	private double price;
	private int quantity;

}
