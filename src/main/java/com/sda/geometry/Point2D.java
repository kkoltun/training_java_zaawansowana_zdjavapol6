package com.sda.geometry;

class Point2D {
  double x;
  double y;

  Point2D() {
    this(0, 0);
  }

  Point2D(double x, double y) {
    String message = String.format("Constructing Point2D at [%f, %f]", x, y);
    System.out.println(message);

    this.x = x;
    this.y = y;
  }
}
