package comparator;

import java.util.Iterator;
import java.util.List;

public class IteratorPerson {
    public void decreaseId(int amount, List<Person> persons, int percent) {
        Iterator<Person> iterator = persons.iterator();

        while(iterator.hasNext()) {
            Person person = iterator.next();
            if(amount < person.getPersonId()) {
                iterator.remove();
            } else {
                person.setPersonId(person.getPersonId() - percent);
            }
        }
    }
}
