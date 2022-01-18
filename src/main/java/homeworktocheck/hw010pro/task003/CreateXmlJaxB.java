package homeworktocheck.hw010pro.task003;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class CreateXmlJaxB {
    public static void main(String[] args) {

        City city = new City();
        city.addStreet(new Street("ул.Григория Сковороды", 1));
        city.addStreet(new Street("пр.Мира", 19));

        try {
            File fileXml = new File("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\main\\java\\homeworktocheck\\hw010pro\\task003\\result.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(City.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(city, fileXml);
        } catch (JAXBException exception){
            exception.printStackTrace();
        }
    }
}