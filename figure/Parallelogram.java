public class Parallelogram extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public Parallelogram(double sideA, double sideB, double height) {
        super("Параллелограмм");
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override 
    public double area() {
        return sideA * height;
    }

    @Override 
    public double perimetr() {
        return 2 * (sideA + sideB);
    }
    
}