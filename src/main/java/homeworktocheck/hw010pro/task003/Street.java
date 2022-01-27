package homeworktocheck.hw010pro.task003;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "street")
public class Street {

    String street;
    int housing;

    public Street() {

    }

    public Street(String street, int housing) {
        this.street = street;
        this.housing = housing;
    }

    @Override
    public String toString() {
        return "[" + street + ", " + housing + "]";
    }

    public String getStreet() {
        return street;
    }
    @XmlElement(name = "street")
    public void setStreet(String street) {
        this.street = street;
    }

    public int getHousing() {
        return housing;
    }
    @XmlElement(name = "housing")
    public void setHousing(int housing) {
        this.housing = housing;
    }
}