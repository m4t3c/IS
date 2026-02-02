package exercises.moodle;

public interface Subject {
    public void addStudent(Observer student);
    public void removeStudent(Observer student);
    public void notifyStudents(String slide);
}
