class Constructordemo{
    public static void main(String[] args) {
        
        // Student prasanth = new Student();
        // Student rahul = new Student(10, "ral", 90f);
        // System.out.println(prasanth.rno);
        // System.out.println(prasanth.name);
        // System.out.println(rahul.rno);
        // System.out.println(rahul.name);
        // System.out.println(rahul.marks);
        // rahul.greeting();

        // Memory allocation of new keyword
        A one;

        for(int i =0; i<10000000; i++){
            new A(i);
        }
       
    }
}
class Student{
        int rno=24;
        String name="kp";
        float marks;

        // Creating a Constructor
        Student(){
            this.name="Arun";
        }

        void greeting(){
            System.out.println("Hello my name is:"+this.name);
        }
        Student(int rno, String name, float marks){
            this.rno=rno;
            this.name=name;
            this.marks=marks;
        }
}
class A{

    A(int num){
        // System.out.println("Object created");
    }
    @Override
    protected void finalize() throws Throwable{
        // System.out.println("Object destroyed");
    }
}