package com.tryGit.cropService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tryGit.cropService.model.FertilizerUsage;

@Repository
public interface FertilizerUsageRepository extends MongoRepository<FertilizerUsage, String>{

}
