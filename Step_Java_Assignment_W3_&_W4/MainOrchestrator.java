import java.util.Scanner;

/**
 * Controller. Choose level and variant (opt = optimized, std = usual).
 */
public class MainOrchestrator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cont;

        do {
            System.out.println("\n=== ORCHESTRATOR MENU ===");
            System.out.println("1. Level 1 (opt)");
            System.out.println("2. Level 1 (std)");
            System.out.println("3. Level 2 (opt)");
            System.out.println("4. Level 2 (std)");
            System.out.println("5. Level 3 (opt)");
            System.out.println("6. Level 3 (std)");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            BaseProgram level = null;
            switch(choice) {
                case 1: level = new Level_pr1_opt(); break;
                case 2: level = new Level_pr1_std(); break;
                case 3: level = new Level_pr2_opt(); break;
                case 4: level = new Level_pr2_std(); break;
                case 5: level = new Level_pr3_opt(); break;
                case 6: level = new Level_pr3_std(); break;
                case 0:
                    System.out.println("Exiting orchestrator.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }

            if (level != null) level.showMenu();

            System.out.print("\nReturn to orchestrator menu? (Y/N): ");
            cont = sc.next().charAt(0);

        } while(cont == 'Y' || cont == 'y');

        System.out.println("Goodbye!");
        sc.close();
    }
}
