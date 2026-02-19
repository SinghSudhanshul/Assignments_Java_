class Level_pr1 extends BaseProgram {

    public void showMenu() {

        char choice;

        do {
            printHeader("LEVEL 1 ");

            System.out.println("1. Age Calculator");
            System.out.println("2. Average PCM Calculator");
            System.out.println("3. Distance Converter");
            System.out.println("4. Profit Calculator");
            System.out.println("5. Pen Distribution");
            System.out.println("6. Fee Discount Calculator");
            System.out.println("7. Earth Volume Calculator");
            System.out.println("0. Exit Level 1");

            System.out.print("Select Program: ");
            int option = input.nextInt();

            switch(option) {

                case 1:
                    int age = 2024 - 2000;
                    System.out.println("Harry's age in 2024 is " + age);
                    break;

                case 2:
                    double avg = (94 + 95 + 96) / 3.0;
                    System.out.println("Average PCM is " + avg + "%");
                    break;

                case 3:
                    double miles = 10.8 / 1.6;
                    System.out.println("10.8 km in miles is " + miles);
                    break;

                case 4:
                    double profit = 191 - 129;
                    double percent = (profit / 129) * 100;
                    System.out.println("Profit = " + profit + 
                        " | Profit % = " + percent);
                    break;

                case 5:
                    System.out.println("Each student gets " + (14/3) + 
                        " pens, Remaining: " + (14%3));
                    break;

                case 6:
                    double discount = 125000 * 10 / 100.0;
                    System.out.println("Discount = " + discount +
                        " | Final Fee = " + (125000 - discount));
                    break;

                case 7:
                    double volume = (4.0/3) * Math.PI * 
                        Math.pow(6378,3);
                    System.out.println("Earth Volume (km³): " + volume);
                    break;

                case 0:
                    System.out.println("Exiting Level 1...");
                    return;

                default:
                    System.out.println("Invalid Option");
            }

            System.out.print("\nRun another Level 1 program? (Y/N): ");
            choice = input.next().charAt(0);

        } while(choice == 'Y' || choice == 'y');

        printFooter();
    }
}
