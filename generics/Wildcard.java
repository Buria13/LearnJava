package generics;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Wildcard {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person());
        list.add(new Student());
        action(list);
        actionSuper(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student());
        action(students);
        students.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));




    }

    // Метод action может принять в качестве аргумента как лист Person,
    // так и любой параметризованный список из его подклассов
    static void action(List<? extends Person> list){
        list.remove(0);             // удаление элемента возможно
        // list.add(new Person());   // добавление элемента ЗАПРЕЩЕНО
        Stream<? extends Person> stream = list.stream();
    }

    static void actionSuper(List<? super Student> list) {
        list.add(new Student());
        // list.add(new Person());
        list.remove(0);

    }
}
