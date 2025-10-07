package CustomDataStructures;

import java.util.Arrays;

public class CustomGenArrayList<T extends Number> {
    
    private static Object[] data;
    private static int DEFAULT_SIZE = 10;
    int size = 0;

    CustomGenArrayList(){
        data = new Object[DEFAULT_SIZE];
    }

    // Add an element
    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }
    boolean isFull(){
        return size==data.length;
    }
    void resize(){
        Object[] temp = new Object[data.length*2];

        // Copy values of old array into temporary array
        for (int i =0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public void addAtIndex(int index, T value){
        data[index] = value;
        size++;
    }

    @Override 
    public String toString(){
        return Arrays.toString(data);
    } 
    public static void main(String[] args) {
        CustomGenArrayList<String> list = new CustomGenArrayList<>();
        list.add("Hi");
        list.addAtIndex(2,2);
        System.out.println(list);

        System.out.println(list.size);
    }
}
