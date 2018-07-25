package xlmTask.service;


import xlmTask.domain.Student;
import xlmTask.domain.Students;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmarshallerExample {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\b2b\\IdeaProjects\\xmlTaskNK\\src\\main\\resources\\students.xml");
        JAXBContext ctx = JAXBContext.newInstance(Students.class);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        Students students = (Students) unmarshaller.unmarshal(file);

        List<String> resultList = new ArrayList<>();
        for (Student student : students.getStudentsList()) {
            resultList.add(Double.toString(student.average()) + " " + student.getName());
        }
        Collections.sort(resultList);
        System.out.println(resultList.get(resultList.size()-1));
    }
}
