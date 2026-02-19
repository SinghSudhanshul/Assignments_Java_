/**
 * Level 1 - Optimized implementations.
 * Each question is in its own method. Menu-driven using do-while.
 */
class Level_pr1_opt extends BaseProgram {

    public void showMenu() {
        char again;
        do {
            printHeader("LEVEL 1 - OPTIMIZED");
            System.out.println("1. Divisible by 5");
            System.out.println("2. Is first the smallest of three");
            System.out.println("3. Which is largest of three");
            System.out.println("4. Sum of n natural numbers (formula)");
            System.out.println("5. Can vote?");
            System.out.println("6. Positive/Negative/Zero");
            System.out.println("7. SpringSeason (date)");
            System.out.println("8. Countdown (while)");
            System.out.println("9. Countdown (for)");
            System.out.println("10. Sum until user enters 0");
            System.out.println("11. Sum until 0 or negative (break)");
            System.out.println("12. Sum n natural numbers (while vs formula)");
            System.out.println("13. Sum n natural numbers (for vs formula)");
            System.out.println("14. Factorial (iterative)");
            System.out.println("15. Factorial (for)");
            System.out.println("0. Exit Level 1 (opt)");
            System.out.print("Select: ");
            int opt = input.nextInt();

            switch(opt) {
                case 1: q1_divisibleBy5(); break;
                case 2: q2_firstIsSmallest(); break;
                case 3: q3_findLargest(); break;
                case 4: q4_sumNaturalFormula(); break;
                case 5: q5_canVote(); break;
                case 6: q6_posNegZero(); break;
                case 7: q7_springSeason(); break;
                case 8: q8_countdownWhile(); break;
                case 9: q9_countdownFor(); break;
                case 10: q10_sumUntilZero(); break;
                case 11: q11_sumUntilZeroOrNeg(); break;
                case 12: q12_sumNaturalWhileVsFormula(); break;
                case 13: q13_sumNaturalForVsFormula(); break;
                case 14: q14_factorialIterative(); break;
                case 15: q15_factorialFor(); break;
                case 0: System.out.println("Exit Level 1 (opt)"); return;
                default: System.out.println("Invalid.");
            }

            System.out.print("\nRun another Level1(opt) program? (Y/N): ");
            again = input.next().charAt(0);
        } while(again == 'Y' || again == 'y');

        printFooter();
    }

    // Q1 O(1)
    private void q1_divisibleBy5() {
        System.out.print("Enter number: ");
        long n = input.nextLong();
        System.out.println("Is the number " + n + " divisible by 5? " + (n % 5 == 0));
    }

    // Q2 O(1)
    private void q2_firstIsSmallest() {
        System.out.print("Enter three numbers: ");
        long a = input.nextLong(), b = input.nextLong(), c = input.nextLong();
        boolean firstIsSmallest = (a < b && a < c);
        System.out.println("Is the first number the smallest? " + firstIsSmallest);
    }

    // Q3 O(1)
    private void q3_findLargest() {
        System.out.print("Enter three numbers: ");
        long a = input.nextLong(), b = input.nextLong(), c = input.nextLong();
        System.out.println("Is first largest? " + (a >= b && a >= c));
        System.out.println("Is second largest? " + (b >= a && b >= c));
        System.out.println("Is third largest? " + (c >= a && c >= b));
    }

    // Q4 O(1) formula
    private void q4_sumNaturalFormula() {
        System.out.print("Enter n: ");
        long n = input.nextLong();
        if (n >= 1) {
            long sum = n * (n + 1) / 2;
            System.out.println("Sum of first " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }

    // Q5 O(1)
    private void q5_canVote() {
        System.out.print("Enter age: ");
        int age = input.nextInt();
        if (age >= 18) System.out.println("Age " + age + " can vote.");
        else System.out.println("Age " + age + " cannot vote.");
    }

    // Q6 O(1)
    private void q6_posNegZero() {
        System.out.print("Enter number: ");
        long n = input.nextLong();
        if (n > 0) System.out.println("Positive");
        else if (n < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    // Q7 check date in range [Mar20, Jun20] O(1)
    private void q7_springSeason() {
        System.out.print("Enter month (1-12) and day: ");
        int m = input.nextInt(), d = input.nextInt();
        // convert to day-of-year comparator: simple mapping for months (non-leap)
        int doy = monthDayToDayOfYear(m, d);
        int start = monthDayToDayOfYear(3, 20);
        int end = monthDayToDayOfYear(6, 20);
        System.out.println((doy >= start && doy <= end) ? "It's a Spring Season" : "Not a Spring Season");
    }
    private int monthDayToDayOfYear(int m, int d) {
        int[] mdays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int day = d;
        for (int i=1;i<m;i++) day += mdays[i];
        return day;
    }

    // Q8 while countdown O(n)
    private void q8_countdownWhile() {
        System.out.print("Enter start (>=1): ");
        int cnt = input.nextInt();
        while(cnt >= 1) {
            System.out.println(cnt--);
        }
        System.out.println("Lift off!");
    }

    // Q9 for countdown O(n)
    private void q9_countdownFor() {
        System.out.print("Enter start (>=1): ");
        int cnt = input.nextInt();
        for (int i = cnt; i >= 1; i--) System.out.println(i);
        System.out.println("Lift off!");
    }

    // Q10 sum until 0
    private void q10_sumUntilZero() {
        System.out.println("Enter numbers (0 to stop):");
        double total = 0.0;
        while(true) {
            double v = input.nextDouble();
            if (v == 0.0) break;
            total += v;
        }
        System.out.println("Total = " + total);
    }

    // Q11 sum until 0 or negative using break
    private void q11_sumUntilZeroOrNeg() {
        System.out.println("Enter numbers (0 or negative to stop):");
        double total = 0.0;
        while(true) {
            double v = input.nextDouble();
            if (v <= 0.0) break;
            total += v;
        }
        System.out.println("Total = " + total);
    }

    // Q12 compute via while and formula and compare (while O(n))
    private void q12_sumNaturalWhileVsFormula() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        if (n < 1) { System.out.println("Not a natural number"); return; }
        int sum = 0;
        int i = 1;
        while(i <= n) { sum += i; i++; }
        int formula = n * (n + 1) / 2;
        System.out.println("While sum = " + sum + " | Formula = " + formula + " | Equal? " + (sum == formula));
    }

    // Q13 using for
    private void q13_sumNaturalForVsFormula() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        if (n < 1) { System.out.println("Not a natural number"); return; }
        int sum = 0;
        for (int i=1;i<=n;i++) sum += i;
        int formula = n * (n + 1) / 2;
        System.out.println("For sum = " + sum + " | Formula = " + formula + " | Equal? " + (sum == formula));
    }

    // Q14 factorial iterative O(n) time, O(1) space
    private void q14_factorialIterative() {
        System.out.print("Enter n (>=0): ");
        int n = input.nextInt();
        if (n < 0) { System.out.println("Negative number."); return; }
        long res = 1;
        for (int i=2;i<=n;i++) res *= i;
        System.out.println(n + "! = " + res);
    }

    // Q15 factorial using for (same as iterative) - kept for completeness
    private void q15_factorialFor() {
        q14_factorialIterative();
    }
}
