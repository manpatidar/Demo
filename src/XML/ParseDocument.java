package XML;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ParseDocument {
	public static void main(String... arg) throws Exception {
		try {

			File inputFile = new File("C:\\MyJava\\Students.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("Student");
			System.out.println("----------------------------");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println(" Student id : " + eElement.getAttribute("id"));
					System.out.println(" Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
					System.out.println(" Email : " + eElement.getElementsByTagName("email").item(0).getTextContent());
					System.out.println(" Mobile : " + eElement.getElementsByTagName("mobile").item(0).getTextContent());
					System.out.println(" Address : " + eElement.getElementsByTagName("address").item(0).getTextContent());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
