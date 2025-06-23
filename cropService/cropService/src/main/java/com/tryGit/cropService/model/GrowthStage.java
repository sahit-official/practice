package com.tryGit.cropService.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GrowthStage {
	
	@Id
	private String id;
	
	private Long growthStageId;
	private String stageName;
	private LocalDate startDate;
	private LocalDate endDate;
	private Long cropId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getGrowthStageId() {
		return growthStageId;
	}
	public void setGrowthStageId(Long growthStageId) {
		this.growthStageId = growthStageId;
	}
	public String getStageName() {
		return stageName;
	}
	public void setStageName(String stageName) {
		this.stageName = stageName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Long getCropId() {
		return cropId;
	}
	public void setCropId(Long cropId) {
		this.cropId = cropId;
	}
	
	
	
	

}
