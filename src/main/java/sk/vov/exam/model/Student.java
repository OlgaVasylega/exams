package sk.vov.exam.model;

public class Student {
    private String id;
    private String name;
    private Department department;

    public Student() {
    }

    public Student(String id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Student(String name, Department department) {
        this.name = name;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
