import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input from user
        System.out.print("Enter base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double height = input.nextDouble();

        // area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // conversion factor cm² to in²
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // output
        System.out.println("The Area of the triangle in sq cm is " + areaSqCm 
                           + " and in sq in is " + areaSqIn);

        input.close();
    }
}
