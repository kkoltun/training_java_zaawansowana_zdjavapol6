package com.sda.pizza.swtch.factory;

public class PizzaFactorySwitch {
  public enum PizzaType {
    MARGHERITA,
    BACON_AND_CHEESE
  }

  public static Pizza bakePizza(PizzaType pizzaType) {
    Pizza pizza = new Pizza();

    switch (pizzaType) {
      case MARGHERITA:
        pizza.addIngredient("sauce");
        pizza.addIngredient("mozarella");
        break;
      case BACON_AND_CHEESE:
        pizza.addIngredient("sauce");
        pizza.addIngredient("bacon");
        pizza.addIngredient("cheese");
        break;
      default:
        System.out.println("Unknown pizza!");
    }

    return pizza;
  }
}
