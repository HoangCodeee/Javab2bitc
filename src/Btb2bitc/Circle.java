package Btb2bitc;

public class Circle {
    public double radius;
    public double Area() {
        return Math.PI * radius * radius;
    }
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.radius =4;
        double area = circle.Area();
        double perimeter=circle.Perimeter();
        System.out.printf("The area of a circle is: %f %n",area);
        System.out.printf("The perimeter of a circle is: %f %n",perimeter);
    }
}
