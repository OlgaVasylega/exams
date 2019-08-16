package sk.vov.exam.model;

import java.time.LocalDate;

public class exam {
    private String id;
    private String name ;
    private LocalDate date;
    private Student professor;
    private Student student;
    private char mark;
    private boolean present;

    public exam() {
    }

    public exam(String name, LocalDate date, Student professor, Student student, char mark, boolean present) {
        this.name = name;
        this.date = date;
        this.professor = professor;
        this.student = student;
        this.mark = mark;
        this.present = present;
    }

    public exam(String id, String name, LocalDate date, Student professor, Student student, char mark, boolean present) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.professor = professor;
        this.student = student;
        this.mark = mark;
        this.present = present;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Student getProfessor() {
        return professor;
    }

    public void setProfessor(Student professor) {
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    @Override
    public String toString() {
        return "exam{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", professor=" + professor +
                ", student=" + student +
                ", mark=" + mark +
                ", present=" + present +
                '}';
    }
}
