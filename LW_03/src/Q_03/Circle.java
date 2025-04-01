package Q_03;

import java.util.Scanner;

public class Circle {
    private double radius;

    //No-arg constructor
    public Circle(){
        this.radius=0.0;
    }
    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Compute area
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Compute circumference
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inner radius (ri): ");
        double ri = scanner.nextDouble();

        System.out.print("Enter outer radius (ro): ");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.printf("Area of the circular region: %.2f\n", shadedArea);

        scanner.close();
    }


}
