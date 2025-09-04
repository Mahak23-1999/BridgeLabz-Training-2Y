import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: distance in feet
        System.out.print("Enter the distance in feet: ");
        int distanceInFeet = sc.nextInt();

        // Conversion factors
        // 1 yard = 3 feet
        // 1 mile = 1760 yards
        int distanceInYards = distanceInFeet / 3;
        double distanceInMiles = (double) distanceInYards / 1760;

        // Output
        System.out.println("The distance in yards is " + distanceInYards +
                           " while the distance in miles is " + distanceInMiles);

        sc.close();
    }
}
