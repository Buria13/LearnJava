package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("T-Shirt", 7);
        map.put("Jeans", 5);
        map.put("Gloves", 11);
        System.out.println(map);

        int value = map.put("Jeans", 4);
        System.out.println(map + " При изменении ключа возвращено значение: " + value);

        Set<String> set = map.keySet();
        System.out.println(set);
        Collection<Integer> collection = map.values();
        System.out.println(collection);



    }
}
