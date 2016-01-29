package domain;

import java.util.ArrayList;

public class Shelf {
	private ArrayList<Book> books;
	private int bookId;
	private String name = "";

	public Shelf(ArrayList<Book> books, int bookId) {
		super();
		this.books = books;
		this.bookId = bookId;
	}

	public Shelf(int shelfId) {
		super();
		this.books = new ArrayList<Book>();
		this.bookId = shelfId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public boolean removeBook(Chapter sentence) {
		return books.remove(sentence);
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public int getBookId() {
		return bookId;
	}
}
