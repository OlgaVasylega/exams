package sk.vov.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.vov.exam.model.Department;
import sk.vov.exam.service.impls.DepartmentServiceImpl;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentServiceImpl service;
    @RequestMapping("/department/list")
    List<Department> showAll() {
        return service.getAll();
    }
        @RequestMapping("/department/del/{id}")
        String del(@PathVariable(value = "id")String id){
            System.out.println(id);
            service.delete(id);
            return"deleted";
        }

    }

