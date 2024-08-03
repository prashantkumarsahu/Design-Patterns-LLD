public class Composition_Over_Inheritance {

    // Using Inheritance, Car essentially becomes Engine
    // Engine is tightly coupled to Car

    class Engine {
        public void start() {
            System.out.println("Engine started");
        }
    }

    class Car extends Engine {
        public void drive() {
            start(); // Inheriting the start method from Engine, start() method of Engine is called by Car object
            System.out.println("Car is driving");
        }
    }


    // Using Composition;

    class Engine1 {
        public void start() {
            System.out.println("Engine started");
        }
    }

    class Car1 {
        private Engine1 engine;

        public Car1(Engine1 engine) {
            this.engine = engine;
        }

        public void drive() {
            engine.start(); // Delegating the start action to the Engine object
            System.out.println("Car is driving");
        }
    }
}
