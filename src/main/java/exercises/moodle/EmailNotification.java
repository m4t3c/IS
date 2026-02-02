package exercises.moodle;

public class EmailNotification implements NotificationStrategy{
    @Override
    public void notify(String message) {
        System.out.println("Gmail\n" + message);
    }
}
