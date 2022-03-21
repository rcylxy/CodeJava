package TreeSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) throws Exception {
        Collection c1 = new ArrayList();
        c1.add("abc");
        c1.add("xyz");
        c1.add("wer");
        c1.add(5);

        Iterator it = c1.iterator();
        while (it.hasNext()) {
            try {
                String s = (String) it.next();
                System.out.println(s);
            } catch (ClassCastException e) {
                System.out.println("强制类型转换失败");
            }

        }
    }


}
