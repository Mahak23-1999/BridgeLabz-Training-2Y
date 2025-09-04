import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input lena
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // formula apply karna
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // output show karna
        System.out.println("The maximum number of possible handshakes among " 
                            + numberOfStudents + " students is " + handshakes);

        input.close();
    }
}
