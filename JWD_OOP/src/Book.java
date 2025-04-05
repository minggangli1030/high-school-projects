
public class Book {

	String name;
	String publisher;
	String authur;
	int price;

	void sell() {
	}

	void returnBook() {
	}

	void discount() {
	}

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = book1;

		book1.price = 999;
		book1.name = "Java Programming Book";

		System.out.print(book2.price);
	}
}
