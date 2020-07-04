package com.sda.examples;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import static java.time.LocalDate.now;
import static java.time.Month.NOVEMBER;

public class CollectionExamples {
  public static void main(String[] args) {
    Map<String, Person> people = new HashMap<>();

    people.put("1", new Person("Karol",
        "Koltun",
        now(),
        182));
    people.put("2", new Person("Magdalena",
        "Nowak",
        LocalDate.of(1992, NOVEMBER, 11), 181));

    Set<Map.Entry<String, Person>> elements = people.entrySet();
    for (Map.Entry<String, Person> element : elements) {
      String key = element.getKey();
      Person value = element.getValue();
      System.out.println("#" + key + ": " + value);
    }

    people.put("1", new Person("Adam", "Bodnar", now(), 178));
    elements = people.entrySet();
    for (Map.Entry<String, Person> element : elements) {
      String key = element.getKey();
      Person value = element.getValue();
      System.out.println("#" + key + ": " + value);
    }
  }
}
