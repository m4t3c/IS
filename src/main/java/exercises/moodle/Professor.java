package exercises.moodle;

import java.util.ArrayList;

public class Professor implements Subject{
    private ArrayList<Observer> students;
    private String slide;

    public Professor() {
        students = new ArrayList<Observer>();
    }

    @Override
    public void addStudent(Observer student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Observer student) {
        int i = students.indexOf(student);
        if (i >= 0) {
            students.remove(i);
        }
    }

    @Override
    public void notifyStudents(String slide) {
        for (Observer student : students) {
            student.update(slide);
        }
    }

    public void uploadSlides(String slide) {
        System.out.println("Il professore ha caricato una nuova presentazione: " + slide);
        notifyStudents(slide);
    }

}
