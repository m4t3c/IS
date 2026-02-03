package exercises.vestiti;

public class GoldenButton extends ButtonDecorator {
    private double cost;

    public GoldenButton(Clothing clothing, double cost) {
        super(clothing);
        this.cost = cost;
    }


    @Override
    public String getDescription() {
        return clothing.getDescription() + " with golden buttons";
    }

    @Override
    public double getCost() {
        return clothing.getCost() + cost;
    }
}
