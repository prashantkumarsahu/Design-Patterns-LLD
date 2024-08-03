package Factory.Machine;


import Factory.Product.Food;
import Factory.Product.Hotdog;

public class HotdogMachine implements FoodMachine {

  private Hotdog hotdog;
  public HotdogMachine(){
    hotdog = new Hotdog();
  }

  @Override
  public Food createFood() {
    return hotdog;
  }

  @Override
  public void serveFood(){
    hotdog.serve();
  }
}
