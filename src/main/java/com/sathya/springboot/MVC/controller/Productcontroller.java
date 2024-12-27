package com.sathya.springboot.MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sathya.springboot.MVC.model.Productmodel;
import com.sathya.springboot.MVC.service.ProductService;
@Controller
public class Productcontroller {
@Autowired
	ProductService productService;
	@GetMapping("/productform")
	public String  productform()
	{
		return "add-product";
	}
	@PostMapping("/saveproduct")
	public String saveproduct(Productmodel productmodel ) {
	    System.out.println(productmodel);
	    
	    return "success";
	}

	}



