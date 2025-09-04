import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        double km;    // variable to store kilometers

        // Scanner object to take input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();   // taking user input (integer value)

        // Conversion (1 mile = 1.6 km → so miles = km / 1.6)
        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
