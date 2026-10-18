import java.util.ArrayList;
import uulib.OutputFile;
import uulib.InputFile;
import java.io.File;

public class LibraryHandler {

    private ArrayList<BookRecord> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(new BookRecord(title));
    }

    public int findBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }

    public void borrowBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.get(index).incrementBorrow();
        }
    }

    public void showPopularityReport() {
        if (books.isEmpty()) return;

        ArrayList<BookRecord> sortedCopy = new ArrayList<>(books);

        // Selection Sort (Descending by borrowCount)
        for (int i = 0; i < sortedCopy.size() - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < sortedCopy.size(); j++) {
                if (sortedCopy.get(j).getBorrowCount() >
                        sortedCopy.get(maxIndex).getBorrowCount()) {
                    maxIndex = j;
                }
            }

            // swap
            BookRecord temp = sortedCopy.get(i);
            sortedCopy.set(i, sortedCopy.get(maxIndex));
            sortedCopy.set(maxIndex, temp);
        }

        // display results
        for (BookRecord book : sortedCopy) {
            System.out.println(book.getDetails());
        }
    }

    public void saveToFile(String filename) {
        OutputFile out = new OutputFile(filename);

        out.println(books.size());

        for (BookRecord book : books) {
            out.println(book.getTitle());
            out.println(book.getBorrowCount());
        }

        out.close();
    }

    public void loadFromFile(String filename) {
        File f = new File(filename);

        if (f.exists()) {
            InputFile in = new InputFile(filename);

            int count = in.readInt();

            books.clear();

            for (int i = 0; i < count; i ++) {
                String title = in.readString();
                int borrowCount = in.readInt();

                BookRecord book = new BookRecord(title);

                for (int j = 0; j < borrowCount; j++) {
                    book.incrementBorrow();
                }

                books.add(book);
            }

            in.close();
        }
    }
}
