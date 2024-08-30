
public class Law_of_Demeter {

    // WRONG - Without Law of Demeter
    class Engine {
        public void start() {
            System.out.println("Engine started");
        }
    }

    class Car {
        private Engine engine = new Engine();

        public Engine getEngine() {
            return engine;
        }
    }

    // method of Driver class directly interacts with Engine class. violating Law of Demeter.
    class Driver {
        public void startCar(Car car) {
            car.getEngine().start(); // Directly interacting with the engine of the car
        }
    }

    // ******************************************************************************************
    // RIGHT - With Law of Demeter
    class Engine1 {
        public void start() {
            System.out.println("Engine started");
        }
    }

    class Car1 {
        private Engine1 engine = new Engine1();

        public void startEngine() {
            engine.start(); // Encapsulation within the Car class
        }
    }
    // method of Driver class interacts only with Car class, which then calls engine class.
    class Driver1 {
        public void startCar(Car1 car) {
            car.startEngine(); // Interacting only with the Car class
        }
    }

}


