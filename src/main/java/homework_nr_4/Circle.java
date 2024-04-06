package homework_nr_4;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        calculateArea();

        Circle radius = new Circle(3);
        System.out.println(radius.radius);
    }

    static void calculateArea() {
        double radius = 4;
        double area = Math.PI * radius * 2;

        System.out.println(area);
        System.out.println("----------------------");
    }

}






