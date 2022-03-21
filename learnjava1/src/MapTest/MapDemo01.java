package MapTest;

import java.util.*;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("001", 1);
        map.put("002", 2);
        map.put("003", 3);
        map.put("004", 3);
        System.out.println(map.remove("008"));
        System.out.println(map.get("001"));
        Set<String> str = map.keySet();
        Iterator<String> it = str.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        Collection<Integer> values = map.values();
        for (int i : values) {
            System.out.print(i);
        }

        System.out.println(map);
    }
}
