package homeworktocheck.hw010pro.task002;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateTreeDOM {
    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException {
        DocumentBuilderFactory instance = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = instance.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        Element rootElementCity = document.createElement("city");
        document.appendChild(rootElementCity);

        Attr attribute = document.createAttribute("city_size");
        attribute.setValue("Kiev");
        rootElementCity.setAttributeNode(attribute);

        Element street = document.createElement("street");
        rootElementCity.appendChild(street);

        Element housing = document.createElement("housing");
        street.appendChild(housing);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult result = new StreamResult(new File("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\homeworktocheck\\hw010pro\\task002\\result.xml"));
        try {
            transformer.transform(domSource, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}