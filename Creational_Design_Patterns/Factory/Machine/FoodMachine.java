package Factory.Machine;

import Factory.Product.Food;

public interface FoodMachine {

  // can be interface or abstract class

//  public abstract Food createFood();
  Food createFood();

  void serveFood();
}
