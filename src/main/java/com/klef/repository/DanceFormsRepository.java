package com.klef.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.entity.DanceForms;
@Repository
public interface DanceFormsRepository extends JpaRepository<DanceForms, Long>{

}
