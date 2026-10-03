public class Main { 
    public static void main(String[] args) {
    Vector3 a = new Vector3(1, 2, 3);
    Vector3 b = new Vector3(4, 5, 6);

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    System.out.println("a + b = " + a.add(b));

    System.out.println("a - b = " + a.subtract(b));

    System.out.println("a * 2 = " + a.multiply(2));

    System.out.println("Скалярное произведение = " + a.dot(b));

    System.out.println("Длина a = " + a.length());
    }
}