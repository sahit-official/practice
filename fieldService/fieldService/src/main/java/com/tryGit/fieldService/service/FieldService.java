package com.tryGit.fieldService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tryGit.fieldService.model.Field;
import com.tryGit.fieldService.repository.FieldRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FieldService {

	
	@Autowired
	FieldRepository fieldRepository;
	
	
	public Field viewField(Long id) {
		return fieldRepository.findById(id).orElseThrow(
				()-> new EntityNotFoundException("No Field with id- "+id));
	}
}
