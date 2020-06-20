package com.sda.vehicles;

public class Car extends Vehicle {
  int passengers;

  public Car() {
    System.out.println("Empty car constructor.");
  }

  @Override
  public void run(double velocity) {
    System.out.println("Car running at speed " + velocity + ".");
  }

  void addPassenger() {
//    passengers = passengers + 1;
//    passengers += 1;
    ++passengers;
    System.out.println("Added passenger. Current number " + passengers + ".");
  }

  void removePassenger() {
    if (passengers < 1) {
      return;
    }

    --passengers;
    System.out.println("Removed passenger. Current number " + passengers + ".");
  }

  @Override
  public String toString() {
    return "Car{" +
        "passengers=" + passengers +
        '}';
  }
}
