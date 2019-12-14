package ext;

public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[3];

        books[0] = new ExtBook("1", "1", 1984, "1");
        books[0] = new ExtBook("2", "2", 1984, "2");
        books[0] = new ExtBook("3", "3", 1984, "3");

        for (int i = 0; i < books.length; i++) {
            if(books[i].getAuthor() == "1"){
                System.out.println(books[i].getTitle());
            }

            //books[0].title = "nothing";
        }

    }


}
