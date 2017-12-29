package FileIO;

import java.util.*;
import java.io.*;


class Dog1 implements Serializable
{
 //private static final long serialVersionUID = 1L;
Cat c = new Cat();
}
class Cat implements Serializable
{
 	// private static final long serialVersionUID = 1L;
Rat r = new Rat();	
}
class Rat implements Serializable
{
 	// private static final long serialVersionUID = 1L;
int i = 100;	
}

public class SerializeDemo1 {

	public static void main(String[] args) throws IOException, Exception
	{
		Dog1 d1 = new Dog1(); 
		FileOutputStream fos1 = new FileOutputStream("abc.ser");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(d1);
		
		FileInputStream fis1 = new FileInputStream("abc.ser");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		Dog1 d2 = (Dog1)ois1.readObject();
		
		System.out.println(d2.c.r.i);
		
		
	}
}
