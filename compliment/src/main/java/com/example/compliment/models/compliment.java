package com.example.compliment.models;

import org.springframework.web.servlet.FlashMapManager;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compliments")

public class compliment {

  private long id;
  private String nativeCompliment;
  private String language;
  private String translation;

  public compliment() {

  }

  public compliment(String nativeCompliment, String language, String translation) {
    this.nativeCompliment = nativeCompliment;
    this.language = language;
    this.translation = translation;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Column(name = "native_compliment", nullable = false)
  public String getNativeCompliment() {
    return nativeCompliment;
  }

  public void setNativeCompliment(String nativeCompliment) {
    this.nativeCompliment = nativeCompliment;
  }

  @Column(name = "language", nullable = false)
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Column(name = "translation", nullable = false)
  public String getTranslation() {
    return translation;
  }

  public void setTranslation(String translation) {
    this.translation = translation;
  }

  @Override
  public String toString() {
    return "compliment [id=" + id + ", nativeCompliment=" + nativeCompliment + ", language=" + language + "translation="
        + translation + "]";
  }
}
