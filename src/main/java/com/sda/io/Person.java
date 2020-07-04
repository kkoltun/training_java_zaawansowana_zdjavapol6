package com.sda.io;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Person implements Serializable {
  private String firstName;
  private String lastName;
  private LocalDate dateOfBirth;
  private int height;

  @JsonCreator
  public Person(@JsonProperty("firstName") String firstName,
                @JsonProperty("lastName") String lastName,
                @JsonProperty("dateOfBirth") LocalDate dateOfBirth,
                @JsonProperty("height") int height) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.height = height;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public boolean equals(Object o) {
    System.out.println("EQUALS CALLED");
    if (this == o) return true;

    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    return firstName.equals(person.firstName) &&
        lastName.equals(person.lastName) &&
        dateOfBirth.equals(person.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName);
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", dateOfBirth=" + dateOfBirth +
        ", height=" + height +
        '}';
  }
}
