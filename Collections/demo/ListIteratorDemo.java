import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        
        ArrayList<String> l = new ArrayList<>();
        l.add("venky");
        l.add("chiru");
        l.add("bala");
        l.add("nag");
        ListIterator ltr = l.listIterator();
        System.out.println(l);
        while(ltr.hasNext()){
            String s = (String) ltr.next();

            if(s == "chiru"){
                ltr.set("charan");
                ltr.add("bunny");
            }
            else if(s == "nag"){
                ltr.remove();
            }
            else if(s == "bala"){
                ltr.add("tarak");
            }
            else if(s=="bala"){
                System.out.println(ltr.next());
            }
        }
        
        System.out.println(l);

        // while(ltr.hasPrevious()){
        //     String s = (String) ltr.previous();
        //     if (s == "tarak"){
        //         System.out.println(ltr.previous());
        //         System.out.println(ltr.previousIndex());

        //     }
        // }
        while(ltr.hasNext()){
            String s = (String) ltr.next();
            if(s=="bunny"){
                System.out.println(ltr.nextIndex());
            }
        }
        // System.out.println(l);
        
    }
}
