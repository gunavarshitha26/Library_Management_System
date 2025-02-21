import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Sample Books
        library.addBook(new Book(101, "Java Programming", "James Gosling"));
        library.addBook(new Book(102, "Data Structures and Algorithms", "Mark Weiss"));
        library.addBook(new Book(103, "Operating Systems", "Andrew Tanenbaum"));
        library.addBook(new Book(104, "Database Management Systems", "Raghu Ramakrishnan"));
        library.addBook(new Book(105, "Artificial Intelligence", "Stuart Russell"));

        // Sample Members
        library.addMember(new Member(1, "Alice"));
        library.addMember(new Member(2, "Bob"));
        library.addMember(new Member(3, "Charlie"));
        library.addMember(new Member(4, "David"));

        int choice;
        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Show Available Books");
            System.out.println("4. Add Member");
            System.out.println("5. Remove Member");
            System.out.println("6. Show Members");
            System.out.println("7. Issue Book");
            System.out.println("8. Return Book");
            System.out.println("9. Show Borrowed Books");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    break;
                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeBookId = scanner.nextInt();
                    library.removeBook(removeBookId);
                    break;
                case 3:
                    library.showAvailableBooks();
                    break;
                case 4:
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    library.addMember(new Member(memberId, name));
                    break;
                case 5:
                    System.out.print("Enter Member ID to remove: ");
                    int removeMemberId = scanner.nextInt();
                    library.removeMember(removeMemberId);
                    break;
                case 6:
                    library.showMembers();
                    break;
                case 7:
                    System.out.print("Enter Book ID to issue: ");
                    int issueBookId = scanner.nextInt();
                    System.out.print("Enter Member ID: ");
                    int issueMemberId = scanner.nextInt();
                    library.issueBook(issueBookId, issueMemberId);
                    break;
                case 8:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = scanner.nextInt();
                    library.returnBook(returnBookId);
                    break;
                case 9:
                    library.showBorrowedBooks();
                    break;
                case 10:
                    System.out.println("Exiting Library System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 10);

        scanner.close();
    }
}
