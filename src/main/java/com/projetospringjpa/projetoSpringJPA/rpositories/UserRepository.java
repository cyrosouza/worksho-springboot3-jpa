package com.projetospringjpa.projetoSpringJPA.rpositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringjpa.projetoSpringJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
