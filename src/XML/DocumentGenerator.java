package XML;

import java.io.FileOutputStream;
import java.sql.*;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DocumentGenerator{

	private static final String String = null;

	public static void main(String[] args) {

		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","hr","hr");
			Statement stm1 = (Statement) con.createStatement();
			String query = "select * from students"; 
			System.out.println(query);		
			ResultSet rs1 = stm1.executeQuery(query);
			Document xmlDoc = DocumentGenerator.toDocument(rs1);
			
			Transformer t = TransformerFactory.newInstance().newTransformer();
			
			
			t.transform(new DOMSource((Node) xmlDoc), new StreamResult(new FileOutputStream("C:/MyJava/students1.xml")));
			
			//System.out.println(JDBCUtil.serialize(xmlDoc));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		finally
		{
			
		}
	}
	
	private static char[] serialize(Document xmlDoc) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Document toDocument(ResultSet rs)
			   throws ParserConfigurationException, SQLException
			{
			   DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			   DocumentBuilder builder        = factory.newDocumentBuilder();
			   Document doc                   = (Document) builder.newDocument();
			   
			   Element rootelem = ((org.w3c.dom.Document) doc).createElement("class");
			   ((Node) doc).appendChild((Node) rootelem);
			   
				   while(rs.next())
					{
					 String name = rs.getString("name");
					 String email = rs.getString("email");
					 String mobile = (String).valueOf(rs.getLong("mobile"));
					 String city = rs.getString("city");
					 System.out.println(name + " " + email + " " + mobile + " " + city);
					 
					    Element studentelem = ((org.w3c.dom.Document) doc).createElement("Student");
					    
					    ((Node )rootelem).appendChild((Node)studentelem);
					    
						Element nameelem = ((org.w3c.dom.Document) doc).createElement("name");
						nameelem.appendChild(((org.w3c.dom.Document) doc).createTextNode(name));
						
						
						Element emailelem = ((org.w3c.dom.Document) doc).createElement("email");
						emailelem.appendChild(((org.w3c.dom.Document) doc).createTextNode(email));
						
						
						Element mobileelem = ((org.w3c.dom.Document) doc).createElement("mobile");
						mobileelem.appendChild(((org.w3c.dom.Document) doc).createTextNode(mobile));
						
						
						Element addresselem = ((org.w3c.dom.Document) doc).createElement("city");
						addresselem.appendChild(((org.w3c.dom.Document) doc).createTextNode(city));
						
						
						((Node )studentelem).appendChild(nameelem);
						((Node )studentelem).appendChild(emailelem);
						((Node )studentelem).appendChild(mobileelem);
						((Node )studentelem).appendChild(addresselem);
						
					}
			   
			  
			   return doc;
			}

}
