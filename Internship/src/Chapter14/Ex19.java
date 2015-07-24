package Chapter14;

import java.util.ArrayList;

public class Ex19 {

	public static void main(String[] args) {

		Ex18_Book book1 = new Ex18_Book("The Talisman", "Stephen King", "Viking", 1984,
				1234);
		Ex18_Book book2 = new Ex18_Book("A Game of Thrones", "George R. R. Martin",
				"Bantam Spectra", 1996, 1235);
		Ex18_Book book3 = new Ex18_Book("Dreamcatcher", "Stephen King", "Scribner", 2001,
				1236);
		Ex18_Book book4 = new Ex18_Book("The Dark Half", "Stephen King", "Viking", 1989,
				1237);
		Ex18_Book book5 = new Ex18_Book("The Fellowship of the Ring", "J. R. R. Tolkien",
				"George Allen & Unwin", 1954, 1238);

		Ex18_Library lib1 = new Ex18_Library("Tito");

		lib1.addBook(book1);
		lib1.addBook(book2);
		lib1.addBook(book3);
		lib1.addBook(book4);
		lib1.addBook(book5);

		ArrayList<Ex18_Book> books = lib1.getBooks();

		for (Ex18_Book book : books) {
			lib1.getInfo(book);
		}

		ArrayList<Ex18_Book> stivKingBooks = lib1.searchByAuthors("Stephen King");

		for (int i = 0; i < stivKingBooks.size(); i++) {
			lib1.dellBook(stivKingBooks.get(i));
		}

		for (Ex18_Book book : books) {
			lib1.getInfo(book);
		}
	}

}
