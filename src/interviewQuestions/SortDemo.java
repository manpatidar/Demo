package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Books implements Comparable<Books>{

	String bookName;
	String writeName;
	int publicationYear;

	public Books(String bookName, String writeName, int publicationYear) {
		this.bookName = bookName;
		this.writeName = writeName;
		this.publicationYear = publicationYear;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriteName() {
		return writeName;
	}

	public void setWriteName(String writeName) {
		this.writeName = writeName;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public String toString()
	{
		return bookName + " " + writeName + " " +	publicationYear + "\n";
	}
	@Override
	public int compareTo(Books o) {
		
		System.out.println(" bookName " + bookName);
		System.out.println("o.getBookName() " + o.getBookName() + "\n");
		return bookName.compareTo(o.getBookName());

	}
	
}

public class SortDemo {

	public static void main(String[] args) {

		Books[] book = new Books[4]; 
		
		Books b1 = new Books("X", "Yashwant", 2005);
		Books b2 = new Books("C++", "Bala", 1999);
		Books b3 = new Books("OOAD", "Kalaliya", 1988);
		Books b4 = new Books("Java", "Java", 1970);

		List<Books> bookList = new ArrayList();

		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);

		Collections.sort(bookList);

		Iterator itr = bookList.iterator();
	
		while (itr.hasNext()) {
			Books b = (Books) itr.next();
			System.out.println(b.getBookName() + " " + b.getWriteName() + " " + b.getPublicationYear() + "\n");
		}
		
		
		/*book[0]=b1;
		book[1]=b2;
		book[2]=b3;
		book[3]=b4;
		
		Collections.sort
		
		for(Books b: book){
			   System.out.println(b.getBookName() + " " + b.getWriteName() + " " + b.getPublicationYear());
			}
		*/
		
		

	}

}
