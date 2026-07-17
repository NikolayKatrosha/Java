import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For quitting the application press \"q\"");
        System.out.println("Please, provide your numeric value: ");
        while (!scanner.hasNext("q")) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please, provide numeric value.");
                scanner.next();
                continue;
            }

            System.out.println(scanner.nextInt());
        }
        scanner.close();
    }
}