package sandbox.selfpractice.inputvalidation.task2;

import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 * Task description:
 * <p>
 * Ask the user for 7 daily temperatures.
 * Accept only values from -50 to 60.
 * Print the average temperature, the lowest value, and the highest value.
 */

public class TemperatureLog {
    private static final int TEMPERATURE_COUNT = 7;
    private static final double MIN_TEMPERATURE = -50;
    private static final double MAX_TEMPERATURE = 60;
    private static final String ERROR_MESSAGE = "Invalid input. Please, provide temperature in range of -50 to 60.";

    public static void main(String[] args) {
        printAverageMinAndMaxTemperature();
    }

    private static double[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        double[] temperatureValues = new double[TEMPERATURE_COUNT];

        while (index < TEMPERATURE_COUNT) {
            System.out.printf("Please, provide %d temperature: ", index + 1);
            if (!scanner.hasNextDouble()) {
                System.out.println(ERROR_MESSAGE);
                scanner.next();
                continue;
            }
            double temperature = scanner.nextDouble();
            if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
                System.out.println(ERROR_MESSAGE);
                continue;
            }
            temperatureValues[index] = temperature;
            index++;
        }
        scanner.close();
        return temperatureValues;
    }

    private static double calculateAverageTemperature(double[] temperatureValues) {
        return DoubleStream.of(temperatureValues).average().orElseThrow();

    }

    private static double[] findMinAndMaxTemperature(double[] temperatureValues) {
        double[] minAndMaxValues = new double[2];
        minAndMaxValues[0] = DoubleStream.of(temperatureValues).min().orElseThrow();
        minAndMaxValues[1] = DoubleStream.of(temperatureValues).max().orElseThrow();
        return minAndMaxValues;
    }

    private static void printAverageMinAndMaxTemperature() {
        double[] temperatureValues = getUserInput();
        double averageTemperature = calculateAverageTemperature(temperatureValues);
        double[] minAndMaxTemperature = findMinAndMaxTemperature(temperatureValues);
        System.out.printf("Average temperature is: %.2f%n", averageTemperature);
        System.out.printf("Minimum temperature is: %.2f%n", minAndMaxTemperature[0]);
        System.out.printf("Maximum temperature is: %.2f%n", minAndMaxTemperature[1]);
    }
}
