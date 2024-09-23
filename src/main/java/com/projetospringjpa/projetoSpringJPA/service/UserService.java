package com.projetospringjpa.projetoSpringJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.projetospringjpa.projetoSpringJPA.entities.User;
import com.projetospringjpa.projetoSpringJPA.repositories.UserRepository;
import com.projetospringjpa.projetoSpringJPA.service.exceptions.DatabaseException;
import com.projetospringjpa.projetoSpringJPA.service.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));	
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) { 
		userRepository.findById(id).orElseThrow(
	        () -> new ResourceNotFoundException(id)); 
	    try { 
	    	userRepository.deleteById(id); 
	    } catch (DataIntegrityViolationException e) { 
	        throw new DatabaseException(e.getMessage()); 
	    }  
	}
	
	public User update(Long id, User user) {
		User userEntity = userRepository.getReferenceById(id);
		updateData(userEntity, user);
		return userRepository.save(userEntity);
	}

	private void updateData(User userEntity, User user) {
		userEntity.setName(user.getName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPhone(user.getPhone());
	}

}
