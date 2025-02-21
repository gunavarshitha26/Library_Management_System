public class LibraryThread extends Thread {
    private Library library;
    private int bookId;
    private int memberId;

    public LibraryThread(Library library, int bookId, int memberId) {
        this.library = library;
        this.bookId = bookId;
        this.memberId = memberId;
    }

    @Override
    public void run() {
        library.issueBook(bookId, memberId);
    }
}
