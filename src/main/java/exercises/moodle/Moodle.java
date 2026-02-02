package exercises.moodle;

public class Moodle {
    public static void main(String[] args) {
        Professor guerra = new Professor();
        Student matteo = new Student("Matteo", new WhatsAppNotification());
        Student sara = new Student("Sara", new EmailNotification());

        guerra.addStudent(matteo);
        guerra.addStudent(sara);

        guerra.uploadSlides("Lezione 1 - fondamenti di etica filologica");
    }
}
