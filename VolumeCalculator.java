import java.util.Scanner;

class Sphere {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to compute volume of the sphere
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }
}

class Cube {
    private double side;

    // Constructor
    public Cube(double side) {
        this.side = side;
    }

    // Method to compute volume of the cube
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    // Getter for side
    public double getSide() {
        return side;
    }
}

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = scanner.nextDouble();
        System.out.print("Enter the side length of the cube: ");
        double cubeSide = scanner.nextDouble();

        // Create objects for sphere and cube
        Sphere sphere = new Sphere(sphereRadius);
        Cube cube = new Cube(cubeSide);

        // Compute volumes
        double sphereVolume = sphere.calculateVolume();
        double cubeVolume = cube.calculateVolume();

        // Output with formatted volume
        System.out.printf("Volume of sphere with radius %.2f is: %.2f%n", sphere.getRadius(), sphereVolume);
        System.out.printf("Volume of cube with side %.2f is: %.2f%n", cube.getSide(), cubeVolume);

        scanner.close();
    }
}
