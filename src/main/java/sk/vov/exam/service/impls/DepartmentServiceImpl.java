package sk.vov.exam.service.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.vov.exam.model.Department;
import sk.vov.exam.repository.DepartmentRepository;
import sk.vov.exam.service.interfaces.IDepartmentService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    DepartmentRepository repository;


    List<Department> departments = new ArrayList<>();
    {
        departments.add(new Department("EI","Kot"));
        departments.add(new Department("MIM","Petrov"));
        departments.add(new Department("IT","Povhan"));
    }
    @PostConstruct
    void init(){
    //repository.saveAll(departments);

    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Department> getAll() {
        return repository.findAll();
    }
}
