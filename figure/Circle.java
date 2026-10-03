public class Circle extends Figure {
    private  double radius;

    public Circle(double radius) {
        super("Круг");

        this.radius = radius;
    }

    @Override 
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override 
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

}