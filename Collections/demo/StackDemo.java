import java.util.*;
public class StackDemo {
      public static void main(String[] args) {
            
        ArrayList<Integer> al = new ArrayList<>();
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.empty());
        s.pop();
        System.out.println(s);
        System.out.println(s.search(1));
        s.push("a");
        System.out.println(s);
      }  
}
