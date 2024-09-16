
public class Book implements Comparable<Book>{
	
	private final String title;
	private final int page;
	private final String author;
	private final String publishDate;
	
	public Book(String name, int page, String author, String publishDate) {
		this.title = name;
		this.page = page;
		this.author = author;
		this.publishDate = publishDate;
	}

	@Override
	public int compareTo(Book b) {
		return this.title.compareTo(b.getName());
	}

	public String getName() {
		return title;
	}

	public int getPage() {
		return page;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublishDate() {
		return publishDate;
	}
	
	@Override
    public String toString() {
        return
                "Title: " + title +
                ", Author: " + author  +
                ", Number of Pages: " + page +
                ", Publication Date: " + getPublishDate();
    }
}
