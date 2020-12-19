package com.jjcompany.productreportapi.model;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReportRepository extends JpaRepository<ProductReport, Long>{
	
	public Collection<ProductReport> findByExpirationDateBefore(LocalDate date); 
}
