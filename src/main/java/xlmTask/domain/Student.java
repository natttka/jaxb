package xlmTask.domain;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="student")
public class Student {

    private String id;
    private String name;
    private String age;
    private Results results;

    @XmlElement(name="results")
    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    @XmlElement(name="age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @XmlAttribute(name="id")
    public String getId() {
        return id;
    }
    public Student() {
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double average(){
        double sum =0;
        for (Result result : results.getResultList()) {
           sum += Double.parseDouble(result.getGrade());
        }
        return sum/results.getResultList().size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
