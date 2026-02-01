package exercises.videogioco;

public class Test {

    public static void main(String[] args) {
        Character ken = new Guerriero(new FucileAlPlasma(), new MotoSubsonica());
        Character paul = new Alieno();

        ken.fight("Ken");
        ken.move("Ken");

        paul.fight("Paul");
        paul.move("Paul");
    }
}
