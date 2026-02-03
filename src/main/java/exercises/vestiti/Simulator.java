package exercises.vestiti;

public class Simulator {
    public static void main(String[] args) {
        // --- Vestito di qualità ---
        Clothing basicQuality = new BasicClothing();

        Clothing qualityButton = new GoldenButton(basicQuality, 15.0);
        Clothing qualityFabric = new SilkFabric(qualityButton, 40.0);
        Clothing qualityThread = new ScottishThread(qualityFabric, 8.0);

        qualityThread.setPackaging(new GiftPackaging());

        System.out.println("Quality → " + qualityThread.getDescription()
                + " → cost: " + qualityThread.getCost());
        qualityThread.applyPackaging();

        // --- Vestito normale ---
        Clothing basicNormal = new BasicClothing();

        Clothing normalButton = new PlasticButton(basicNormal, 3.0);
        Clothing normalFabric = new SilkFabric(normalButton, 10.0);
        Clothing normalThread = new ScottishThread(normalFabric, 4.0);

        normalThread.setPackaging(new PlasticFreePackaging());

        System.out.println("Normal → " + normalThread.getDescription()
                + " → cost: " + normalThread.getCost());
        normalThread.applyPackaging();
    }
}