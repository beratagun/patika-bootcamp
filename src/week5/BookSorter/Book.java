package week5.BookSorter;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private int pageNumber;
    private int releaseDate;

    public Book(String name, String author, int pageNumber, int releaseDate) {

        this.name = name;
        this.author = author;
        this.pageNumber = pageNumber;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String toString() {
        return "Name : " + name +
                "\nAuthor : " + author +
                "\nRelease Date : " + releaseDate +
                "\nPage : " + pageNumber +
                "\n************************************";
    }

}