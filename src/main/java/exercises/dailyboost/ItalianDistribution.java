package exercises.dailyboost;

public class ItalianDistribution implements DistributionStrategy {
    @Override
    public String distribute(String message) {
        return ("IT: " + message);
    }
}
