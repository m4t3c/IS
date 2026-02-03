package exercises.vestiti;

public class PlasticButton extends ButtonDecorator{
    private double cost;

    public PlasticButton(Clothing clothing, double cost) {
        super(clothing);
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + " with plastic buttons";
    }

    @Override
    public double getCost() {
        return clothing.getCost() + cost;
    }
}
