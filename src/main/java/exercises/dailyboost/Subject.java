package exercises.dailyboost;

public interface Subject {
    public void addStudent(Observer student);
    public void removeStudent(Observer student);
    public void notifyStudent();
}
