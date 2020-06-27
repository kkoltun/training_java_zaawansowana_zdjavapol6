package com.sda.generic;

public class NumberBoxApp {
  public static void main(String[] args) {
    NumberBox<Integer> integerBox = new NumberBox<>();
    integerBox.set(1234);

    NumberBox<Double> doubleBox = new NumberBox<>();
    doubleBox.set(1234.);

    System.out.println(integerBox.hasSameValue(doubleBox));
  }
}
