package com.sda.generic;

public class NumberBox<T extends Number> extends Box<T> {

  boolean hasSameValue(NumberBox<?> otherBox) {
    // todo compare doubles with specified precision
    return otherBox.get().doubleValue() == this.get().doubleValue();
  }
}
