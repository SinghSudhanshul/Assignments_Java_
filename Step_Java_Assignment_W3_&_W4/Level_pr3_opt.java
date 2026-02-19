/**
 * Level 3 - Optimized implementations.
 * Optimizations: prime check up to sqrt(n), divisor sums up to sqrt(n), Armstrong uses k-digit power.
 */
class Level_pr3_opt extends BaseProgram {

    public void showMenu() {
        char again;
        do {
            printHeader("LEVEL 3 - OPTIMIZED");
            System.out.println("1. Leap Year (optimized)");
            System.out.println("2. Leap Year (single-if)");
            System.out.println("3. Marks & Grade");
            System.out.println("4. Prime check (sqrt)");
            System.out.println("5. Armstrong");
            System.out.println("6. Count digits");
            System.out.println("7. BMI");
            System.out.println("8. Harshad number");
            System.out.println("9. Abundant number (optimized)");
            System.out.println("10. Calculator (switch)");
            System.out.println("0. Exit Level3(opt)");
            System.out.print("Select: ");
            int opt = input.nextInt();
            switch(opt) {
                case 1: q1_leapYear(); break;
                case 2: q2_leapYearSingleIf(); break;
                case 3: q3_marksGrade(); break;
                case 4: q4_primeCheck(); break;
                case 5: q5_armstrong(); break;
                case 6: q6_countDigits(); break;
                case 7: q7_bmi(); break;
                case 8: q8_harshad(); break;
                case 9: q9_abundantOptimized(); break;
                case 10: q10_calculatorSwitch(); break;
                case 0: System.out.println("Exit Level3(opt)"); return;
                default: System.out.println("Invalid");
            }
            System.out.print("\nRun another Level3(opt) program? (Y/N): ");
            again = input.next().charAt(0);
        } while(again=='Y' || again=='y');
        printFooter();
    }

    // Leap year optimized (O(1))
    private void q1_leapYear() {
        System.out.print("Enter year (>=1582): ");
        int y = input.nextInt();
        if (y < 1582) { System.out.println("Out of Gregorian calendar range."); return;}
        boolean isLeap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        System.out.println(y + (isLeap ? " is a Leap Year" : " is not a Leap Year"));
    }

    private void q2_leapYearSingleIf() {
        System.out.print("Enter year (>=1582): ");
        int y = input.nextInt();
        boolean isLeap = (y >= 1582) && ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0));
        System.out.println(y + (isLeap ? " Leap Year" : " Not Leap"));
    }

    // Marks and grade
    private void q3_marksGrade() {
        System.out.print("Enter marks for Physics, Chemistry, Maths (0-100): ");
        double p = input.nextDouble(), c = input.nextDouble(), m = input.nextDouble();
        double percentage = (p + c + m) / 3.0;
        String grade; String remarks;
        if (percentage >= 90) { grade = "A"; remarks = "Excellent"; }
        else if (percentage >= 75) { grade = "B"; remarks = "Very Good"; }
        else if (percentage >= 60) { grade = "C"; remarks = "Good"; }
        else if (percentage >= 40) { grade = "D"; remarks = "Pass"; }
        else { grade = "F"; remarks = "Fail"; }
        System.out.printf("Percentage = %.2f, Grade = %s, Remarks = %s\n", percentage, grade, remarks);
    }

    // Prime optimized O(sqrt(n))
    private void q4_primeCheck() {
        System.out.print("Enter number (>1): ");
        int n = input.nextInt();
        if (n <= 1) { System.out.println("Not prime"); return; }
        if (n == 2) { System.out.println("Prime"); return; }
        if (n % 2 == 0) { System.out.println("Not prime"); return; }
        int limit = (int)Math.sqrt(n);
        for (int i=3;i<=limit;i+=2) { if (n % i == 0) { System.out.println("Not prime"); return; } }
        System.out.println("Prime");
    }

    // Armstrong optimized: compute k-digit power using fast pow (small k)
    private void q5_armstrong() {
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int original = n;
        int k = String.valueOf(Math.abs(n)).length(); // digits
        int sum = 0;
        while(n != 0) {
            int d = Math.abs(n % 10);
            sum += (int)Math.pow(d, k); // small k; pow is fine
            n /= 10;
        }
        System.out.println((sum == original) ? original + " is Armstrong" : original + " not Armstrong");
    }

    private void q6_countDigits() {
        System.out.print("Enter integer: ");
        long n = Math.abs(input.nextLong());
        int count = (n==0) ? 1 : 0;
        while (n != 0) { n /= 10; count++; }
        System.out.println("Digits count = " + count);
    }

    private void q7_bmi() {
        System.out.print("Enter weight(kg) and height(cm): ");
        double weight = input.nextDouble(), heightCm = input.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal weight";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obesity";
        System.out.printf("BMI = %.2f (%s)\n", bmi, status);
    }

    private void q8_harshad() {
        System.out.print("Enter number (>0): ");
        int n = input.nextInt();
        int sum = 0, tmp = n;
        while (tmp != 0) { sum += tmp % 10; tmp /= 10; }
        System.out.println((n % sum == 0) ? n + " is Harshad" : n + " not Harshad");
    }

    private void q9_abundantOptimized() {
        System.out.print("Enter number (>1): ");
        int n = input.nextInt();
        int sum = 1; // 1 is a divisor for n>1
        int limit = (int)Math.sqrt(n);
        for (int i=2;i<=limit;i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i) sum += other;
            }
        }
        // for n==1 handle separately
        if (n == 1) sum = 0;
        System.out.println((sum > n) ? "Abundant" : "Not Abundant (sum=" + sum + ")");
    }

    private void q10_calculatorSwitch() {
        System.out.print("Enter first second and op (+ - * /): ");
        double a = input.nextDouble(), b = input.nextDouble();
        String op = input.next();
        switch(op) {
            case "+": System.out.println("Result = " + (a+b)); break;
            case "-": System.out.println("Result = " + (a-b)); break;
            case "*": System.out.println("Result = " + (a*b)); break;
            case "/": 
                if (b == 0) System.out.println("Division by zero");
                else System.out.println("Result = " + (a/b));
                break;
            default: System.out.println("Invalid Operator");
        }
    }
}
