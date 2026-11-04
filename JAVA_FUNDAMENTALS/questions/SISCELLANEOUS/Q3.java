// DIGITAL SAND-GLASS MATRIX.
package SISCELLANEOUS;
import java.util.Scanner;
public class Q3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter number : ");
            int n = sc.nextInt();

            // 1st HALF: Tapering Downwards
            for (int i = 1; i <= n; i++) {
                // 1. Leading Outer Spaces
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
                // 2. Left Star Block
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
                // 3. Right Star Block (Combined to make it solid)
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // 2nd HALF: Expanding Downwards (Dynamic Parity Guard)
            for (int i = n; i >= 1; i--) {
                // 1. Leading Outer Spaces
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
                // 2. Left Star Block
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
                // 3. Right Star Block
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


