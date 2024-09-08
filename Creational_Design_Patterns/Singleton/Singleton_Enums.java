package Singleton;

public enum Singleton_Enums {
    INSTANCE;  // This is the single instance

    // Add any other fields or methods to the singleton
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void doSomething() {
        System.out.println("Singleton is doing something!");
    }
}