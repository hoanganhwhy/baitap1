package book1;



import java.util.*;

public class ReferenceBook extends Book{
    private String publisher;

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public ReferenceBook() {
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("publisher: " + publisher);
    }
    public void enterDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter publisher: ");
        publisher = scanner.nextLine();
    }
    public void updateBookById(){
        Scanner scanner = new Scanner(System.in);
        super.updateBookById(publisher);
        System.out.print("Enter new publisher: ");
        publisher = scanner.nextLine();
        this.setPublisher(publisher);
    }
    
}
