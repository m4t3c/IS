package exercises.vestiti;

public class BasicClothing extends Clothing{

    @Override
    public String getDescription() {
        return "Basic clothing";
    }

    @Override
    public double getCost() {
        return 20.0;
    }
}
