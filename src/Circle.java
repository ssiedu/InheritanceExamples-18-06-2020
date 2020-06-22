
public class Circle {

    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        //PI++;
        double area = PI * radius * radius;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(10);
        circle.area();
    }
}
