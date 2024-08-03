package Factory.Machine;


import Factory.Product.Food;
import Factory.Product.Hotdog;

public class HotdogMachine implements FoodMachine {
  @Override
  public Food createFood() {
    return new Hotdog();
  }
}
