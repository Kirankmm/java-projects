import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Display All Books");
            System.out.println("5. Add Member");
            System.out.println("6. Display All Members");
            System.out.println("7. Issue Book");
            System.out.println("8. Return Book");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    library.addBook(new Book(title, author, ISBN));
                    break;

                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeISBN = scanner.nextLine();
                    library.removeBook(removeISBN);
                    break;

                case 3:
                    System.out.print("Enter title of the book: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchBookByTitle(searchTitle);
                    System.out.println(foundBook != null ? foundBook : "Book not found.");
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    library.addMember(new Member(name, memberId));
                    break;

                case 6:
                    library.displayMembers();
                    break;

                case 7:
                    System.out.print("Enter ISBN of the book to issue: ");
                    String issueISBN = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    int issueMemberId = scanner.nextInt();
                    library.issueBook(issueISBN, issueMemberId);
                    break;

                case 8:
                    System.out.print("Enter ISBN of the book to return: ");
                    String returnISBN = scanner.nextLine();
                    library.returnBook(returnISBN);
                    break;

                case 9:
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
