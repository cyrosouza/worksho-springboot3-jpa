package com.projetospringjpa.projetoSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringjpa.projetoSpringJPA.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
