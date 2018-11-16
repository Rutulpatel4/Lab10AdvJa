public class Book implements Comparable<Book>{
    private String title,author;
    private int price;

    public Book(String author, int price) {
        this.title= title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book book) {
        if (this.getPrice() == price)
            return 0;

        if (this.getPrice() > book.getPrice())
            return 1;
        else
            return -1;

    }
}
