package com.mayur.Javacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayur.Javacrud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
