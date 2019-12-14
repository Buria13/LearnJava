package ext;

import bookpack.Book;


public class UseBook {
    public static void main(String args[]) {
        Book books[] = new Book[2];
        // bookpack.Book books[] = new bookpack.Book[2];

        books[0] = new Book("1", "1", 1984);
        books[0] = new Book("2", "2", 1984);
        books[0] = new bookpack.Book("3", "3", 1984);

        books[0].show();


    }
}
