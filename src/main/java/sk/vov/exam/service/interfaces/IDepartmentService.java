package sk.vov.exam.service.interfaces;

import sk.vov.exam.model.Department;

import java.util.List;

public interface IDepartmentService {
    void delete(String id);
    List<Department> getAll();

}
