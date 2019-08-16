package sk.vov.exam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sk.vov.exam.model.Department;
import sk.vov.exam.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
