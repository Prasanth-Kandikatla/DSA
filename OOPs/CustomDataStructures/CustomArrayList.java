package CustomDataStructures;

import java.util.Arrays;

public class CustomArrayList {
    private static int[] data;
    private static int DEFAULT_SIZE = 10;
    private static int size = 0;

    
    CustomArrayList(){
        this.data = new int [DEFAULT_SIZE];
    }
    public void add(int value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }

    // Double the size if the size is equal to size of array
    private void resize(){
        int[] temp = new int[data.length * 2];
    //Copy current values into new array 
        for(int i = 0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    // check whether the array is full and return true/false
    public boolean isFull(){
         return size==data.length;
    }

    // Add at particular index
    public static void addAtIndex(int ind, int value){
        data[ind] = value;
        // size++;
    }

    @Override
    public String toString(){
        return Arrays.toString(data)+", size:" + size;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(1);

        // System.out.println(list);
        addAtIndex(3, 4);
        System.out.println(list);
    }
}
