package hillel.elementary.homework1;

/**
 * Task: Calculate Snowman Weight
 * <p>
 * Description:
 * Children made a snowman from three perfectly shaped snow spheres.
 * The radii of the spheres are 1.0 m, 0.5 m, and 0.2 m.
 * The snow density coefficient is 0.7 kg/m^3.
 * The program calculates the total weight of the snowman.
 * <p>
 * Formula:
 * sphere volume = (4.0 / 3.0) * PI * radius^3
 * weight = total volume * density
 * <p>
 * Example values:
 * radius1 = 1.0
 * radius2 = 0.5
 * radius3 = 0.2
 * density = 0.7
 */

public class Task4 {
    private static final double DENSITY = 0.7;

    public static void main(String[] args) {
        double radius1 = 1.0;
        double radius2 = 0.5;
        double radius3 = 0.2;
        double snowmanWeight = calculateSnowmanWeight(radius1, radius2, radius3);
        System.out.printf("Calculated weight of snowman is: %.4f", snowmanWeight);

    }

    private static double calculateSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    private static double calculateWeight(double volume) {
        return volume * DENSITY;
    }

    public static double calculateSnowmanWeight(double radius1, double radius2, double radius3) {
        double sphere1Volume = calculateSphereVolume(radius1);
        double sphere2Volume = calculateSphereVolume(radius2);
        double sphere3Volume = calculateSphereVolume(radius3);
        double totalVolume = sphere1Volume + sphere2Volume + sphere3Volume;
        return calculateWeight(totalVolume);
    }
}
