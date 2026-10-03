public class Square extends Figure {
    private double side;

    public Square(double side) {
        super("Квадрат");

        this.side = side;
    }

    @Override 
    public double area() {
        return side * side;
    }

    @Override 
    public double perimetr() {
        return 4 * side;
    }
}