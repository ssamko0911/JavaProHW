package homeworktocheck.hw010pro.task003;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "city")
public class City {
    private String city;

    public City(){

    }

    public City(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement(name = "street")
    private List<Street> streets = new ArrayList<>();

    public void addStreet(Street someStreet) {
        streets.add(someStreet);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(streets.toArray());
    }
}