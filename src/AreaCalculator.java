
public class AreaCalculator {

    public static void main(String[] args) {

        //Cylinder ob1=new Cylinder();
        //Sphere ob2=new Sphere();
        
        Shape ob1=new Cylinder();
        Shape ob2=new Sphere();
        
        ob1.setRadius(10); ob1.setHeight(20);
        ob2.setRadius(30); ob2.setHeight(40);
        
        ob1.showArea();
        ob2.showArea();
    }
}
