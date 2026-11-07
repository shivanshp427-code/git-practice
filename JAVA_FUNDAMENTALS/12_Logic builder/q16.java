package CLAUDE_50;

import java.util.Scanner;

public class q16 {
    public static int gcd(int a, int b) {

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("GCD = " + gcd(a, b));

    }
}
