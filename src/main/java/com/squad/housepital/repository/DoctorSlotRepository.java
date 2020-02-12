package com.squad.housepital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.squad.housepital.entity.DoctorSlot;

@Repository
public interface DoctorSlotRepository extends JpaRepository<DoctorSlot, Integer>{

}
