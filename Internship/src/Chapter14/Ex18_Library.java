package Chapter14;

import java.util.ArrayList;

public class Ex18_Library extends Ex18_Book {
	private String name;
	private ArrayList<Ex18_Book> books;

	public Ex18_Library(String yourLibrary) {
		this.setName(yourLibrary);
		this.books = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null || name != "") {
			this.name = name;
		}
	}

	public void addBook(Ex18_Book newBook) {
		books.add(newBook);

	}

	public ArrayList<Ex18_Book> searchByAuthors(String authorName) {

		ArrayList<Ex18_Book> yourBooks = new ArrayList<>();

		for (int i = 0; i < books.size(); i++) {

			if (authorName.equalsIgnoreCase(books.get(i).getAuthor())) {
				yourBooks.add(books.get(i));
			}

		}

		return yourBooks;
	}

	public ArrayList<Ex18_Book> getBooks() {
		return books;
	}

	public void getInfo(Ex18_Book book) {
		System.out
				.printf("%nTitle: %s%nAuthor: %s%nPublishing house: %s%nPublished year: %d%nISBN: %d%n",
						book.getTitle(), book.getAuthor(),
						book.getPublishingHouse(), book.getPublishYear(),
						book.getISBN());
	}

	public void getAllInfo() {

		for (Ex18_Book currentBook : books) {
			System.out
					.printf("%nTitle: %s%nAuthor: %s%nPublishing house: %s%nPublished year: %d%nISBN: %d%n",
							currentBook.getTitle(), currentBook.getAuthor(),
							currentBook.getPublishingHouse(),
							currentBook.getPublishYear(), currentBook.getISBN());
		}

	}

	public void dellBook(Ex18_Book book) {
		for (int i = 0; i < books.size(); i++) {
			if (book.equals(books.get(i))) {
				books.remove(book);
			}
		}
	}

}
