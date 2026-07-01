
package day12.activity;
import java.util.Scanner;
public class Activity8_Francisco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("           Average Calculator");
        System.out.println("========================================");

        // Get number of students and subjects
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Get subject names
        String[] subjects = new String[numSubjects];
        System.out.println("\nEnter subject names:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine().trim();
        }

        // Arrays to store data
        String[] studentNames = new String[numStudents];
        double[][] grades = new double[numStudents][numSubjects];
        double[] averages = new double[numStudents];

        // Input student information
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nName of Student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine().trim();

            System.out.println("Enter grades for each subject:");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                grades[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Consume newline
        }

        // Calculate averages
        for (int i = 0; i < numStudents; i++) {
            double sum = 0;
            for (double grade : grades[i]) {
                sum += grade;
            }
            averages[i] = sum / numSubjects;
        }

        // Display Grades Report
        System.out.println("\n========================================");
        System.out.println("             Grades Report");
        System.out.println("========================================");

        // Table Header
        System.out.printf("%-15s", "Student");
        for (String subject : subjects) {
            System.out.printf("%-12s", subject);
        }
        System.out.printf("%-10s%n", "Average");
        System.out.println("----------------------------------------------------------------");

        // Table Rows
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-15s", studentNames[i]);
            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%-12.0f", grades[i][j]);
            }
            System.out.printf("%-10.2f%n", averages[i]);
        }

        System.out.println("========================================");
        System.out.println("BUILD SUCCESSFUL");

        scanner.close();
    }
}