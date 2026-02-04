import java.util.Scanner;

class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Count digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // c. Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // d. Find frequency of each digit
        int[] frequency = new int[10]; // digits 0-9
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // e. Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
