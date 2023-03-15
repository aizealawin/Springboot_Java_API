package com.example.compliment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.compliment.exceptions.ResourceNotFoundException;
import com.example.compliment.models.compliment;
import com.example.compliment.repository.complimentRepository;

@RestController
@RequestMapping("/api/v1")

public class complimentController {

  @Autowired
  private complimentRepository complimentRepository;

  // get compliments
  @GetMapping("compliments")
  public List<compliment> getAllCompliments() {
    return this.complimentRepository.findAll();
  }

  // get compliment by id
  @GetMapping("/compliments/{id}")
  public ResponseEntity<compliment> getComplimentById(@PathVariable(value = "id") Long complimentId)
      throws ResourceNotFoundException {
    compliment compliment = complimentRepository.findById(complimentId)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + complimentId));
    return ResponseEntity.ok().body(compliment);
  }
  // save compliment
  // update compliment
  // delete compliment

}
