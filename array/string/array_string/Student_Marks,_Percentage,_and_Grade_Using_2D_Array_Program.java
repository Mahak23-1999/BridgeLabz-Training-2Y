import java.util.Scanner;

class StudentGrades2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        // b. Create 2D array for marks (physics, chemistry, maths)
        double[][] marks = new double[number][3]; // 0-Physics, 1-Chemistry, 2-Maths
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Input marks
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();

            // Input validation
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0 || 
                marks[i][0] > 100 || marks[i][1] > 100 || marks[i][2] > 100) {
                System.out.println("Invalid marks! Enter values between 0 and 100.");
                i--; // re-enter
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < number; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300) * 100;

            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
