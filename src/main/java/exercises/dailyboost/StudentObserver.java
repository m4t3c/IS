package exercises.dailyboost;

public class StudentObserver implements Observer {
    private final String name;
    private DistributionStrategy distributionStrategy;

    public StudentObserver(String name, DistributionStrategy strategy) {
        this.name = name;
        this.distributionStrategy = strategy;
    }

    @Override
    public void update(String message) {
        String localized = distributionStrategy.distribute(message);
        System.out.println(name + " received: " + localized);
    }


    public void setDistributionStrategy(DistributionStrategy strategy) {
        this.distributionStrategy = strategy;
    }

    public String getName() { return name; }
}
