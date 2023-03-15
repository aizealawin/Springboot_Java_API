package com.example.compliment.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compliments")

public class compliment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "native_compliment")
  private String nativeCompliment;

  @Column(name = "language")
  private String language;

  @Column(name = "translation")
  private String translation;

  public compliment() {
    super();
  }

  public compliment(String nativeCompliment, String language, String translation) {
    this.nativeCompliment = nativeCompliment;
    this.language = language;
    this.translation = translation;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNativeCompliment() {
    return nativeCompliment;
  }

  public void setNativeCompliment(String nativeCompliment) {
    this.nativeCompliment = nativeCompliment;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getTranslation() {
    return translation;
  }

  public void setTranslation(String translation) {
    this.translation = translation;
  }

}
