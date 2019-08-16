package sk.vov.exam.model;

import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Department {
    @Id
    private String id;
    private String name;
    private String decan;

    public Department() {
    }

    public Department(String name, String decan) {
        this.name = name;
        this.decan = decan;
    }

    public Department(String id, String name, String decan) {
        this.id = id;
        this.name = name;
        this.decan = decan;
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

    public String getDecan() {
        return decan;
    }

    public void setDecan(String decan) {
        this.decan = decan;
    }

    @Override
    public String toString() {
        return "department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", decan='" + decan + '\'' +
                '}';
    }
}
