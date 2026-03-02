/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach
 * to generate each letter's pattern through dedicated methods.
 *
 * @author Vidushi
 * @version 6.0
 */

public class OOPSBannerApp {

    // Method to generate pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };
    }

    // Method to generate pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " *   * ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };
    }

    // Method to generate pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            " *     ",
            " *     ",
            " ***** ",
            "     * ",
            "     * ",
            " ***** "
        };
    }

    // Main method
    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + " " +
                oPattern[i] + " " +
                pPattern[i] + " " +
                sPattern[i]
            );
        }
    }
}