package com.sda.geometry;

public abstract class FlatShape {
  protected double x;
  protected double y;

  FlatShape(double x, double y) {
    this.x = x;
    this.y = y;
  }

  void printDimensions() {
    System.out.println(
        String.format("FlatShape [x, y] = [%f, %f]", x, y));
  }

  abstract double getArea();
}
