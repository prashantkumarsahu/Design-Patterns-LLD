package Factory.Machine;

import Factory.Product.Food;
import Factory.Product.Hotdog;

public class FoodShop {

    public static void main(String[] args) {
        HotdogMachine hotdogMachine = new HotdogMachine();

        Food hotdog = hotdogMachine.createFood();
        hotdog.prepare();
        hotdog.serve();

        PizzaMachine pizzaMachine = new PizzaMachine();
        Food pizza = pizzaMachine.createFood();

        pizza.prepare();
        pizza.serve();
    }
}
