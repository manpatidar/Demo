package DataBase;
import java.sql.*;
import java.io.*;
import java.util.*;


public class ConnectDatabaseDemo {

	public static void main(String []args)
	{
		try{
			int id;
			String name,city,sqlstmt;
			Scanner in = new Scanner(System.in);
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","hr","hr");
			sqlstmt = "insert into employee values(?,?,?)";
			PreparedStatement prs = conn.prepareStatement(sqlstmt);
			for (int i =0;i<2;i++)
			{
				System.out.println("Enter id");
			    id = in.nextInt();
			    System.out.println("Enter name");
			    name = in.next();
			    System.out.println("Enter City");
			    city = in.next();
			    prs.setInt(1, id);
			    prs.setString(2,name);
			    prs.setString(3,city);
			    prs.executeUpdate();
			    
			}
			System.out.println("Inserted");
			conn.close();
			Connection conn1 = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","hr","hr");
			Statement stmt1 = conn1.createStatement();
			ResultSet rs = stmt1.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3));
				
			}
			conn1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
