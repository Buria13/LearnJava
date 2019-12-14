package ext;
import bookpack.*;

public class ExtBook extends Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher(){ return publisher; }
    public void setPublisher(String p) { publisher = p; }

    // Следующие операторы допустимы, так как ПОДКЛАССЫ ИМЕЮТ ДОСТУП
    // к членам классов, объявленными защищенными.
    public String getTitle() { return title; }
    public void setTitle(String s) { title = s; }
    public String getAuthor() { return author; }
    public void setAuthor(String a) { author = a; }



}