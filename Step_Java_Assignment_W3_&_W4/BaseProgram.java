import java.util.Scanner;

/**
 * Abstract base class for all levels.
 * Provides Scanner and common header/footer printing.
 */
public abstract class BaseProgram {
    protected Scanner input = new Scanner(System.in);

    protected void printHeader(String title) {
        System.out.println("\n========================================");
        System.out.println("  " + title);
        System.out.println("========================================");
    }

    protected void printFooter() {
        System.out.println("----------------------------------------");
        System.out.println(" Level finished.");
        System.out.println("----------------------------------------");
    }

    /** Each level implements an interactive menu in showMenu() */
    public abstract void showMenu();
}
