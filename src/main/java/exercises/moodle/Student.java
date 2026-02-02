package exercises.moodle;

public class Student implements Observer{
    private String name;
    private NotificationStrategy notificationStrategy;

    public Student(String name, NotificationStrategy notificationStrategy) {
        this.name = name;
        this.notificationStrategy = notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    @Override
    public void update(String slide) {
        String message = "Nuova notifica per " + name + ": Nuove slide caricate: " + slide;
        notificationStrategy.notify(message);
    }
}
