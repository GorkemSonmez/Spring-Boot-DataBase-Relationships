package com.example.relationships.onetomany.repository;

import com.example.relationships.onetomany.entity.DistrictBi;
import com.example.relationships.onetomany.entity.DistrictUni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistricBiRepository extends JpaRepository<DistrictBi,Long> {
}
