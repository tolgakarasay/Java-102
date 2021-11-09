import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> ts1 = new TreeSet<Book>(new OrderByNameComparator());
        ts1.add(new Book("Half of a Yellow Sun", 448, "Chimamanda Ngozi Adichie", 2006));
        ts1.add(new Book("Gilead", 256, "Marilynne Robinson", 2004));
        ts1.add(new Book("A Visit from the Goon Squad", 288, "Jennifer Egan", 2010));
        ts1.add(new Book("Billy Lynn’s Long Halftime Walk", 336, "Ben Fountain", 2012));
        ts1.add(new Book("Atonement", 371, "Ian McEwan", 2001));

        System.out.println("========== ORDERED BY TITLE ============");
        //Sorting books ordered by title.
        for (Book book : ts1) {
            System.out.print(book.getTitle() + " (pages: " + book.getNumberOfPages() + ")");
            System.out.println();
        }

        TreeSet<Book> ts2 = new TreeSet<Book>(new OrderByNumberOfPagesComparator());
        ts2.addAll(ts1);

        System.out.println();
        System.out.println("====== ORDERED BY NUMBER OF PAGES ======");
        //Sorting books ordered by number of page.
        for (Book book : ts2) {
            System.out.print(book.getTitle() + " (pages: " + book.getNumberOfPages() + ")");
            System.out.println();
        }
    }
}
