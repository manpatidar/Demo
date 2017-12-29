package collection;

import java.util.Arrays;

class DataList<E>
{
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object element[]; 
	
	public DataList()
	{
		element = new Object[DEFAULT_CAPACITY];
	}
	public void add(E e)
	{
		if(size == element.length)
		{
			ensureCapacity();
		}
		element[size++] = e;
	}

	private void ensureCapacity() {
		int newsize = element.length*2;
		element = Arrays.copyOf(element, newsize);
		
	}
	public E remove(int i) {
     if(i >= size || i< 0)	
     {
    	 throw new IndexOutOfBoundsException("Index: " + i);
     }
     Object item = element[i];
     int num = element.length - (i+1);
     System.arraycopy(element, i+1, element, i, num);
     size--;
     return (E) item;
	}
	public int size() {
        return size;
    }
	 public String toString()
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) {
	             sb.append(element[i].toString());
	             if(i<size-1){
	                 sb.append(",");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }

}
public class ListImplementation {

	public static void main(String[] args) {

		
		DataList<Integer> list = new DataList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		list.remove(2);
		 System.out.println(list);
		
	}

}
