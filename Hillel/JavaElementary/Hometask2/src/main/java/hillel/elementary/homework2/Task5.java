package hillel.elementary.homework2;

/**
 * Task: Print Airplane Information
 * <p>
 * Description:
 * The program demonstrates method overloading.
 * It creates three methods with the same name: printAirplaneInfo().
 * Each method prints information about a different type of airplane.
 * <p>
 * Airplane types:
 * - Fighter jet: model and type only
 * - Passenger airplane #1: model, type, and economy seats
 * - Passenger airplane #2: model, type, economy seats, and business seats
 * <p>
 * Example output:
 * Airplane type: Jet, model: F-22 Raptor
 * Airplane type: Airliner, model: Airbus 737, economy seats: 120
 * Airplane type: Airliner, model: Boeing 777, economy seats: 180, business seats: 28
 */
public class Task5 {
    public static void main(String[] args) {
        printAirplaneInfo("Jet", "F-22 Raptor");
        printAirplaneInfo("Airliner", "Airbus 737", 120);
        printAirplaneInfo("Airliner", "Airbus 777", 120, 28);
    }

    private static void printAirplaneInfo(String type, String model) {
        System.out.printf("Airplane type: %s, model: %s%n", type, model);
    }


    private static void printAirplaneInfo(String type, String model, int economySeats) {
        System.out.printf("Airplane type: %s, model: %s, economy seats: %d%n", type, model, economySeats);
    }

    private static void printAirplaneInfo(String type, String model, int economySeats, int businessSeats) {
        System.out.printf("Airplane type: %s, model: %s, economy seats: %d, business seats: %d%n", type, model, economySeats, businessSeats);
    }
}
