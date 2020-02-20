package day52.BookTask;

/*
PaperBook
	int weight
	-- add constructor to set all the fields
	implement abstract method
	instance method
		read()
		toString()
 */

public class PaperBook extends Book implements Readable {

    int weight;

    public PaperBook(String name, String author, int weight) {

        super(name, author);
        this.weight = weight;

    }

    @Override
    public void displayBookInfo() {
        System.out.println("Book's name is: " + name +
                            ", and the author is: " + author +
                            " this is a paper book, weight is " + weight + " pounds.");
    }

    public void read() {
        System.out.println("Reading!");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes from " + name);
    }

    @Override
    public void showContent() {
        System.out.println("Here is the Table of Contents of " + name);
    }
}