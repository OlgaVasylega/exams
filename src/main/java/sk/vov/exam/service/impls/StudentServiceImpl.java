package sk.vov.exam.service.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import sk.vov.exam.model.Department;
import sk.vov.exam.model.Student;
import sk.vov.exam.repository.StudentRepository;
import sk.vov.exam.service.interfaces.IStudentService;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    StudentRepository repository;

    List<Student> student= new ArrayList<>();
    {
        Department department = new Department("5d44109be9e87c28dc9d5744", "EI", "Poplavsky");
        student.add(new Student("Makyta", department));
        student.add(new Student("Naumenko", department));
    }

    @PostConstruct
    void init(){
      repository.saveAll(student);


    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }
}
