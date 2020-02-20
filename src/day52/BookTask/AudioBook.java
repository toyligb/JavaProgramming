package day52.BookTask;

/*
AudioBook
	double duration
	implement abstract method
	instance method
		listen()
		toString()
 */

public class AudioBook extends Book {

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Book's name is: " + name +
                ", and the author is: " + author +
                " this is a audio book, duration is " + duration + " hours.");
    }

    public void play() {
        System.out.println("Playing " + name + " from " + author);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
    }
    @Override
    public void showContent() {
        System.out.println("Look at PaperBook!");
    }

}
