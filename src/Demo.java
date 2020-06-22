
public class Demo  {

    public void show(final int p) {
        System.out.println(p);      //reading value of parameter p
        //p++;                        //changing value of parameter p (from 10 making it 11)
        System.out.println(p);      //reading the new value of p i.e. 11
    }

    public static void main(String[] args) {
        Demo ob=new Demo();
        ob.show(10);
    }
}
