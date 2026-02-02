package exercises.dailyboost;

import java.util.List;
import java.util.Random;

public class RandomMessageStrategy implements MessageStrategy{
    private final List<MessageStrategy> strategies;
    private final Random rnd = new Random();

    public RandomMessageStrategy(List<MessageStrategy> strategies) {
        if (strategies == null || strategies.isEmpty()) {
            throw new IllegalArgumentException("strategies non può essere vuoto");
        }
        this.strategies = strategies;
    }

    @Override
    public String generateMessage() {
        MessageStrategy s = strategies.get(rnd.nextInt(strategies.size()));
        return s.generateMessage();
    }
}
