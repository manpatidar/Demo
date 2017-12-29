// Customized serializtion

package FileIO;
import java.io.*;

class Account implements Serializable
{
 String UserName = "Manohar";
 transient String pwd = "Patidar";
 
 private void writeObject(ObjectOutputStream os) throws Exception
 {
	os.defaultWriteObject();
	String epwd = "123" + pwd;
	os.writeObject(epwd);
	 
 }
 
 private void readObject(ObjectInputStream is) throws Exception
 {
	 is.defaultReadObject();
	 String epwd = (String)is.readObject();
	 pwd = epwd.substring(3);
	 
 }
 
}
public class CustSerializeDemo {

	public static void main(String[] args) throws Exception
	{
		Account a1 = new Account();
		System.out.println(a1.UserName + "<--->" + a1.pwd);
		FileOutputStream fos = new FileOutputStream("file.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("file.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account)ois.readObject();
		System.out.println(a2.UserName + "<--->" + a2.pwd);
		
		
	}
}
