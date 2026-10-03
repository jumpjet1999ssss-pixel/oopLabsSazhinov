public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super("Треугольник");

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override 
    public double area() {
        double p = perimetr() / 2;

        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override 
    public double perimetr() {
        return sideA + sideB + sideC;
    }
    
}