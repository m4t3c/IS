package exercises.auto.factory;

public class Simulator {
    public static void main(String[] args) {
        CarFactory carFactory = new BenzinaCarFactory();
        Car car = carFactory.createCar("suv sport");

        car.showSpec();
    }
}
