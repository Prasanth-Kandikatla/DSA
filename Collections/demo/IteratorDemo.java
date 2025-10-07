import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            l.add(i);
        }
        System.out.println(l);
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            Integer in = (Integer) itr.next();
            if(in%2 == 0){
                System.out.println(in);
            }
            else{
                itr.remove();
                System.out.println(in);
            }
        }
        
        System.out.println(l);

    }
}
