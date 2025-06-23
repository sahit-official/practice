package com.tryGit.fieldService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tryGit.fieldService.model.Field;

public interface FieldRepository extends JpaRepository<Field, Long>{

}
