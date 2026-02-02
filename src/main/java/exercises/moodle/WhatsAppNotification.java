package exercises.moodle;

public class WhatsAppNotification implements NotificationStrategy{
    @Override
    public void notify(String message) {
        System.out.println("WhatsApp\n" + message);
    }
}
