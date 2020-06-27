package com.sda.pizza;

import com.sda.pizza.abstr.factory.PizzaFactoryEnum;
import com.sda.pizza.swtch.factory.Pizza;
import com.sda.pizza.swtch.factory.PizzaFactorySwitch;

public class PizzaApp {
  public static void main(String[] args) {
    Pizza pizza = PizzaFactoryEnum.getPizza(PizzaFactoryEnum.PizzaType.BACON_AND_CHEESE);

    System.out.println(pizza);
  }
}
