public abstract class Shape {
    
    double radius, height;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public abstract void showArea();
    //public abstract void showVolume();
    
}
