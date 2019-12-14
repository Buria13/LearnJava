package generics;

import comparator.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<comparator.Person> {
    @Override
    public int compare(comparator.Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
