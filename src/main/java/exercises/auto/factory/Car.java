package exercises.auto.factory;

public abstract class Car {
    String model;
    String engine;
    String body;
    String interior;

    void showSpec() {
        System.out.println(model + " - " + engine + " - " + body + " - " + interior);
    }
}
