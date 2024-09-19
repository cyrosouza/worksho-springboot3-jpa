package com.projetospringjpa.projetoSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringjpa.projetoSpringJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
