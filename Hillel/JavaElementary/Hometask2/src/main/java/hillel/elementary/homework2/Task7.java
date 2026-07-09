package hillel.elementary.homework2;

import java.util.Scanner;

/**
 * Task: Calculate Student Scholarship
 * <p>
 * Description:
 * The program asks the user to enter grades for five subjects.
 * It calculates the average grade and determines which scholarship
 * the student can receive.
 * <p>
 * Scholarship rules:
 * - Increased scholarship: average grade is at least 10
 * - Regular scholarship: average grade is at least 8
 * - No scholarship: average grade is less than 8
 * <p>
 * The program prints the average grade and the scholarship result.
 */

public class Task7 {
    public static void main(String[] args) {
        double[] userGrades = getUserInput();
        printAverageGradeAndScholarshipResult(userGrades);
    }

    private static void printAverageGradeAndScholarshipResult(double[] grades) {
        double averageGrade = calculateAverageGrade(grades);
        System.out.printf("Your average is: %.2f%nYou get: ", averageGrade);
        if (averageGrade >= 10) {
            System.out.println("Increased scholarship");
        } else if (averageGrade >= 8) {
            System.out.println("Regular scholarship");
        } else {
            System.out.println("No scholarship");
        }
    }

    private static double calculateAverageGrade(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    private static double[] getUserInput() {
        final int gradesCount = 5;
        final int minGrade = 0;
        final int maxGrade = 10;

        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[gradesCount];

        System.out.println("Please enter 5 grades from 0 to 10:");

        int index = 0;

        while (index < grades.length) {
            System.out.printf("Grade %d: ", index + 1);

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }
            double grade = scanner.nextDouble();

            if (grade < minGrade || grade > maxGrade) {
                System.out.println("Invalid grade. Grade must be from 0 to 10.");
                continue;
            }

            grades[index] = grade;
            index++;
        }
        scanner.close();
        return grades;
    }
}
