package exercises.vestiti;

public class SilkFabric extends FabricDecorator {
    private double cost;

    public SilkFabric(Clothing clothing, double cost) {
        super(clothing);
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + " with silk fabric";
    }

    @Override
    public double getCost() {
        return clothing.getCost() + cost;
    }
}
