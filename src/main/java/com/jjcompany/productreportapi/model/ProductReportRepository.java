package com.jjcompany.productreportapi.model;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReportRepository extends JpaRepository<Product, Long>{
	
	public Collection<Product> findByExpirationDateBefore(LocalDate date);
}
