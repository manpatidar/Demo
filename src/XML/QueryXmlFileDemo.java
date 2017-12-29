package XML;

import java.io.*;

import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class QueryXmlFileDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		try{
		File inputFile = new File("C:\\MyJava\\cars.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder document = factory.newDocumentBuilder();
		Document doc = document.parse(inputFile);
		
		doc.getDocumentElement().normalize();
		System.out.println("Root Element " + doc.getDocumentElement().getNodeName());
		
		NodeList nList = doc.getElementsByTagName("supercars");
		
		for(int i =0 ; i< nList.getLength(); i++)
		{
			
			Node node = nList.item(i);
			System.out.println("Current Element " + node.getNodeName());
			
			if(node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element eElement = (Element) node;
				
				System.out.println("Company " + eElement.getAttribute("company"));
				NodeList carNameList = 
		                  eElement.getElementsByTagName("carname");
		               for (int count = 0; 
		                  count < carNameList.getLength(); count++) {	 
		                  Node node1 = carNameList.item(count);
		                  if (node1.getNodeType() ==
		                     node1.ELEMENT_NODE) {
		                     Element car = (Element) node1;
		                     System.out.print("car name : ");
		                     System.out.println(car.getTextContent());
		                     System.out.print("car type : ");
		                     System.out.println(car.getAttribute("type"));
		                  }
		               }
			}
		}
		
	}
		catch (Exception e) {
	         e.printStackTrace();
	      }
	}

}
