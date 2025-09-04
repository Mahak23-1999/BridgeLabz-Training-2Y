import java.util.Scanner;

public class FeetConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet → yards
        double distanceInYards = distanceInFeet / 3;

        // Convert yards → miles
        double distanceInMiles = distanceInYards / 1760;

        // Output
        System.out.println("The distance in feet is " + distanceInFeet +
                           ", in yards is " + distanceInYards +
                           ", and in miles is " + distanceInMiles);

        input.close();
    }
}
