package com.tryGit.cropService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tryGit.cropService.model.Crop;

@Repository
public interface CropRepository extends MongoRepository<Crop, String>{

}
