import java.util.Scanner;

class Level_pr2 extends BaseProgram {

    public void showMenu() {

        char choice;

        do {
            printHeader("LEVEL 2 - APPLIED OPERATIONS");

            System.out.println("1. Basic Calculator");
            System.out.println("2. Triangle Area Calculator");
            System.out.println("3. Square Side Finder");
            System.out.println("4. Feet to Yards & Miles Converter");
            System.out.println("5. Total Purchase Calculator");
            System.out.println("6. Quotient & Remainder Finder");
            System.out.println("7. Integer Operations");
            System.out.println("8. Double Operations");
            System.out.println("0. Exit Level 2");

            System.out.print("Select Program: ");
            int option = input.nextInt();

            switch(option) {

                case 1:
                    System.out.print("Enter number1: ");
                    double n1 = input.nextDouble();
                    System.out.print("Enter number2: ");
                    double n2 = input.nextDouble();

                    System.out.println("Addition: " + (n1+n2));
                    System.out.println("Subtraction: " + (n1-n2));
                    System.out.println("Multiplication: " + (n1*n2));
                    System.out.println("Division: " + (n1/n2));
                    break;

                case 2:
                    System.out.print("Enter base (cm): ");
                    double base = input.nextDouble();
                    System.out.print("Enter height (cm): ");
                    double height = input.nextDouble();

                    double areaCm = 0.5 * base * height;
                    double areaIn = areaCm / (2.54 * 2.54);

                    System.out.println("Area in sq cm: " + areaCm);
                    System.out.println("Area in sq in: " + areaIn);
                    break;

                case 3:
                    System.out.print("Enter perimeter: ");
                    double perimeter = input.nextDouble();
                    System.out.println("Side length is " + (perimeter/4));
                    break;

                case 4:
                    System.out.print("Enter distance in feet: ");
                    double feet = input.nextDouble();

                    double yards = feet / 3;
                    double miles = yards / 1760;

                    System.out.println("Distance in yards: " + yards);
                    System.out.println("Distance in miles: " + miles);
                    break;

                case 5:
                    System.out.print("Enter unit price: ");
                    double price = input.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();

                    System.out.println("Total purchase price is INR " + (price*quantity));
                    break;

                case 6:
                    System.out.print("Enter number1: ");
                    int a = input.nextInt();
                    System.out.print("Enter number2: ");
                    int b = input.nextInt();

                    System.out.println("Quotient: " + (a/b));
                    System.out.println("Remainder: " + (a%b));
                    break;

                case 7:
                    System.out.print("Enter a, b, c: ");
                    int x = input.nextInt();
                    int y = input.nextInt();
                    int z = input.nextInt();

                    System.out.println("a + b * c = " + (x + y*z));
                    System.out.println("a * b + c = " + (x*y + z));
                    System.out.println("c + a / b = " + (z + x/y));
                    System.out.println("a % b + c = " + (x%y + z));
                    break;

                case 8:
                    System.out.print("Enter a, b, c: ");
                    double d1 = input.nextDouble();
                    double d2 = input.nextDouble();
                    double d3 = input.nextDouble();

                    System.out.println("a + b * c = " + (d1 + d2*d3));
                    System.out.println("a * b + c = " + (d1*d2 + d3));
                    System.out.println("c + a / b = " + (d3 + d1/d2));
                    System.out.println("a % b + c = " + (d1%d2 + d3));
                    break;

                case 0:
                    System.out.println("Exiting Level 2...");
                    return;

                default:
                    System.out.println("Invalid Option.");
            }

            System.out.print("\nRun another Level 2 program? (Y/N): ");
            choice = input.next().charAt(0);

        } while(choice == 'Y' || choice == 'y');

        printFooter();
    }
}
