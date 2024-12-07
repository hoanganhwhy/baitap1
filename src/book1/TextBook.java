package book1;


import book1.Book;
import java.util.*;

public class TextBook extends Book{
    private String subject;

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public TextBook() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public double calculatePrice(){
        return this.getBasePrice() * 1.1;
    }    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("subject: " + subject);
    }
    public void enterDetails(){
        Scanner scanner = new Scanner(System.in);
        super.enterDetails();
        System.out.print("Enter subject: ");
        subject = scanner.nextLine();
    }
    public void updateBookById(){
        Scanner scanner = new Scanner(System.in);
        super.updateBookById(subject);
        System.out.print("Enter new subject: ");
        subject = scanner.nextLine();
        this.setSubject(subject);
    }
}
