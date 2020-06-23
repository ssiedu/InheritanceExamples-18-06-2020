class X{
    X(){
        System.out.println("X-0");
    }
    X(int p){
        System.out.println("X-1");
    }
    X(int p, int q){
        System.out.println("X-2");
    }
}
class Y extends X{
    Y(){
        super(1,2);     //calling 2 arg constructor of parent
        System.out.println("Y-0");
    }
    Y(int p){
        super(1,2);     //calling 2 arg constructor explicitly
        System.out.println("Y-1");
    }
    Y(int p, int q){
        //super(1);       //calling 1 arg constructor explicitly
        System.out.println("Y-2");
    }
}
class Z extends Y {
    Z(){
        super(1);
        System.out.println("Z-0");
    }
}

public class SuperTwo {
    public static void main(String[] args) {
        Z ob=new Z();
        
    }
}
