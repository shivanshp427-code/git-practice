package CLAUDE_50;

import java.util.Scanner;

public class q17 {
    public static boolean isPerfect(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }


        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (isPerfect(num) == true) {
            System.out.println("is a perfect number");
        } else {
            System.out.println("is not a perfect number");
        }
    }
}
