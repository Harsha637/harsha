package Week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionsort {

	public static void main(String[] args) {
		List<Book> books=new ArrayList<Book>();

		Book b1=new Book(5, " Test ","any thing");
		Book b2=new Book(23, " My Book","never know");
		Book b3=new Book(3, "The Book","dont know");
		Book b4=new Book(9, "Java","James");

		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);

		// Comparable -- compareTo  --logic for sorting

		Collections.sort(books);

		for(Book book:books)
		{
		System.out.println(book);

		}

	}

}
