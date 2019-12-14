package comparator;

import java.util.ArrayList;
import java.util.Comparator;


public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(999, "Bob"));
        list.add(new Person(666, "Zed"));
        list.add(new Person(111, "Robin"));
        list.add(new Person(333, "Ann"));
        list.add(new Person(777, "Ann"));

        System.out.println(list);

//        list.sort(new PersonNameComparator());
//        System.out.println(list);

//        IteratorPerson decrease = new IteratorPerson();
//        decrease.decreaseId(500, list, 100);

//        list.removeIf(o -> o.getPersonId() < 500);
//        list.forEach(o -> o.setPersonId(o.getPersonId() + 100));

//        list.sort((o1, o2) -> o1.getPersonId() - o2.getPersonId());

        // list.sort(Comparator.comparing(Person::getName).thenComparing(Person::getPersonId));

        System.out.println("\n" + list);
    }
}
