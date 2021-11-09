public class Book{
    private String title;
    private int numberOfPages;
    private String author;
    private int publicationDate;

    public Book(String title, int numberOfPages, String author, int publicationDate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }
}
