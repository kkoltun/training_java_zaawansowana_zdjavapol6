package com.sda.pizza.abstr.factory;

import com.sda.pizza.swtch.factory.Pizza;

public class PizzaFactoryEnum {
  public enum PizzaType {
    MARGHERITA {
      @Override
      Pizza bake() {
        Pizza pizza = new Pizza();
        // Dodaj skladniki
        return pizza;
      }
    },
    BACON_AND_CHEESE {
      @Override
      Pizza bake() {
        Pizza pizza = new Pizza();
        // Dodaj skladniki
        return pizza;
      }
    };

    abstract Pizza bake();
  }

  public static Pizza getPizza(PizzaType pizzaType) {
    return pizzaType.bake();
  }
}
