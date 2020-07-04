package com.sda.examples;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
  private String firstName;
  private String lastName;
  private LocalDate dateOfBirth;
  private int height;

  public Person(String firstName, String lastName, LocalDate dateOfBirth, int height) {
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

  @Override
  public int compareTo(Person o) {
    int heightDifference = this.getHeight() - o.getHeight();
    return heightDifference;
  }
}
