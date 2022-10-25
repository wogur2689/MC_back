package com.example.mc_back.repository;

import com.example.mc_back.entity.FaqEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqRepository extends JpaRepository<FaqEntity, Long> {
}
