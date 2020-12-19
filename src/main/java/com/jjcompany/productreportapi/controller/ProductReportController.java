package com.jjcompany.productreportapi.controller;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjcompany.productreportapi.model.ProductReport;
import com.jjcompany.productreportapi.model.ProductReportRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
public class ProductReportController {

	@Autowired
	private ProductReportRepository repository;
	
	@GetMapping("/product/expired")
	public Collection<ProductReport> findExpiredProducts(){
		return repository.findByExpirationDateBefore(LocalDate.now());
	}
	
}
