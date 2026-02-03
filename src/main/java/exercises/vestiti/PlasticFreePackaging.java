package exercises.vestiti;

public class PlasticFreePackaging implements PackagingStrategy{
    @Override
    public void pack(Clothing clothing) {
        System.out.println("Packaging " + clothing.getDescription() + " without plastic.");
    }
}
