package com.example.compliment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.compliment.models.compliment;

@Repository
public interface complimentRepository extends JpaRepository<compliment, Long> {

}
