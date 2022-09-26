package Book;

public class Book {

    private static String author;
    private static String title;


    static String of(String author, String title) {
        Book.author = author;
        Book.title = title;
        return author + title;
    }

    public static void main(String[] args) {
        String name = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(name);
    }
}
