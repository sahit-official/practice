package com.tryGit.fieldService.model;

import java.time.LocalTime;

import com.tryGit.fieldService.utils.IrrigationStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class IrrigationLog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private LocalTime startTime;
	private LocalTime endTime;
	
	private IrrigationStatus status;
	
	@ManyToOne
	private Field field;

	
	
	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public IrrigationStatus getStatus() {
		return status;
	}

	public void setStatus(IrrigationStatus status) {
		this.status = status;
	}
	
	
	
}
