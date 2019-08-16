package sk.vov.exam.service.interfaces;

import sk.vov.exam.model.Student;

import java.util.List;

public interface IStudentService {
        void delete(String id);
        List<Student> getAll();
}
