package CLAUDE_50;

import java.util.Scanner;

public class q23 {

    public static int reverse(int num) {
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        if (num == reverse(num)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (isPalindrome(i)) {
                if (count > 0) {

                    System.out.print(" ");
                }
                System.out.print(i);
                count++;
            }
        }
        System.out.println();
    }
}