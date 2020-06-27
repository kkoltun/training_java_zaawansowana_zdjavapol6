package com.sda.generic;

public class Box<T> {
  private T element;

  public Box(T element) {
    this.element = element;
  }

  public Box() {
  }

  public T get() {
    return element;
  }

  public void set(T element) {
    this.element = element;
  }

  public <U> void exampleGenericMethod(U argument) {
    System.out.println("Argument: " + argument.toString());
    System.out.println("Argument class: " + argument.getClass().getCanonicalName());
  }
}
