package exercises.auto.factory;

public class BenzinaCarFactory extends CarFactory{
    public Car createCar(String type) {
        switch (type.toLowerCase()) {
            case "suv standard" : return new BenzinaSuvStandard();
            case "suv sport" : return new BenzinaSuvSport();
            case "berlina standard" : return new BenzinaBerlinaStandard();
            case "berlina sport" : return new BenzinaBerlinaSport();
            default: throw new IllegalArgumentException("Tipo di auto non valido");
        }
    }
}
