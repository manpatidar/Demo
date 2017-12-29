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

public class JDBCUtil {

	public static void main(String[] args) {

		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","hr","hr");
			Statement stm1 = (Statement) con.createStatement();
			String query = "select * from students"; 
			System.out.println(query);		
			ResultSet rs1 = stm1.executeQuery(query);
			Document xmlDoc = JDBCUtil.toDocument(rs1);
			
			Transformer t = TransformerFactory.newInstance().newTransformer();
			
			
			t.transform(new DOMSource((Node) xmlDoc), new StreamResult(new FileOutputStream("C:/MyJava/students.xml")));
			
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

			   Element results = (Element) ((org.w3c.dom.Document) doc).createElement("Class");
			   ((Node) doc).appendChild((Node) results);

			   ResultSetMetaData rsmd = rs.getMetaData();
			   int colCount           = rsmd.getColumnCount();

			   while (rs.next())
			   {
			      Element row = (Element) ((org.w3c.dom.Document) doc).createElement("Student");
			      ((Node) results).appendChild((Node) row);

			      for (int i = 1; i <= colCount; i++)
			      {
			         String columnName = rsmd.getColumnName(i);
			         Object value      = rs.getObject(i);

			         Element node      = (Element) ((org.w3c.dom.Document) doc).createElement(columnName);
			         ((Node) node).appendChild(((org.w3c.dom.Document) doc).createTextNode(value.toString()));
			         ((Node) row).appendChild((Node) node);
			      }
			   }
			   return doc;
			}

}
