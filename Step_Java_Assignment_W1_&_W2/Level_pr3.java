class Level_pr3 extends BaseProgram {

    public void showMenu() {

        char choice;

        do {
            printHeader("LEVEL 3 - REAL WORLD APPLICATIONS");

            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Total Income Calculator");
            System.out.println("4. Swap Two Numbers");
            System.out.println("5. Athlete 5km Round Calculator");
            System.out.println("6. Chocolate Distribution");
            System.out.println("7. Simple Interest Calculator");
            System.out.println("8. Pounds to Kilograms Converter");
            System.out.println("9. Maximum Handshakes");
            System.out.println("0. Exit Level 3");

            System.out.print("Select Program: ");
            int option = input.nextInt();

            switch(option) {

                case 1:
                    System.out.print("Enter Celsius: ");
                    double c = input.nextDouble();
                    System.out.println(c + " Celsius is " + ((c*9/5)+32) + " Fahrenheit");
                    break;

                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    double f = input.nextDouble();
                    System.out.println(f + " Fahrenheit is " + ((f-32)*5/9) + " Celsius");
                    break;

                case 3:
                    System.out.print("Enter salary: ");
                    double salary = input.nextDouble();
                    System.out.print("Enter bonus: ");
                    double bonus = input.nextDouble();
                    System.out.println("Total Income is INR " + (salary+bonus));
                    break;

                case 4:
                    System.out.print("Enter number1: ");
                    int n1 = input.nextInt();
                    System.out.print("Enter number2: ");
                    int n2 = input.nextInt();

                    int temp = n1;
                    n1 = n2;
                    n2 = temp;

                    System.out.println("Swapped numbers: " + n1 + " and " + n2);
                    break;

                case 5:
                    System.out.print("Enter 3 sides (meters): ");
                    double s1 = input.nextDouble();
                    double s2 = input.nextDouble();
                    double s3 = input.nextDouble();

                    double perimeter = s1 + s2 + s3;
                    System.out.println("Rounds needed for 5km: " + (5000/perimeter));
                    break;

                case 6:
                    System.out.print("Enter chocolates: ");
                    int choco = input.nextInt();
                    System.out.print("Enter children: ");
                    int children = input.nextInt();

                    System.out.println("Each child gets: " + (choco/children));
                    System.out.println("Remaining chocolates: " + (choco%children));
                    break;

                case 7:
                    System.out.print("Enter Principal, Rate, Time: ");
                    double p = input.nextDouble();
                    double r = input.nextDouble();
                    double t = input.nextDouble();

                    System.out.println("Simple Interest is " + (p*r*t/100));
                    break;

                case 8:
                    System.out.print("Enter weight in pounds: ");
                    double pounds = input.nextDouble();
                    System.out.println("Weight in kg: " + (pounds/2.2));
                    break;

                case 9:
                    System.out.print("Enter number of students: ");
                    int n = input.nextInt();
                    System.out.println("Maximum handshakes: " + (n*(n-1)/2));
                    break;

                case 0:
                    System.out.println("Exiting Level 3...");
                    return;

                default:
                    System.out.println("Invalid Option.");
            }

            System.out.print("\nRun another Level 3 program? (Y/N): ");
            choice = input.next().charAt(0);

        } while(choice == 'Y' || choice == 'y');

        printFooter();
    }
}
