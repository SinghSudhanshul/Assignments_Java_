import java.util.Scanner;

abstract class BaseProgram {

    protected Scanner input = new Scanner(System.in);

    protected void printHeader(String title) {
        System.out.println("\n=========================================");
        System.out.println("         " + title);
        System.out.println("=========================================");
    }

    protected void printFooter() {
        System.out.println("\n-----------------------------------------");
        System.out.println(" Level Execution Completed ");
        System.out.println("-----------------------------------------");
    }

    public abstract void showMenu();
}
