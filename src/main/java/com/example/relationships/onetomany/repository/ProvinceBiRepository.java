package com.example.relationships.onetomany.repository;

import com.example.relationships.onetomany.entity.ProvinceBi;
import com.example.relationships.onetomany.entity.ProvinceUni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceBiRepository extends JpaRepository<ProvinceBi,Long> {
}
