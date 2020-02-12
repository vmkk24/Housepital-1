package com.squad.housepital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.squad.housepital.entity.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
