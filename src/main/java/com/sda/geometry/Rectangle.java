package com.sda.geometry;

public class Rectangle extends FlatShape {
  Rectangle(double x, double y) {
    super(x, y);
  }

  @Override
  double getArea() {
    return x*y;
  }
}
