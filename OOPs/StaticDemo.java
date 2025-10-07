public class StaticDemo {
    public static void main(String[] args){
        
        greeting(); //We cannot use a non-static method inside a static context

        //We can create an object/instance for the class "StaticDemo" 
        // and can call "greeting()" method or we can make the method as static
    }
    static void greeting(){
        System.out.println("Hello world!");
    }
    
    void fun(){
        greeting(); //We can use a non-static method inside a non-static context
    }

}
