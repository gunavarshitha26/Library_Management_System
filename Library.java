import java.util.*;

public class Library {
    private Map<Integer, Book> books = new HashMap<>();
    private Map<Integer, Member> members = new HashMap<>();
    private Map<Integer, Integer> borrowedBooks = new HashMap<>(); // Book ID -> Member ID

    public synchronized void addBook(Book book) {
        books.put(book.getBookId(), book);
        System.out.println("Book added: " + book);
    }

    public synchronized void removeBook(int bookId) {
        if (books.containsKey(bookId)) {
            books.remove(bookId);
            System.out.println("Book removed: ID " + bookId);
        } else {
            System.out.println("Book not found.");
        }
    }

    public synchronized void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public synchronized void addMember(Member member) {
        members.put(member.getMemberId(), member);
        System.out.println("Member added: " + member);
    }

    public synchronized void removeMember(int memberId) {
        if (members.containsKey(memberId)) {
            members.remove(memberId);
            System.out.println("Member removed: ID " + memberId);
        } else {
            System.out.println("Member not found.");
        }
    }

    public synchronized void showMembers() {
        System.out.println("\nRegistered Members:");
        for (Member member : members.values()) {
            System.out.println(member);
        }
    }

    public synchronized void issueBook(int bookId, int memberId) {
        if (!books.containsKey(bookId)) {
            System.out.println("Invalid Book ID.");
            return;
        }
        if (!members.containsKey(memberId)) {
            System.out.println("Invalid Member ID.");
            return;
        }
        if (!books.get(bookId).isAvailable()) {
            System.out.println("Book is already issued.");
            return;
        }

        books.get(bookId).setAvailable(false);
        borrowedBooks.put(bookId, memberId);
        System.out.println("Book " + bookId + " issued to Member " + memberId);
    }

    public synchronized void returnBook(int bookId) {
        if (borrowedBooks.containsKey(bookId)) {
            books.get(bookId).setAvailable(true);
            borrowedBooks.remove(bookId);
            System.out.println("Book " + bookId + " returned.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    public synchronized void showBorrowedBooks() {
        System.out.println("\nBorrowed Books:");
        for (Map.Entry<Integer, Integer> entry : borrowedBooks.entrySet()) {
            System.out.println("Book ID: " + entry.getKey() + " borrowed by Member ID: " + entry.getValue());
        }
    }
}
