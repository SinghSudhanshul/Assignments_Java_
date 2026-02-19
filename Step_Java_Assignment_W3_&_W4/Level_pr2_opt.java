class Level_pr2_opt extends BaseProgram {

    public void showMenu() {
        char again;
        do {
            printHeader("LEVEL 2 - OPTIMIZED");
            System.out.println("1. Print odd/even upto n");
            System.out.println("2. Employee bonus");
            System.out.println("3. Multiplication table (6..9)");
            System.out.println("4. FizzBuzz (for)");
            System.out.println("5. FizzBuzz (while)");
            System.out.println("6. Youngest and Tallest among 3");
            System.out.println("7. Factors (efficient)");
            System.out.println("8. Factors (while)");
            System.out.println("9. Greatest factor beside itself (efficient)");
            System.out.println("10. Greatest factor (while)");
            System.out.println("11. Multiples of a number below 100");
            System.out.println("12. Power (fast exponent)");
            System.out.println("13. Multiples below 100 (while)");
            System.out.println("14. Power (while)");
            System.out.println("0. Exit Level 2 (opt)");
            System.out.print("Select: ");
            int opt = input.nextInt();
            switch(opt) {
                case 1: q1_oddEven(); break;
                case 2: q2_bonus(); break;
                case 3: q3_multTable(); break;
                case 4: q4_fizzbuzzFor(); break;
                case 5: q5_fizzbuzzWhile(); break;
                case 6: q6_youngestTallest(); break;
                case 7: q7_factorsOptimized(); break;
                case 8: q8_factorsWhile(); break;
                case 9: q9_greatestFactorOptimized(); break;
                case 10: q10_greatestFactorWhile(); break;
                case 11: q11_multiplesBelow100(); break;
                case 12: q12_powerFast(); break;
                case 13: q13_multiplesBelow100While(); break;
                case 14: q14_powerWhile(); break;
                case 0: System.out.println("Exit Level2(opt)"); return;
                default: System.out.println("Invalid");
            }
            System.out.print("\nRun another Level2(opt) program? (Y/N): ");
            again = input.next().charAt(0);
        } while(again=='Y' || again=='y');
        printFooter();
    }

    private void q1_oddEven() {
        System.out.print("Enter n (>=1): ");
        int n = input.nextInt();
        for (int i=1;i<=n;i++) System.out.println(i + " is " + ((i%2==0)?"Even":"Odd"));
    }

    private void q2_bonus() {
        System.out.print("Enter salary and years of service: ");
        double salary = input.nextDouble();
        int yrs = input.nextInt();
        double bonus = (yrs > 5) ? salary * 0.05 : 0.0;
        System.out.println("Bonus = INR " + bonus);
    }

    private void q3_multTable() {
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for (int i=6;i<=9;i++) System.out.println(num + " * " + i + " = " + (num*i));
    }

    private void q4_fizzbuzzFor() {
        System.out.print("Enter positive n: ");
        int n = input.nextInt();
        for (int i=1;i<=n;i++) {
            boolean div3=i%3==0, div5=i%5==0;
            if (div3 && div5) System.out.println("FizzBuzz");
            else if (div3) System.out.println("Fizz");
            else if (div5) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    private void q5_fizzbuzzWhile() {
        System.out.print("Enter positive n: ");
        int n = input.nextInt();
        int i=1;
        while(i<=n) {
            boolean div3=i%3==0, div5=i%5==0;
            if (div3 && div5) System.out.println("FizzBuzz");
            else if (div3) System.out.println("Fizz");
            else if (div5) System.out.println("Buzz");
            else System.out.println(i);
            i++;
        }
    }

    private void q6_youngestTallest() {
        System.out.println("Enter ages of Amar Akbar Anthony:");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        System.out.println("Youngest age = " + Math.min(a, Math.min(b,c)));
        System.out.println("Now heights (Amar Akbar Anthony):");
        double ha = input.nextDouble(), hb = input.nextDouble(), hc = input.nextDouble();
        double tallest = Math.max(ha, Math.max(hb,hc));
        System.out.println("Tallest height = " + tallest);
    }

    // optimized: find factors by checking up to sqrt(n) and collecting pairs
    private void q7_factorsOptimized() {
        System.out.print("Enter number (>0): ");
        int n = input.nextInt();
        if (n <= 0) { System.out.println("Invalid"); return; }
        System.out.print("Factors: ");
        int limit = (int)Math.sqrt(n);
        for (int i=1;i<=limit;i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                int other = n / i;
                if (other != i) System.out.print(other + " ");
            }
        }
        System.out.println();
    }

    private void q8_factorsWhile() {
        System.out.print("Enter number (>0): ");
        int n = input.nextInt();
        if (n <= 0) { System.out.println("Invalid"); return; }
        int i = 1;
        System.out.print("Factors: ");
        while(i <= n) {
            if (n % i == 0) System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // optimized greatest factor (beside itself): check divisors up to sqrt, compute largest
    private void q9_greatestFactorOptimized() {
        System.out.print("Enter number (>1): ");
        int n = input.nextInt();
        if (n <= 1) { System.out.println("No proper factors"); return; }
        int greatest = 1;
        int limit = (int)Math.sqrt(n);
        for (int i=1;i<=limit;i++) {
            if (n % i == 0) {
                int j = n / i;
                if (i != n && i > greatest) greatest = i;
                if (j != n && j > greatest) greatest = j;
            }
        }
        System.out.println("Greatest proper factor = " + greatest);
    }

    private void q10_greatestFactorWhile() {
        System.out.print("Enter number (>1): ");
        int n = input.nextInt();
        int greatest = 1;
        int i = n - 1;
        while (i >= 1) {
            if (n % i == 0) { greatest = i; break; }
            i--;
        }
        System.out.println("Greatest proper factor = " + greatest);
    }

    private void q11_multiplesBelow100() {
        System.out.print("Enter number (>0): ");
        int n = input.nextInt();
        System.out.println("Multiples below 100:");
        for (int i = n; i < 100; i += n) {
            if (i > 0) System.out.print(i + " ");
            if (i == 0) break;
        }
        System.out.println();
    }

    private void q12_powerFast() {
        System.out.print("Enter base and exponent (non-negative): ");
        long base = input.nextLong(), exp = input.nextLong();
        System.out.println("Result = " + powFast(base, exp));
    }
    private long powFast(long base, long exp) {
        // binary exponentiation, O(log exp)
        long res = 1;
        long b = base;
        while (exp > 0) {
            if ((exp & 1) == 1) res *= b;
            b *= b;
            exp >>= 1;
        }
        return res;
    }

    private void q13_multiplesBelow100While() {
        System.out.print("Enter number (>0): ");
        int n = input.nextInt();
        int i = n;
        System.out.println("Multiples below 100:");
        while(i < 100 && i > 0) {
            System.out.print(i + " ");
            i += n;
        }
        System.out.println();
    }

    private void q14_powerWhile() {
        System.out.print("Enter base and exponent (non-negative): ");
        long base = input.nextLong(), exp = input.nextLong();
        long res = 1;
        for (long i=0;i<exp;i++) res *= base;
        System.out.println("Result = " + res);
    }
}