/**
 * Task: Print Geographic Coordinates
 * <p>
 * Description:
 * The program creates two variables: latitude and longitude.
 * These variables store the geographic coordinates of a chosen location.
 * The program then prints the latitude and longitude to the console.
 * <p>
 * Example location:
 * Eiffel Tower, Paris, France
 * <p>
 * Example output:
 * Latitude: 48.8584
 * Longitude: 2.2945
 */

package hillel.elementary.homework1;

public class Task2 {

    public static void main(String[] args) {
        double latitude = 48.8584;
        double longitude = 2.2945;

        printCoordinates(latitude, longitude);
    }

    public static void printCoordinates(double latitude, double longitude) {
        System.out.printf("Coordinates:%nLatitude: %.4f%nLongitude: %.4f%n", latitude, longitude);
        // Optional   System.out.println("Coordinates:\n Latitude: " + latitude + "\n Longitude: " + longitude);
    }
}
