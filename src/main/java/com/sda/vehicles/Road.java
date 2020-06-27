package com.sda.vehicles;

import java.util.ArrayList;
import java.util.List;

public class Road<T extends Vehicle> {
  List<T> vehicles = new ArrayList<>();

  void addVehicle(T vehicle) {
    vehicles.add(vehicle);
  }

  void limitSpeed() {
    // TODO:
    //  1. Sprawdz czy pojazd jedzie wiecej niz 40
    //  2A. Jesli tak to zmniejsz do 40
    //  2B. Jesli nie nie zmieniaj jego predkosci (jedzie wystarczajaco wolno)

    for (int i = 0; i < vehicles.size(); ++i) {
      vehicles.get(i).run(40);
    }
  }

  @Override
  public String toString() {
    return "Road{" +
        "vehicles=" + vehicles +
        '}';
  }
}
