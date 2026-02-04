import java.util.Scanner;

public class StudentGradeCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Create arrays
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Take input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics marks: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) {
                i--;
                System.out.println("Marks must be positive. Re-enter student details.");
                continue;
            }

            System.out.print("Chemistry marks: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) {
                i--;
                System.out.println("Marks must be positive. Re-enter student details.");
                continue;
            }

            System.out.print("Maths marks: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) {
                i--;
                System.out.println("Marks must be positive. Re-enter student details.");
            }
        }

        // d. Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // e. Display result
        System.out.println("\n--- Student Result ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}