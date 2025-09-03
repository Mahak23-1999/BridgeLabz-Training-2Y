import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // Calculate perimeter
        double perimeter = 2 * (length + width);

        // Print result
        System.out.println("Perimeter of the rectangle = " + perimeter);

        sc.close();
    }
}
