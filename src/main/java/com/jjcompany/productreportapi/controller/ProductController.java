package com.jjcompany.productreportapi.controller;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjcompany.productreportapi.model.Product;
import com.jjcompany.productreportapi.model.ProductRepository;


@RestController
public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	@GetMapping("/product/expired")
	Collection<Product> findExpiredProducts(){
		return repository.findByExpirationDateBefore(LocalDate.now());
	}
	
}
