package exercises.dailyboost;

import java.util.Random;

public class Frase implements MessageStrategy{
    private final String[] quotes = {
            "Keep going!",
            "You can do it!",
            "Never give up!"
    };
    private final Random rnd = new Random();

    @Override
    public String generateMessage() {
        return quotes[rnd.nextInt(quotes.length)];
    }
}
