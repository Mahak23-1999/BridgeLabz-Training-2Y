import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take radius input
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        // Take height input
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculate volume using formula π * r^2 * h
        double volume = Math.PI * radius * radius * height;

        // Print result
        System.out.println("Volume of the cylinder: " + volume);

        sc.close();
    }
}
