package com.projetospringjpa.projetoSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringjpa.projetoSpringJPA.entities.OrderItem;
import com.projetospringjpa.projetoSpringJPA.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
