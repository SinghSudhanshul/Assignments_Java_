class Level_pr2_std extends BaseProgram {

    public void showMenu() {
        char again;
        do {
            printHeader("LEVEL 2 - STANDARD");
            System.out.println("1. Odd/Even list (std)");
            System.out.println("2. Bonus (std)");
            System.out.println("3. Table 6..9 (std)");
            System.out.println("4. FizzBuzz (std)");
            System.out.println("5. FizzBuzz while (std)");
            System.out.println("6. Youngest/Tallest (std)");
            System.out.println("7. Factors (for)");
            System.out.println("8. Factors (while)");
            System.out.println("9. Greatest factor (for)");
            System.out.println("10. Greatest factor (while)");
            System.out.println("11. Multiples below 100 (for)");
            System.out.println("12. Power (for loop)");
            System.out.println("13. Multiples below 100 (while)");
            System.out.println("14. Power (while)");
            System.out.println("0. Exit Level2(std)");
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
                case 0: System.out.println("Exit Level2(std)"); return;
                default: System.out.println("Invalid");
            }
            System.out.print("\nRun another Level2(std) program? (Y/N): ");
            again = input.next().charAt(0);
        } while(again=='Y' || again=='y');
        printFooter();
    }

    private void std1() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        for (int i=1;i<=n;i++) {
            if (i%2==0) System.out.println(i + " Even");
            else System.out.println(i + " Odd");
        }
    }

    private void std2() {
        System.out.print("Enter salary and yrs: ");
        double s = input.nextDouble(); int yrs = input.nextInt();
        if (yrs > 5) System.out.println("Bonus = " + (s * 0.05));
        else System.out.println("No bonus");
    }

    private void std3() {
        System.out.print("Enter number: ");
        int n = input.nextInt();
        for (int i=6;i<=9;i++) System.out.println(n + " * " + i + " = " + (n*i));
    }

    private void std4() { q4_fizzbuzzFor(); }
    private void q4_fizzbuzzFor() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        for (int i=1;i<=n;i++) {
            if (i%15==0) System.out.println("FizzBuzz");
            else if (i%3==0) System.out.println("Fizz");
            else if (i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    private void std5() { System.out.println("Use q4 logic with while"); q4_fizzbuzzFor(); }

    private void std6() {
        System.out.println("Ages:");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        if (a <= b && a <= c) System.out.println("Amar youngest");
        else if (b <= a && b <= c) System.out.println("Akbar youngest");
        else System.out.println("Anthony youngest");
        System.out.println("Heights:");
        double ha = input.nextDouble(), hb = input.nextDouble(), hc = input.nextDouble();
        if (ha >= hb && ha >= hc) System.out.println("Amar tallest");
        else if (hb >= ha && hb >= hc) System.out.println("Akbar tallest");
        else System.out.println("Anthony tallest");
    }

    private void std7() { // factors using for
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Factors: ");
        for (int i=1;i<=n;i++) if (n%i==0) System.out.print(i + " ");
        System.out.println();
    }

    private void std8() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int i=1;
        System.out.print("Factors: ");
        while(i<=n) { if (n%i==0) System.out.print(i + " "); i++; }
        System.out.println();
    }

    private void std9() {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int greatest = 1;
        for (int i=n-1;i>=1;i--) { if (n%i==0) { greatest = i; break; } }
        System.out.println("Greatest proper factor = " + greatest);
    }

    private void std10() { std9(); }
    private void std11() {
        System.out.print("Enter number: ");
        int n = input.nextInt();
        System.out.print("Multiples below 100: ");
        for (int i=1;i<100;i++) if (i % n == 0) System.out.print(i + " ");
        System.out.println();
    }

    private void std12() {
        System.out.print("Enter base and exponent: ");
        int base = input.nextInt(), p = input.nextInt();
        long res = 1;
        for (int i=0;i<p;i++) res *= base;
        System.out.println("Result = " + res);
    }

    private void std13() { std11(); }
    private void std14() { std12(); }
}
