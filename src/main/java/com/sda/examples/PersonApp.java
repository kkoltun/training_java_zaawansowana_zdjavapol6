package com.sda.examples;

import static java.time.LocalDate.now;

public class PersonApp {
  public static void main(String[] args) {
    Person person1 = new Person("Karol", "Koltun", now());
    Person person2 = new Person("Karol", "Koltun", now());

    System.out.println(person1.equals(person2));
  }
}
