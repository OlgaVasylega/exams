package sk.vov.exam.model;

import java.time.LocalDate;
import java.util.List;
import java.util.PrimitiveIterator;

public class Reporting {
    private String id;
    private String name;
    private LocalDate date;
    private String professorName;
    private List<Student> student;
    private List<exam> exam;
}
