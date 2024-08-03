package Factory.Machine;


import Factory.Product.Food;
import Factory.Product.Pizza;

public class PizzaMachine implements FoodMachine {

  @Override
  public Food createFood() {
    return new Pizza();
  }
}
