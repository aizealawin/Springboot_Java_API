package com.example.compliment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.compliment.exceptions.ResourceNotFoundException;
import com.example.compliment.models.compliment;
import com.example.compliment.repository.complimentRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")

public class complimentController {

  @Autowired
  private complimentRepository complimentRepository;

  // get compliments
  @GetMapping("/compliments")
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
  @PostMapping("/compliments")
  public compliment createCompliment(@RequestBody compliment compliment) {
    return this.complimentRepository.save(compliment);

  }

  // update compliment
  @PutMapping("/compliments/{id}")
  public ResponseEntity<compliment> updateCompliment(@PathVariable(value = "id") Long complimentId,
      @Valid @RequestBody compliment complimentDetails) throws ResourceNotFoundException {
    compliment compliment = complimentRepository.findById(complimentId)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + complimentId));
    compliment.setLanguage(complimentDetails.getLanguage());
    compliment.setNativeCompliment(complimentDetails.getNativeCompliment());
    compliment.setTranslation(complimentDetails.getTranslation());
    final compliment updatedCompliment = complimentRepository.save(compliment);
    return ResponseEntity.ok(updatedCompliment);
  }
  // delete compliment

}
