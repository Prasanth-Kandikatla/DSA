import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();

        h.add("D");
        h.add("B");
        h.add("C");
        h.add("A");
        h.add(null);

        System.out.println(h);
        System.out.println(h.add("A"));

        System.out.println(h);
    }
}
