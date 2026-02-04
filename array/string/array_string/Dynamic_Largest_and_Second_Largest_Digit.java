import java.util.Scanner;

class DynamicLargestSecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Index variable
        int index = 0;

        // Extract digits and dynamically resize array
        while (number != 0) {

            // a & b. Increase array size if index reaches maxDigit
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            digits[index] = number % 10;  // store last digit
            number = number / 10;          // remove last digit
            index++;
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
