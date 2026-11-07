package CLAUDE_50;
import java.util.Scanner;
public class q15 {
    public static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.print(" ");
            }
            System.out.print(a);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        printFibonacci(n);
    }
}
