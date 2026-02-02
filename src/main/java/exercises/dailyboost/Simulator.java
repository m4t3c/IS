package exercises.dailyboost;

import java.util.Arrays;

public class Simulator {
    public static void main(String[] args) throws InterruptedException {
        // creiamo due studenti (Observer)
        StudentObserver alice = new StudentObserver("Alice", new ItalianDistribution()); // modalit� "distribuisci"
        StudentObserver federico   = new StudentObserver("Federico",   new EnglishDistribution()); // modalit� "broadcast"

        // Subject
        DailyBoost daily = new DailyBoost();
        daily.addStudent(alice);
        daily.addStudent(federico);

        // due strategie di messaggio di base
        MessageStrategy quote = new Frase();
        MessageStrategy emoji = new Emoji();

        // RandomMessageStrategy: genera casualmente quote o emoji
        MessageStrategy randomPicker = new RandomMessageStrategy(Arrays.asList(quote, emoji));
        daily.setMessageStrategy(randomPicker);

        System.out.println("=== Invio 3 messaggi con RandomMessageStrategy (quote/emoji) ===");
        for (int i = 0; i < 3; i++) {
            daily.notifyStudent();
            Thread.sleep(300); // solo per separare l'output
        }

        // Cambio runtime: Federico vuole ora ricevere in italiano (cambio DistributionStrategy)
        System.out.println("\n=== Cambio strategia di distribuzione di Federico in 'distribuisci' (italiano) ===");
        federico.setDistributionStrategy(new ItalianDistribution());
        daily.notifyStudent();

        // Cambio runtime: vogliamo ora usare solo QuoteMessage
        System.out.println("\n=== Imposto MessageStrategy a QuoteMessage (solo citazioni) ===");
        daily.setMessageStrategy(quote);
        daily.notifyStudent();


        // Rimozione di Alice (unsubscribing)
        System.out.println("\n=== Alice si disiscrive ===");
        daily.removeStudent(alice);
        daily.notifyStudent(); // solo Federico ricever�
    }
}