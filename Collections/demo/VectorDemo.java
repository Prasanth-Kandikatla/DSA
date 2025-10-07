import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(10, 5);
        System.out.println(v.capacity());
        // v.addElement(11);

        for (int i=0; i<10; i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement(24);
        System.out.println(v);
        System.out.println(v.capacity());
    }
}


