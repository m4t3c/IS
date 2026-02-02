package exercises.dailyboost;

import java.util.ArrayList;
import java.util.Random;

public class Emoji implements MessageStrategy{
    private final String[] emojis = {
            ":-)", ";-)", ":-*"
    };
    private final Random rnd = new Random();

    @Override
    public String generateMessage() {
        return emojis[rnd.nextInt(emojis.length)];
    }
}
