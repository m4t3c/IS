package exercises.moodle;

public class TelegramNotification implements NotificationStrategy{
    @Override
    public void notify(String message) {
        System.out.println("Telegram\n" + message);
    }
}
