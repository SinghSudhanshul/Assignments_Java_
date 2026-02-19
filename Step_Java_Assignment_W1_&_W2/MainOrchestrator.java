class MainOrchestrator {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("\n=========================================");
            System.out.println("        JAVA PROGRAM EXECUTION MENU");
            System.out.println("=========================================");
            System.out.println("1. Run Level 1");
            System.out.println("2. Run Level 2");
            System.out.println("3. Run Level 3");
            System.out.println("0. Exit");

            System.out.print("Select Level: ");
            int levelChoice = input.nextInt();

            BaseProgram level = null;

            switch(levelChoice) {

                case 1:
                    level = new Level_pr1();
                    break;

                case 2:
                    level = new Level_pr2();
                    break;

                case 3:
                    level = new Level_pr3();
                    break;

                case 0:
                    System.out.println("Exiting System...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }

            if(level != null)
                level.showMenu();

            System.out.print("\nDo you want to select another Level? (Y/N): ");
            continueChoice = input.next().charAt(0);

        } while(continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("\nSystem Terminated Successfully.");
    }
}
