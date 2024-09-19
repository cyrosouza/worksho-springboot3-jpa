package com.projetospringjpa.projetoSpringJPA.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetospringjpa.projetoSpringJPA.entities.Order;
import com.projetospringjpa.projetoSpringJPA.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService OrderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> orderList = OrderService.findAll();
		return ResponseEntity.ok().body(orderList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = OrderService.findById(id);
		return ResponseEntity.ok().body(order);
	}

}
