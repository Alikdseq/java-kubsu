package task_3;

public class Book {
    private String title;
    private String author;
    private int year;
    private String genre;
    private int pages;
    private String publisher;
    private String sourceCode;

    // Конструктор
    public Book(String title, String author, int year, String genre, int pages, String publisher, String sourceCode) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.pages = pages;
        this.publisher = publisher;
        this.sourceCode = sourceCode;
    }

    // Геттеры и сеттеры
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public String getSourceCode() { return sourceCode; }
    public void setSourceCode(String sourceCode) { this.sourceCode = sourceCode; }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Year=" + year +
                ", Genre='" + genre + '\'' +
                ", Pages=" + pages +
                ", Publisher='" + publisher + '\'' +
                ", SourceCode='" + sourceCode + '\'' +
                '}';
    }
}
