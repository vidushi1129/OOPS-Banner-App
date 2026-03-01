/**
 * OOPSBannerApp UC2 – Render OOPS as Banner using + operator
 *
 * This use case prints OOPS in banner format
 * using string concatenation.
 *
 * @author Vidushi
 * @version 2.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("  ***  " , "  ***  " , " ***** " , " ***** "));
        System.out.println(String.join(" *   * " , " *   * " , " *   * " , " *     "));
        System.out.println(String.join(" *   * " , " *   * " , " ***** " , " ***** "));
        System.out.println(String.join(" *   * " , " *   * " , " *     " , "     * "));
        System.out.println(String.join("  ***  " , "  ***  " ," *     " , " ***** "));
        System.out.println(String.join("       " , "       " , "       " ,"       "));
        System.out.println(String.join("       " , "       " , "       " , "       "));
    }
}