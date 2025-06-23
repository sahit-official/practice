package com.tryGit.fieldService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tryGit.fieldService.model.IrrigationLog;

@Repository
public interface IrrigationLogRepository extends JpaRepository<IrrigationLog, Long>{

}
