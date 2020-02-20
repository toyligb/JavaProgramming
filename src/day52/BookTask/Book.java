package day52.BookTask;

/*
-- abstract
Book
	String name
	String author
-- add constructors to set the fields
-- abstract void method
	displayBookInfo()
--- concrete
*/

public abstract class Book implements KnowledgeBank {

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public abstract void displayBookInfo();
}
