package day52.BookTask;

/*
create an interface KnowledgeBank
	abstract method takeNote();
	default method showTableOfContent(){
	}
 */

public interface KnowledgeBank {

    public abstract void takeNote();
    public default void showContent() {
        System.out.println("All Chapters");
    }

}
