public class BookRecord {
        private String title;
        private int borrowCount;

    public BookRecord(String title) {
    this.title = title;
    this.borrowCount = 0;
    }
    /**
     * Increases the popularity count of the book by 1.
     * This should be called every time a book is successfully borrowed.
     */
    public void incrementBorrow() {
        borrowCount++;
    }

    public String getTitle() {
        return title;
    }
    public int getBorrowCount() {return borrowCount;}
    /**
     * Returns a formatted string for status reporting.
     * Example: "Title: Java Programming | Borrows: 5"
     */
    public String getDetails() {
        return "Title: " + title + " | Borrows: " + borrowCount;
    }
}

