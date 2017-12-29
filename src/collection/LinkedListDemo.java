package collection;

import java.awt.List;
import java.util.LinkedList;

public class LinkedListDemo
{
public static void main(String[] args)
{
 LinkedList l = new LinkedList();
 l.add("Manohar");
 l.add("Gaurav");
 l.add("100");
 l.add("200");
 System.out.println(l);
 l.set(0,"Patidar");
 System.out.println(l);
 l.set(0,"Upadhyay");
 System.out.println(l);	
 l.removeLast();
 l.set(2,"Patidar");
 System.out.println(l);
}
}
