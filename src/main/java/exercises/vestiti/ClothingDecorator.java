package exercises.vestiti;

public abstract class ClothingDecorator extends Clothing{
    Clothing clothing;
    public ClothingDecorator(Clothing clothing) {
        this.clothing = clothing;
    }
}
