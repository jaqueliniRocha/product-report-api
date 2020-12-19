package com.jjcompany.productreportapi.controller;

import com.jjcompany.productreportapi.model.Product;
import com.jjcompany.productreportapi.model.ProductReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Collection;

@CrossOrigin
@RestController
public class ProductReportController {

	@Autowired
	private ProductReportRepository repository;
	
	@GetMapping("/product/expired")
	public Collection<Product> findExpiredProducts(){
		return repository.findByExpirationDateBefore(LocalDate.now());
	}
	
}
