package homeworktocheck.hw010pro.taskadditional;

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

public class CreateXML {
    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException {
        DocumentBuilderFactory instance = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = instance.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        Element rootElementAnimal = document.createElement("animal");
        document.appendChild(rootElementAnimal);

        Element elementCatOne = document.createElement("cat");
        rootElementAnimal.appendChild(elementCatOne);
        Element catNameOne = document.createElement("name");
        catNameOne.appendChild(document.createTextNode("Marsel"));
        elementCatOne.appendChild(catNameOne);
        Element catAgeOne = document.createElement("age");
        catAgeOne.appendChild(document.createTextNode("7"));
        elementCatOne.appendChild(catAgeOne);
        Element catBreedOne = document.createElement("breed");
        catBreedOne.appendChild(document.createTextNode("Sphynx"));
        elementCatOne.appendChild(catBreedOne);
        Element catWeightOne = document.createElement("weight");
        catWeightOne.appendChild(document.createTextNode("6"));
        elementCatOne.appendChild(catWeightOne);

        Element elementCatTwo = document.createElement("cat");
        rootElementAnimal.appendChild(elementCatTwo);
        Element catNameTwo = document.createElement("name");
        catNameTwo.appendChild(document.createTextNode("Myrzik"));
        elementCatTwo.appendChild(catNameTwo);
        Element catAgeTwo = document.createElement("age");
        catAgeTwo.appendChild(document.createTextNode("5"));
        elementCatTwo.appendChild(catAgeTwo);
        Element catBreedTwo = document.createElement("breed");
        catBreedTwo.appendChild(document.createTextNode("Oriental"));
        elementCatTwo.appendChild(catBreedTwo);
        Element catWeightTwo = document.createElement("weight");
        catWeightTwo.appendChild(document.createTextNode("4"));
        elementCatTwo.appendChild(catWeightTwo);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult result = new StreamResult(new File("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\homeworktocheck\\hw010pro\\taskadditional\\result.xml"));
        try {
            transformer.transform(domSource, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}