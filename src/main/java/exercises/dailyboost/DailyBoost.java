package exercises.dailyboost;

import java.util.ArrayList;
import java.util.List;

public class DailyBoost implements Subject{
    private final List<Observer> students = new ArrayList<>();
    private MessageStrategy messageStrategy;

    @Override
    public void addStudent(Observer student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Observer student) {
        int i = students.indexOf(student);
        students.remove(i);
    }

    public void setMessageStrategy(MessageStrategy strategy) {
        this.messageStrategy = strategy;
    }

    @Override
    public void notifyStudent() {
        if (messageStrategy == null) {
            System.out.println("[DailyBoost] Nessun messaggio impostato");
        }
        String message = messageStrategy.generateMessage();
        for (Observer student : students) {
            student.update(message);
        }
    }
}
