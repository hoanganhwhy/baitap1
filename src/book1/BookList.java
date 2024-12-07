
package book1;
import java.util.*;

public class BookList {
    private ArrayList<Book> bookList = new ArrayList<>();
    public void addBook(Book book){
        bookList.add(book);
    }
    
    public boolean updateBookById(String id){
        for(Book book : bookList){
            if(book.getId().equals(id)){
                book.updateBookById(id);
                return true;
            }
        }
        return false;
    }
    
    public boolean deleteBookById(String id){
        for(Book book : bookList){
            if(book.getId().equals(id)){
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }
    
    public Book findBookById(String id){
        for(Book book : bookList){
            if(book.getId().equals(id)){
                return book;
            }
            
        }
        return null;
    }
    public void displayAllBook(){
        for(Book book: bookList){
            book.displayDetails();
        }
    }
    
    public Book findMostExpensiveBook(){
        double max = 0;
        for(Book book : bookList){
            if(book.calculatePrice() > max){
                max = book.calculatePrice();
            }
        }
        for(Book book : bookList){
            if(book.calculatePrice() == max){
                return book;
            }
        }
        return null;
    }
    
    public void countBooks(){
        int countTextBook = 0;
        int countReferenceBook = 0;
        for(Book book : bookList){
            if(book instanceof TextBook){
                countTextBook++;
            }
            if(book instanceof ReferenceBook){
                countReferenceBook++;
            }
        }
        System.out.println("Count Text book: " + countTextBook);
        System.out.println("Count Reference Book" + countReferenceBook);
    }
}
