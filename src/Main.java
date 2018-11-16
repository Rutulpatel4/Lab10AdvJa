import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    TreeSet<String> book = new TreeSet<>();
        book.add("Harry Poter");
        book.add("Game OF throne");
        book.add("Abc");
        book.add("Xyz");

    TreeSet<Book> booksEx = new TreeSet<>();
    Book  book1 = new Book("jeret write", 123);
    booksEx.add(book1);
        booksEx.add(new Book("rutul patel", 600));
        booksEx.add(new Book("winter snow", 1));

        System.out.println("TreeSet: "+ book);

        System.out.println("\n\nTreeSet of books:");
        for(Book book2:booksEx)
            System.out.println(book);

}
}
