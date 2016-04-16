package in.javahome.ioc;

public class Book {
	private Author author;

	public Book(Author author) {
		this.author = author;
	}

	void info() {
		System.out.println("Book Name-> SCJP");
		System.out.println("Book Cost-> 750");
		System.out.println("Edition-> Latest edition");
		author.info();
	}
}
