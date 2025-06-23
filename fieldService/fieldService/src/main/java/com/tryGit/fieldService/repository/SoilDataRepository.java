package com.tryGit.fieldService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tryGit.fieldService.model.SoilData;

@Repository
public interface SoilDataRepository extends JpaRepository<SoilData, Long>{

}
