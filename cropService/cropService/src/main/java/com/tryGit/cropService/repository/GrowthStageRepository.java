package com.tryGit.cropService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tryGit.cropService.model.GrowthStage;

@Repository
public interface GrowthStageRepository extends MongoRepository<GrowthStage, String>{

}
