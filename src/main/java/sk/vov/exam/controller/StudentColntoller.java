package sk.vov.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.vov.exam.model.Department;
import sk.vov.exam.model.Student;
import sk.vov.exam.service.impls.DepartmentServiceImpl;
import sk.vov.exam.service.impls.StudentServiceImpl;

import java.util.List;
@RestController
public class StudentColntoller {
        @Autowired
        StudentServiceImpl service;
        @RequestMapping("/student/list")
        List<Student> showAll() {

            return service.getAll();
        }
        @RequestMapping("/student/del/{id}")
        String del(@PathVariable(value = "id")String id){
            System.out.println(id);
            service.delete(id);
            return"deleted";
        }

    }

