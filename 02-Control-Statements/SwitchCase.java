/*
 * File: SwitchCase.java
 *
 * Definition:
 * switch-case is used when we have multiple fixed values
 * for a single variable.
 *
 * Important Points:
 * - Works with int, char, String
 * - break is IMPORTANT to avoid fall-through
 *
 * Interview Questions:
 * Q1. What happens if break is missing?
 * Q2. Can switch work with String? → YES (Java 7+)
 */

public class SwitchCase {

    public static void main(String[] args) {

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Switch with String
        String role = "Admin";

        switch (role) {
            case "Admin":
                System.out.println("Full Access");
                break;
            case "User":
                System.out.println("Limited Access");
                break;
            default:
                System.out.println("No Access");
        }
    }
}
