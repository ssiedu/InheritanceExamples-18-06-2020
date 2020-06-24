abstract class M {
    void m1(){  //concrete method
        System.out.println("hello");
    }
    void m2(){} //concrete method
    abstract void m3();  //abstract
    abstract void m4();
}
class N extends M {
    void m3(){
        //
    }
    void m4(){
        
    }
}

public class AbstractOne {
    public static void main(String[] args) {
        N ob=new N();
        ob.m1();
        ob.m2();
        ob.m3();
        ob.m4();
       
    }
}
