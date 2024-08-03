package Factory.Machine;

import Factory.Product.Food;
import Factory.Product.Pizza;

public class PizzaMachine implements FoodMachine {

  private Pizza pizza;

  PizzaMachine(){
    pizza = new Pizza();
  }

  @Override
  public Food createFood() {
    return pizza;
  }

  @Override
  public void serveFood(){
    pizza.serve();
  }
}
