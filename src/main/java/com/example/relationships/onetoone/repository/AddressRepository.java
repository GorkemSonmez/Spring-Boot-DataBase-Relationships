package com.example.relationships.onetoone.repository;

import com.example.relationships.onetoone.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {

}
