package xlmTask.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="result")
public class Result {
    private String course;
    private String grade;


    public Result() {
    }

    @XmlAttribute(name="course")
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @XmlAttribute(name="grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Result{" +
                "course='" + course + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
