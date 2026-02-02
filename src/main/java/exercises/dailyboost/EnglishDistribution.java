package exercises.dailyboost;

public class EnglishDistribution implements DistributionStrategy {
    @Override
    public String distribute(String message) {
        return ("EN: " + message);
    }
}
