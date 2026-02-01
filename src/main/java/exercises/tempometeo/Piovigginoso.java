package exercises.tempometeo;

public class Piovigginoso implements State{
    TempoMeteo tempoMeteo;

    public Piovigginoso(TempoMeteo tempoMeteo) {
        this.tempoMeteo = tempoMeteo;
    }

    @Override
    public void cambiaMeteo() {

    }
}
