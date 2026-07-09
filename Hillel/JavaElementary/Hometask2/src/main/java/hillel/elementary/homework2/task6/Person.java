package hillel.elementary.homework2.task6;

/**
 * Task: Person Information
 * <p>
 * Description:
 * The program creates a Person class with a personInfo() method.
 * The method receives four parameters: first name, last name, city, and phone number.
 * It returns a formatted string with information about the person.
 * <p>
 * In the main method, personInfo() is called three times with different people.
 * <p>
 * Example output:
 * Call citizen Will Smith from New York by phone number 2936729462846.
 * Call citizen Jackie Chan from Shanghai by phone number 12312412412.
 * Call citizen Sherlock Holmes from London by phone number 37742123513.
 */

public class Person {

    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));
    }

    private static String personInfo(String firstName, String lastName, String city, String phoneNumber) {
        return "Call citizen " + firstName + " " + lastName + " from " + city + " by phone number " + phoneNumber + ".";
    }
}
