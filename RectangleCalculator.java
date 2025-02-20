import java.util.Scanner;

class RectangleCalculator {

    // Function to calculate area
    static double calculateArea(double length, double width) {
        return length * width;
    }

    // Function to calculate perimeter
    static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();

        // Calling functions to calculate area and perimeter
        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);

        // Displaying the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        sc.close();
    }
}
