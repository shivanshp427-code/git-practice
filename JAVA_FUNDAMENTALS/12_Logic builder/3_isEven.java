package CLAUDE_50;

import java.util.Scanner;

public class q4 {

    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
                if (isEven(i)) {
                    System.out.println(i);
                    count++;
                }
        }

        System.out.println("Count = " + count);
    }


}



