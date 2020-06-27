package com.sda.vehicles;

public class VehicleApp {
  public static void main(String[] args) {
    Car car = new Car();
    car.addPassenger();
    car.run(100);

    Road<Car> carRoad = new Road<>();
    carRoad.addVehicle(car);

    Road<Motorcycle> motorcycleRoad = new Road<>();
    motorcycleRoad.addVehicle(new Motorcycle());
  }
}
