package exercises.tempometeo;

import java.util.Random;

public class Soleggiato implements State {
    TempoMeteo tempoMeteo;
    Random randomMeteo = new Random(System.currentTimeMillis());
    public Soleggiato(TempoMeteo tempoMeteo) {
        this.tempoMeteo = tempoMeteo;
    }

    @Override
    public void cambiaMeteo() {
        int cambio = randomMeteo.nextInt(10);
        // caso in cui esce 0, 1, 2 (30%)
        if (cambio < 3) {
            tempoMeteo.setState(tempoMeteo.getNuvolosoState());
        }
        // Caso in cui esce 5, 6, 7, 8, 9 (50%)
        if (cambio >= 5) {
            tempoMeteo.setState(tempoMeteo.getPiovigginosoState());
        }
    }
}
