package com.sda.exceptions;

import java.util.Scanner;

public class ExceptionApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Who are you?");
    String name = scanner.nextLine();

    try {
      greet(name);
    } catch (IllegalArgumentException exception) {
      System.out.println("Error happened: " + exception.getMessage());
    }
  }

  private static void greet(String who) {
    if (who == null || who.isBlank()) {
      throw new IllegalArgumentException("Who should not be blank!");
    }

    System.out.println("Hello, " + who + "!");
  }

  private static void testNullPointerException() {
    try {
      Object object = null;

      printSomeInfo();

      object.hashCode();
      System.out.println("Po wywolaniu hashCode");
    } catch (NullPointerException exception) {
      System.out.println("Null!");
    } finally {
      System.out.println("Zamykam aplikacje!");
    }

    System.out.println("Ostatnie slowo!");
  }

  private static void printSomeInfo() {
    String text = "Info 1";
    System.out.println(text);
    System.out.println("Info 2");
    System.out.println("Info 3");
  }
}
