class P {
    int data=100;
    public P(){
        System.out.println("Constructor of P - (Parent)");
    }
    static void info(){
        System.out.println("Some info From Parent....");
    }
}
class C extends P {
    int data=200;
    public C(){
        System.out.println("Constructor of C - Child");
    }
    static void info(){
        System.out.println("Some Info From Child .....");
    }
    void print(){
        super.info();
        //System.out.println(data);       //data of child itself
        //System.out.println(super.data); //data of parent class
    }
}

public class SuperOne {

    public static void main(String[] args) {
        C ob=new C();
        //ob.print();
    }
}
