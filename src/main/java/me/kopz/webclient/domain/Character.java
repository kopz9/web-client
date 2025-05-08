package me.kopz.webclient.domain;

import java.util.Objects;

public class Character {

  private Long id;
  private String name;
  private String status;
  private String species;
  private String gender;
  private String image;

  public Character(){}

  public Character(Long id, String name, String status, String species, String gender, String image) {
    this.id = id;
    this.name = name;
    this.status = status;
    this.species = species;
    this.gender = gender;
    this.image = image;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "Character{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", status='" + status + '\'' +
        ", species='" + species + '\'' +
        ", gender='" + gender + '\'' +
        ", image='" + image + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Character character = (Character) o;
    return Objects.equals(id, character.id) && Objects.equals(name, character.name) && Objects.equals(status, character.status) && Objects.equals(species, character.species) && Objects.equals(gender, character.gender) && Objects.equals(image, character.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, species, gender, image);
  }
}
