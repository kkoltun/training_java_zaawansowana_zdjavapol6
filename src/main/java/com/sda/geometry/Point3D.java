package com.sda.geometry;

public class Point3D extends Point2D {
  double z;

  Point3D() {
    super(0, 0);

    System.out.println("Empty Point3D constructor.");
    z = 0;
  }

  Point3D(double x, double y, double z) {
    super(x, y);

    System.out.println("Parametric Point3D constructor.");
    this.z = z;
  }
}
