package com.tryGit.fieldService.model;

import com.tryGit.fieldService.utils.SoilType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SoilData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private SoilType type;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SoilType getType() {
		return type;
	}

	public void setType(SoilType type) {
		this.type = type;
	}

	
	
	
	

}
