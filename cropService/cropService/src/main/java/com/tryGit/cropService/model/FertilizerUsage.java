package com.tryGit.cropService.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FertilizerUsage {

	@Id
	private String id;
	
	private Long fertilizerUsageId;
	private String fertilizerName;
	private Long quantity;
	private LocalDate dateUsed;
	private Long cropId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getFertilizerUsageId() {
		return fertilizerUsageId;
	}
	public void setFertilizerUsageId(Long fertilizerUsageId) {
		this.fertilizerUsageId = fertilizerUsageId;
	}
	public String getFertilizerName() {
		return fertilizerName;
	}
	public void setFertilizerName(String fertilizerName) {
		this.fertilizerName = fertilizerName;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public LocalDate getDateUsed() {
		return dateUsed;
	}
	public void setDateUsed(LocalDate dateUsed) {
		this.dateUsed = dateUsed;
	}
	public Long getCropId() {
		return cropId;
	}
	public void setCropId(Long cropId) {
		this.cropId = cropId;
	}
	
	
}
