package com.jjcompany.productreportapi.model;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	Collection<Product> findByExpirationDateBefore(LocalDate date); 
}
