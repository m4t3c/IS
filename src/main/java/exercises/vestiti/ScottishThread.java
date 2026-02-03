package exercises.vestiti;

public class ScottishThread extends ThreadDecorator{
    private double cost;

    public ScottishThread(Clothing clothing, double cost) {
        super(clothing);
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return clothing.getDescription() + " with Scottish thread";
    }

    @Override
    public double getCost() {
        return clothing.getCost() + cost;
    }
}
