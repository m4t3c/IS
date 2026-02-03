package exercises.vestiti;

public class GiftPackaging implements PackagingStrategy {

    @Override
    public void pack(Clothing clothing) {
        System.out.println("Packaging " + clothing.getDescription() + " as a gift.");
    }
}
