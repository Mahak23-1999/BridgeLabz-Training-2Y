import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        // Calculate power using Math.pow()
        double result = Math.pow(base, exponent);

        // Print result
        System.out.println(base + " raised to the power " + exponent + " = " + result);

        sc.close();
    }
}

