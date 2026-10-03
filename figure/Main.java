public class Main { 
    public static void main(String[] args) {
    Figure parallelogram = new Parallelogram(5, 3, 4);
    Figure circle = new Circle(5);
    Figure triangle = new Triangle(3, 4, 5);
    Figure square = new Square(4);

    parallelogram.printInfo();
    System.out.println();

    circle.printInfo();
    System.out.println();

    triangle.printInfo();
    System.out.println();

    square.printInfo();
    }
}