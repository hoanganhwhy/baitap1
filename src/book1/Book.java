
package book1;
import java.util.*;

public abstract class Book implements IBook{
    private String id;
    private String title;
    private double basePrice;

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitile(String title) {
        this.title = title;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    
    @Override
    public double calculatePrice(){
        return 0;
    }
    public void displayDetails(){
        System.out.println("id: " + id);
        System.out.println("title: " + title);
        System.out.println("base price: " + basePrice);
    }
    public void enterDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = scanner.nextLine();
        System.out.print("Enter title: ");
        title = scanner.nextLine();
        System.out.print("Enter base price");
        basePrice = scanner.nextDouble();
    }
    
    public void updateBookById(String id){
        System.out.println("Update book by " + id);
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter new title: ");
        title = scanner.nextLine();
        this.setTitile(title);
        System.out.print("Enter new base price");
        basePrice = scanner.nextDouble();
        this.setBasePrice(basePrice);
    }
}
