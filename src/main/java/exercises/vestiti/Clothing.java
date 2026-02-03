package exercises.vestiti;

public abstract class Clothing {
    public abstract String getDescription();
    public abstract double getCost();

    protected PackagingStrategy packaging;

    public void setPackaging(PackagingStrategy packaging) {
        this.packaging = packaging;
    }

    public void applyPackaging() {
        if (packaging != null) {
            packaging.pack(this);
        }
        else {
            System.out.println("No packaging selected for " + getDescription());
        }
    }
}
