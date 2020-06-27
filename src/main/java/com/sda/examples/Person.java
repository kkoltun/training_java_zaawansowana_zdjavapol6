package com.sda.examples;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
  private String firstName;
  private String lastName;
  private LocalDate dateOfBirth;

  public Person(String firstName, String lastName, LocalDate dateOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;

    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    return firstName.equals(person.firstName) &&
        lastName.equals(person.lastName) &&
        dateOfBirth.equals(person.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, dateOfBirth);
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", dateOfBirth=" + dateOfBirth +
        '}';
  }
}
