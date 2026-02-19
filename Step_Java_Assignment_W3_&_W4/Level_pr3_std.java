/**
 * Level 3 - Standard (educational) implementations.
 * Simpler loops/recursion where applicable, naive divisor sums.
 */
class Level_pr3_std extends BaseProgram {

    public void showMenu() {
        char again;
        do {
            printHeader("LEVEL 3 - STANDARD");
            System.out.println("1. Leap Year (std)");
            System.out.println("2. Leap single-if (std)");
            System.out.println("3. Marks & Grade (std)");
            System.out.println("4. Prime check (naive)");
            System.out.println("5. Armstrong (std)");
            System.out.println("6. Count digits (std)");
            System.out.println("7. BMI (std)");
            System.out.println("8. Harshad (std)");
            System.out.println("9. Abundant (naive)");
            System.out.println("10. Calculator (switch std)");
            System.out.println("0. Exit Level3(std)");
            System.out.print("Select: ");
            int opt = input.nextInt();
            switch(opt) {
                case 1: leapStd(); break;
                case 2: leapSingleIfStd(); break;
                case 3: marksStd(); break;
                case 4: primeNaive(); break;
                case 5: armstrongStd(); break;
                case 6: countDigitsStd(); break;
                case 7: bmiStd(); break;
                case 8: harshadStd(); break;
                case 9: abundantNaive(); break;
                case 10: calcStd(); break;
                case 0: System.out.println("Exit Level3(std)"); return;
                default: System.out.println("Invalid");
            }
            System.out.print("\nRun another Level3(std) program? (Y/N): ");
            again = input.next().charAt(0);
        } while(again=='Y' || again=='y');
        printFooter();
    }

    private void leapStd() {
        System.out.print("Enter year: ");
        int y = input.nextInt();
        if (y < 1582) { System.out.println("Out of range"); return; }
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) System.out.println("Leap");
                else System.out.println("Not Leap");
            } else System.out.println("Leap");
        } else System.out.println("Not Leap");
    }

    private void leapSingleIfStd() {
        System.out.print("Enter year: ");
        int y = input.nextInt();
        boolean isLeap = (y >= 1582) && ((y%4==0 && y%100!=0) || (y%400==0));
        System.out.println(isLeap ? "Leap" : "Not Leap");
    }

    private void marksStd() {
        System.out.print("Enter physics chem maths: ");
        double p = input.nextDouble(), c = input.nextDouble(), m = input.nextDouble();
        double percentage = (p+c+m)/3.0;
        System.out.println("Percentage = " + percentage);
        if (percentage >= 90) System.out.println("A Excellent");
        else if (percentage >= 75) System.out.println("B Very Good");
        else if (percentage >= 60) System.out.println("C Good");
        else if (percentage >= 40) System.out.println("D Pass");
        else System.out.println("F Fail");
    }

    private void primeNaive() {
        System.out.print("Enter number (>1): ");
        int n = input.nextInt();
        boolean isPrime = true;
        if (n <= 1) isPrime = false;
        for (int i=2;i<n;i++) {
            if (n % i == 0) { isPrime = false; break; }
        }
        System.out.println(isPrime ? "Prime" : "Not prime");
    }

    private void armstrongStd() {
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int tmp = num, sum = 0;
        while (tmp != 0) {
            int d = tmp % 10;
            sum += d * d * d; // educational hint uses cubes for 3-digit
            tmp /= 10;
        }
        System.out.println((sum == num) ? "Armstrong" : "Not Armstrong");
    }

    private void countDigitsStd() {
        System.out.print("Enter integer: ");
        int n = Math.abs(input.nextInt());
        int count = 0;
        if (n == 0) count = 1;
        while(n > 0) { count++; n /= 10; }
        System.out.println("Digits = " + count);
    }

    private void bmiStd() {
        System.out.print("Enter weight(kg) and height(cm): ");
        double w = input.nextDouble(), hcm = input.nextDouble();
        double h = hcm / 100.0;
        double bmi = w / (h*h);
        System.out.println("BMI = " + bmi);
    }

    private void harshadStd() {
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int tmp = n, sum = 0;
        while(tmp != 0) { sum += tmp % 10; tmp /= 10; }
        System.out.println((n % sum == 0) ? "Harshad" : "Not Harshad");
    }

    private void abundantNaive() {
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i=1;i<n;i++) if (n % i == 0) sum += i;
        System.out.println(sum > n ? "Abundant" : "Not Abundant (sum=" + sum + ")");
    }

    private void calcStd() {
        System.out.print("Enter first second and op (+ - * /): ");
        double a = input.nextDouble(), b = input.nextDouble();
        String op = input.next();
        switch(op) {
            case "+": System.out.println(a+b); break;
            case "-": System.out.println(a-b); break;
            case "*": System.out.println(a*b); break;
            case "/": if (b==0) System.out.println("Divide by zero"); else System.out.println(a/b); break;
            default: System.out.println("Invalid");
        }
    }
}
