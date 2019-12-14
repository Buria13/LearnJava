package bookpack;

public class BookDemo {

    public static void main(String[] args) {
        Book books[] = new Book[5];

        books[0] = new Book("Java", "shildt", 2014);
        books[1] = new Book("Quo Vadis", "Sinkevich", 1895);
        books[2] = new Book("3", "3", 2003);
        books[3] = new Book("4", "4", 2044);
        books[4] = new Book("5", "5", 2555);

        for (Book i: books) {
            i.show();
        }

    }





}
