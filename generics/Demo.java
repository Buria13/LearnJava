package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Student());
        list.add(new Student());
        //list.add("some string");
        Person person = list.get(0);

    }
}
