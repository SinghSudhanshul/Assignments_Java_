class Level_pr1_std extends BaseProgram {

    public void showMenu() {
        char again;
        do {
            printHeader("LEVEL 1 - STANDARD");
            System.out.println("1. Divisible by 5 (std)");
            System.out.println("2. Is first smallest (std)");
            System.out.println("3. Largest of three (std)");
            System.out.println("4. Sum n natural (loop)");
            System.out.println("5. Voting (std)");
            System.out.println("6. Pos/Neg/Zero (std)");
            System.out.println("7. SpringSeason (std)");
            System.out.println("8. Countdown (while)");
            System.out.println("9. Countdown (for)");
            System.out.println("10. Sum until 0 (std)");
            System.out.println("11. Sum until <=0 with break (std)");
            System.out.println("12. Sum n natural with while");
            System.out.println("13. Sum n natural with for");
            System.out.println("14. Factorial (recursive)");
            System.out.println("15. Factorial (for)");
            System.out.println("0. Exit Level 1 (std)");
            System.out.print("Select: ");
            int opt = input.nextInt();
            switch(opt) {
                case 1: std1(); break;
                case 2: std2(); break;
                case 3: std3(); break;
                case 4: std4(); break;
                case 5: std5(); break;
                case 6: std6(); break;
                case 7: std7(); break;
                case 8: std8(); break;
                case 9: std9(); break;
                case 10: std10(); break;
                case 11: std11(); break;
                case 12: std12(); break;
                case 13: std13(); break;
                case 14: std14(); break;
                case 15: std15(); break;
                case 0: System.out.println("Exit Level1(std)"); return;
                default: System.out.println("Invalid.");
            }
            System.out.print("\nRun another Level1(std) program? (Y/N): ");
            again = input.next().charAt(0);
        } while(again == 'Y' || again == 'y');
        printFooter();
    }

    private void std1() {
        System.out.print("Enter number: ");
        int n = input.nextInt();
        // usual method: show steps (modulus)
        int r = n % 5;
        System.out.println("Remainder when divided by 5 is " + r + ". Divisible? " + (r==0));
    }

    private void std2() {
        System.out.print("Enter three numbers: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        boolean isSmallest = true;
        if (a >= b || a >= c) isSmallest = false;
        System.out.println("First is smallest? " + isSmallest);
    }

    private void std3() {
        System.out.print("Enter three numbers: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        if (a >= b && a >= c) System.out.println("First is largest");
        if (b >= a && b >= c) System.out.println("Second is largest");
        if (c >= a && c >= b) System.out.println("Third is largest");
    }

    private void std4() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        if (n < 1) { System.out.println("Not natural"); return; }
        int sum = 0;
        int i = 1;
        while(i <= n) { sum += i; i++; }
        System.out.println("Sum via loop = " + sum);
    }

    private void std5() {
        System.out.print("Enter age: ");
        int age = input.nextInt();
        if (age >= 18) System.out.println("Can vote");
        else System.out.println("Cannot vote");
    }

    private void std6() { q6_common(); }
    private void q6_common() {
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if (n > 0) System.out.println("Positive");
        else if (n < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    private void std7() {
        System.out.print("Enter month and day: ");
        int m = input.nextInt(), d = input.nextInt();
        // standard: nested if logic on months and days
        boolean isSpring = false;
        if (m == 3) isSpring = (d >= 20);
        else if (m > 3 && m < 6) isSpring = true;
        else if (m == 6) isSpring = (d <= 20);
        System.out.println(isSpring ? "Its Spring Season" : "Not a Spring Season");
    }

    private void std8() { q8_countdownWhile(); }
    private void std9() { q9_countdownFor(); }

    private void std10() { q10_sumUntilZero(); }
    private void std11() { q11_sumUntilZeroOrNeg(); }

    private void std12() { std4(); }
    private void std13() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        if (n < 1) { System.out.println("Not natural"); return; }
        int sum = 0;
        for (int i=1;i<=n;i++) sum += i;
        System.out.println("Sum via for = " + sum);
    }

    private void std14() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        if (n < 0) { System.out.println("Negative not allowed"); return; }
        long res = factorialRec(n);
        System.out.println(n + "! = " + res);
    }
    private long factorialRec(int n) { return (n <= 1) ? 1 : n * factorialRec(n-1); }

    private void std15() { q14_factorialIterativeStd(); }
    private void q14_factorialIterativeStd() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        if (n < 0) { System.out.println("Negative not allowed"); return; }
        long res = 1;
        for (int i=2;i<=n;i++) res *= i;
        System.out.println(n + "! = " + res);
    }
}
