import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		Book b1 = new Book("Mist", 233 ,"Miguel de Unamuno", "1914");
		Book b2 = new Book("Brave New World", 311, "Aldous Huxley", "1932");
		Book b3 = new Book("Crime and Punishment", 527, "Fyodor Dostoevsky", "1866");
		Book b4 = new Book("The Lily of the Valley", 328, "Honore de Balzac", "1835");
		Book b5 = new Book("A Tale of Two Cities", 494, "	Charles Dickens", "1859");
		
		TreeSet<Book> books = new TreeSet<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		
		System.out.println("----- Ordered By the Title -----");
		Iterator<Book> itr = books.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		System.out.println();
		System.out.println("----- Ordered By the Number of Pages -----");
		TreeSet<Book> booksByPage = new TreeSet<Book>(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPage() - o2.getPage();
			}
		});
		booksByPage.addAll(books);
		for(Book b : booksByPage) {
			System.out.println(b.toString());
		}
	}
}