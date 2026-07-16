package sandbox.selfpractice.inputvalidation.task1;

import java.util.Scanner;

/**
 * Task description:
 * Ask the user for 5 exam grades from 0 to 10.
 * Ignore invalid input and keep asking until 5 valid grades are entered.
 * Print the average and whether the student passed. Passing average is 6 or higher.
 */


public class ExamAverage {

    private static final int GRADES_COUNT = 5;
    private static final double MIN_GRADE = 0;
    private static final double MAX_GRADE = 10;
    private static final double PASSING_AVERAGE = 6;

    public static void main(String[] args) {
        runExamAverageTask();
    }

    private static double[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        double[] grades = new double[GRADES_COUNT];

        while (index < GRADES_COUNT) {
            System.out.printf("Please, provide your %d grade: ", index + 1);

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please provide grade.");
                scanner.next();
                continue;
            }
            double grade = scanner.nextDouble();
            if (isValidGrade(grade)) {
                grades[index] = grade;
                index++;
            }
        }

        scanner.close();
        return grades;
    }

    private static boolean isValidGrade(double grade) {
        if (grade < MIN_GRADE || grade > MAX_GRADE) {
            System.out.println("Please provide grade from 0 to 10.");
            return false;
        }

        return true;
    }

    private static double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    private static void printResult(double average) {
        if (average >= PASSING_AVERAGE) {
            System.out.printf("Congratulations! You passed! The average score for passing is 6.0 and your average is: %.1f", average);
        } else {
            System.out.printf("We regret to inform you, but you didn't pass.%nThe average score for passing is 6.0 and your average is: %.1f", average);
        }
    }

    private static void runExamAverageTask() {
        double[] grades = getUserInput();
        double average = calculateAverage(grades);
        printResult(average);

    }
}
