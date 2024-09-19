package com.projetospringjpa.projetoSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringjpa.projetoSpringJPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
