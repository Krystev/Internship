package Chapter14;

import java.util.Calendar;

public class Ex18_Book {
	private String title;
	private String author;
	private String publishingHouse;
	private int publishYear;
	private int isbn;

	public Ex18_Book(String newTitle, String newAuth, String house, int year,
			int newISBN) {
		this.setTitle(newTitle);
		this.setAuthor(newAuth);
		this.setPublishingHouse(house);
		this.setPublishYear(year);
		this.setISBN(newISBN);

	}

	public Ex18_Book() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String newTitle) {
		if (newTitle != null || newTitle != "") {
			this.title = newTitle;
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if (author != null || author != "") {
			this.author = author;
		}
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		if (publishingHouse != null || publishingHouse != "") {
			this.publishingHouse = publishingHouse;
		}

	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);

		if (publishYear < currentYear) {
			this.publishYear = publishYear;
		}
	}

	public int getISBN() {
		return isbn;
	}

	public void setISBN(int newISBN) {
		if (newISBN > 0) {
			this.isbn = newISBN;
		}
	}

}
