package com.sda.pizza.abstr.factory;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
  private final List<String> ingredients = new ArrayList<>();

  void addIngredient(String ingredient) {
    ingredients.add(ingredient);
  }

  public List<String> getIngredients() {
    return new ArrayList<>(ingredients);
  }

  @Override
  public String toString() {
    return "Pizza{" +
        "ingredients=" + ingredients +
        '}';
  }
}
