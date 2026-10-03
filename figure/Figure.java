public abstract class Figure {
    private String name;
    
    public Figure(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimetr();
    
    public void printInfo() {
        System.out.println("Фигура:" + name);
        System.out.println("Площадь: " + area());
        System.out.println("Преиметр: " + perimetr());
    }

    public String getName() {
        return name;
    }
}