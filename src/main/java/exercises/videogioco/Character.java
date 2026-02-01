package exercises.videogioco;

public abstract class Character {

    private FightBehaviour fightBehaviour;
    private MoveBehaviour moveBehaviour;

    public void setFightBehaviour(FightBehaviour fightBehaviour) {
        this.fightBehaviour = fightBehaviour;
    }

    public void setMoveBehaviour(MoveBehaviour moveBehaviour) {
        this.moveBehaviour = moveBehaviour;
    }

    public void fight(String name) {
        System.out.print(name + " combatte con ");
        fightBehaviour.fight();
    }

    public void move(String name) {
        System.out.print(name + " si muove con ");
        moveBehaviour.move();
    }
}
