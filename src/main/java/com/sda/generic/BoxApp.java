package com.sda.generic;

public class BoxApp {
  public static void main(String[] args) {
    Box<Integer> intBox = new Box<>();
    intBox.set(1234);
    System.out.println(intBox.get());

    Box<String> textBox = new Box<>();
    textBox.set("Hello, World!");
    String hello = textBox.get();

    // Raw type UNIKAJ!
    Box rawBox = new Box();
    rawBox.set("text");
    Object object = rawBox.get();
    String number = (String) object;
    System.out.println(number);

    Integer integer = 1234;
    textBox.exampleGenericMethod(integer);
    textBox.exampleGenericMethod(new Box<>());
  }

  public static <T> void genericMethod(T argument) {
    System.out.println("Got argument of class: " + argument.getClass().getCanonicalName());
  }
}
