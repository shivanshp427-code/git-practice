// INNER DIAMOND MATRIX.
package SISCELLANEOUS;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();

        // 1st HALF;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // 2nd HALF;
        for(int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= n - i +1; j++) {
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}


