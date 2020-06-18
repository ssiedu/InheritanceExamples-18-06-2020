
public class B extends A {
   
    void m3() {
        System.out.println("Hello from m3 of B");
    }

    void m4() {
        System.out.println("Hello from m4 of B");
    }

    public static void main(String[] args) {
        B ob=new B();
        ob.m1();
        ob.m2();
        ob.m3();
        ob.m4();
    }
}
