import java.util.Comparator;

public class OrderByNumberOfPagesComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getNumberOfPages() - b2.getNumberOfPages();
    }
}