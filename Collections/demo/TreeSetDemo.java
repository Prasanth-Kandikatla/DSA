import java.util.*;
public class TreeSetDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("B");
        t.add("C");
        t.add("Z");
        t.add("D");
        // t.add(10);
        // t.add(null);
        System.out.println();
        System.out.println(t);
    }
}
