package xlmTask.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="results")
public class Results {
    List<Result> resultList = new ArrayList<>();

    public Results() {
    }

    public void add(Result result) {
        this.resultList.add(result);
    }


    @XmlElements(@XmlElement(name="result"))
//    @XmlElement(name = "result")
    public List<Result> getResultList() {
        return resultList;
    }

    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
    }
}
