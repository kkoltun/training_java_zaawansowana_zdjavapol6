package com.sda.examples;

public class Greeter {
  void greet() {
    greet("World");
  }

  void greet(String name) {
    greet("Hello", name);
  }

  void greet(String greeting, String name) {
    String message = String.format("%s, %s!",greeting, name);
    System.out.println(message);
  }

  public static void main(String[] args) {
    Greeter greeter = new Greeter();
    greeter.greet();
    greeter.greet("Karol");
    greeter.greet("Cześć", "Wiktoria");
  }
}
