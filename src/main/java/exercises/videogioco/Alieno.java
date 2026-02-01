package exercises.videogioco;

public class Alieno extends Character {

    public Alieno() {
        setFightBehaviour(new BlobVelenoso());
        setMoveBehaviour(new Teletrasporto());
    }
}
