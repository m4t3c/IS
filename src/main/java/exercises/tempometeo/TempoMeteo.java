package exercises.tempometeo;

public class TempoMeteo {
    State soleggiatoState;
    State piovigginosoState;
    State nuvolosoState;
    State state;

    void setState(State state){
        this.state = state;
    }

    State getSoleggiatoState() {
        return new Soleggiato(this);
    }

    State getPiovigginosoState() {
        return new Piovigginoso(this);
    }

    State getNuvolosoState(){
        return new Nuvoloso(this);
    }
}
