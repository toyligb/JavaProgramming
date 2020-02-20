package day52.BookTask;

/*
Create List<Book> add all your books
	displayInfo on all of them
	find out how many PaperBook is there
 */

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    public static void main(String[] args) {

        // We can refer the paper book object using
        // it's own type: PaperBook;
        // or it's super type: Book, Readable, Knowledge, Object

        Book b1 = new PaperBook("Java", "Akbar", 3);
        b1.displayBookInfo();

        KnowledgeBank kb = b1;
        kb.takeNote();
        kb.showContent();

        System.out.println("=====================");

        Book b2 = new AudioBook("Head First Java", "Someone", 13.5);
        b2.displayBookInfo();
        b2.showContent();
        System.out.println("b2 = " + b2);

        System.out.println("=====================");

        List<Book> lib = new ArrayList<>();
        lib.add(new PaperBook("Pride and Prejudice","Jane Austen",2));
        lib.add(new PaperBook("1984","George Orwell",1));
        lib.add(new PaperBook("War and Peace","Tolstoy",7));
        lib.add(new AudioBook("Java","Walter Savich",10));
        lib.add(new AudioBook("Cemile","Aytmatov",20));

        int countPaperBook = 0;
        for (Book each : lib) {
            each.displayBookInfo();
            if (each.getClass().getSimpleName().equals("PaperBook")) {
                countPaperBook++;
            }
        }

        System.out.println("count of PaperBooks = " + countPaperBook);

    }

}
