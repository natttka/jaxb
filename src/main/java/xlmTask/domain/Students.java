package xlmTask.domain;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="students")
public class Students {
    List<Student> studentsList = new ArrayList<>();

    public void add(Student student) {
        this.studentsList.add(student);
    }

    @XmlElement(name = "student")
    public List<Student> getStudentsList() {
        return studentsList;
    }
    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }
}
