package book1;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\t---MENU---");
            System.out.println("1.add book");
            System.out.println("2.update book");
            System.out.println("3.delete book");
            System.out.println("4.find book by id");
            System.out.println("5.display all book");
            System.out.println("6.find most expensive book");
            System.out.println("7.count book");
            System.out.println("8.exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter your text book / reference book ? (t/r): ");
                    char choicetr = scanner.next().charAt(0);
                    if (choicetr == 't' || choicetr == 'T') {
                        TextBook textBook = new TextBook();
                        textBook.enterDetails();
                        bookList.addBook(textBook);
                        break;
                    } else if (choicetr == 'r' || choicetr == 'R') {
                        ReferenceBook referenceBook = new ReferenceBook();
                        referenceBook.enterDetails();
                        bookList.addBook(referenceBook);
                        break;
                    } else {
                        System.out.println("Error choice");
                        break;
                    }
                case 2:
                    System.out.print("enter id to update: ");
                    String idToUpdate = scanner.nextLine();
                    bookList.updateBookById(idToUpdate);
                    if(bookList.updateBookById(idToUpdate) == true){
                        System.out.println("Update done");
                    }else{
                        System.out.println("Update error");
                    }
                    break;
                case 3:
                    System.out.print("Enter id to delete: ");
                    String idToDelete = scanner.nextLine();
                    bookList.deleteBookById(idToDelete);
                    if(bookList.deleteBookById(idToDelete) == true){
                        System.out.println("delete done");
                    }else{
                        System.out.println("delete error");
                    }
                    break;
                case 4:
                    System.out.print("enter book for find: ");
                    String idToFind = scanner.nextLine();
                    Book bookToFind = bookList.findBookById(idToFind);
                    if(bookToFind != null){
                        bookToFind.displayDetails();
                    }else{
                        System.out.println("dont id to find");
                    }
                    break;
                case 5:
                    bookList.displayAllBook();
                    break;
                case 6:
                    Book bookMostExpensive = bookList.findMostExpensiveBook();
                    bookMostExpensive.displayDetails();
                    break;
                case 7:
                    bookList.countBooks();
                    break;
                case 9:
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.println("error choice, please enter again");

            }
        }
    }

}
