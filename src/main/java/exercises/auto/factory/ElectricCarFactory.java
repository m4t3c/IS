package exercises.auto.factory;

public class ElectricCarFactory extends CarFactory{

    @Override
    public Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "suv standard" : new ElettricoSuvStandard();
            case "suv sport" : new ElettricoSuvSport();
            case "berlina standard" : new ElettricoBerlinaStandard();
            case "berlina sport" : new ElettricoBerlinaSport();
            default: throw new IllegalArgumentException("Tipo non valido");
        }
    }
}
