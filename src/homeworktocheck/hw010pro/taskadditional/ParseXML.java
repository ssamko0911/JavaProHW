package homeworktocheck.hw010pro.taskadditional;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        File xml = new File("C:\\Users\\samko.s\\IdeaProjects\\JavaProHW\\src\\homeworktocheck\\hw010pro\\taskadditional\\result.xml");

        DocumentBuilderFactory instance = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = instance.newDocumentBuilder();
        Document document = documentBuilder.parse(xml);

        Element rootElement = document.getDocumentElement();
        NodeList list = rootElement.getChildNodes();
        int count = 0;
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.printf("Данные %d тега cat: \n", ++count);
                System.out.println("-".repeat(50));
                System.out.println("Имя кота: " + element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("Порода кота: " + element.getElementsByTagName("breed").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("-".repeat(50));
            }
        }
    }
}