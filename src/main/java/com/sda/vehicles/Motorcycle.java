package com.sda.vehicles;

public class Motorcycle extends Vehicle {
  @Override
  public void run(double velocity) {
    super.run(velocity);

    System.out.println("Motorcycle running " + velocity);
  }
}
