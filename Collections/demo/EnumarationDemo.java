import java.util.*;
public class EnumarationDemo{
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();

        for (int i = 0; i< 5; i++){
            v.add(i);
        }
        System.out.println(v);
        Enumeration e = (Enumeration) v.elements();
        while(e.hasMoreElements()){
            Integer i = (Integer) e.nextElement();
            System.out.print(i);
        }
        System.out.println(v);
    }
}