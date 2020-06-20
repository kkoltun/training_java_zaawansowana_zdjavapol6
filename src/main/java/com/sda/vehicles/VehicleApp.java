package com.sda.vehicles;

public class VehicleApp {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    vehicle.run(100);

    vehicle = new Car();
    vehicle.run(50);
  }
}
