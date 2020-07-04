package com.sda.examples;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Comparator.reverseOrder;

public class PersonApp {
  public static void main(String[] args) {
    testPredicates();
  }

  private static void testFunctions() {
    Function<Person, String> getName = new Function<Person, String>() {
      @Override
      public String apply(Person person) {
        return person.getFirstName();
      }
    };

    Function<Person, String> getNameLambda = (Person person) -> {
      return person.getFirstName();
    };

    Function<Person, String> getNameShortLamdba = person -> person.getFirstName();

    Function<Person, String> getNameMethodReferenceFromPerson = Person::getFirstName;

    Function<Person, String> getNameMethodReferenceFromHere = PersonApp::getPersonFirstName;
  }

  private static void testPredicates() {
    Person high = new Person("K", "K", LocalDate.now(), 182);
    Person notHigh = new Person("A", "B", LocalDate.now(), 178);

    Predicate<Person> isHigherThan180 = new Predicate<Person>() {
      @Override
      public boolean test(Person person) {
        return person.getHeight() > 180;
      }
    };

    Predicate<Person> isHigherThan180Lambda = (Person person) -> {
      return person.getHeight() > 180;
    };

    Predicate<Person> isHigherThan180ShortLambda = person -> person.getHeight() > 180;

    Predicate<Person> isHigherThan180methodReference = PersonApp::isHigherThan180method;

    System.out.println(isHigherThan180.test(high));
    System.out.println(isHigherThan180.test(notHigh));
  }

  private static String getPersonFirstName(Person person) {
    return person.getFirstName();
  }

  private static boolean isHigherThan180method(Person person) {
    return person.getHeight() > 180;
  }

  private static Optional<Person> getHighestBornIn(List<Person> people, LocalDate date) {
    List<Person> bornInDate = new ArrayList<>();
    for (Person person : people) {
      if (person.getDateOfBirth().equals(date)) {
        bornInDate.add(person);
      }
    }

    if (bornInDate.isEmpty()) {
      return Optional.empty();
    }

    bornInDate.sort(reverseOrder());
    return Optional.of(bornInDate.get(0));
  }
}
