package com.sda.vehicles;

public class Vehicle {
  public Vehicle() {
    System.out.println("Empty vehicle constructor.");
  }

  public void run(double velocity) {
    System.out.println("Vehicle running at speed " + velocity + ".");
  }
}
