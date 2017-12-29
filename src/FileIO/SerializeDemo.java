package FileIO;

import java.io.*;

class Dog implements Serializable
{
  static final  int i =10;
  transient static  int j =20;
}
public class SerializeDemo {
	public static void main(String[] args) throws IOException, Exception
	{
		Dog d1 = new Dog(); 
		FileOutputStream fos = new FileOutputStream("file.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis = new FileInputStream("file.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		
		System.out.println(d2.i+ "<-->" +d2.j);
		
		
	}

}
