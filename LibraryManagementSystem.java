

class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println("Your Book" + book + "has been successfully added");
    }

    void showAvailableBooks() {
        System.out.println("Available books are..");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("*" + book);
        }
    }

    void issueBook(String book) {

        for (int i = 0; i < this.books.length; i++) {

            if (this.books[i].equals(book)) {
                System.out.println("'"+book+"'"+" has been issue!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book doesnt exist");
    }
    void  returnBooks(String book){
        addBook(book);
    }

}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Rich dad,Poor dad");
        centralLibrary.addBook("Alexander");
        centralLibrary.addBook("Algorithm");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Holmes");
        centralLibrary.showAvailableBooks();


        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBooks("C++");
        centralLibrary.showAvailableBooks();
    }
}
