package com.sathya.springboot.MVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.springboot.entity.Productentity;
import com.sathya.springboot.repository.Productrepository;

@Service
public class ProductService {
@Autowired
public void saveproductDetails(product productmodel) {
	double stockValue = productmodel.getprice()*productmodel.getQuantity();
	double discountprice = productmodel.getprice()*productmodel.getDiscountrate()/100;
	double taxprice = productmodel.getprice();
	double offerprice = productmodel.getprice()-discountprice;
	double finalprice = offerprice + taxprice;
	
	Productentity productEntity = new productentity();
	
	productEntity.setName(productmodel.getName());
	productEntity.setPrice(productmodel.getprice());
	productEntity.setQuantity(productmodel.getQuantity());
	productEntity.setStockvalue(stockvalue);
	productEntity.setDiscountprice(discountPrice);
	productEntity.settaxrate(taxrate);
	productEntity.setofferprice(offerprice);
	productEntity.setFinalprice(finalprice);
	productEntity.setBrand(productmodel.getBrand());
	productEntity.setMadein(productmodel.getMadein());
	productEntity.setDiscountrate(productmodel.getDiscountrate());
	
	productrepository.save(productEntity);
}

	}

