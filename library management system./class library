import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Methods for Book Management
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
        System.out.println("Book removed with ISBN: " + ISBN);
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Methods for Member Management
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member);
    }

    public void displayMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    // Book Issue and Return
    public void issueBook(String ISBN, int memberId) {
        Book book = findBookByISBN(ISBN);
        if (book != null && !book.isIssued()) {
            book.setIssued(true);
            System.out.println("Book issued: " + book);
        } else {
            System.out.println("Book is already issued or not found.");
        }
    }

    public void returnBook(String ISBN) {
        Book book = findBookByISBN(ISBN);
        if (book != null && book.isIssued()) {
            book.setIssued(false);
            System.out.println("Book returned: " + book);
        } else {
            System.out.println("Book not found or wasn't issued.");
        }
    }

    // Helper method
    private Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}
