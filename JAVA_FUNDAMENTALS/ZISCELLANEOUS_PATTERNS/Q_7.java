// HOLLOW STAR DIAMOND.
package ZISCELLANEOUS_PATTERNS;
import java.util.Scanner;
public class Q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();

        for(int i = 1; i <= 2 * n - 1; i++){
            for(int j = 1; j <= 2 * n - 1; j++) {
                if (i + j == n + 1 || Math.abs(i - j) == n - 1 || i + j == 3 * n - 1  ) {
                    System.out.print("*" + " ");
                }

                else{
                    System.out.print(" "+" ");
                }

            }
            System.out.println();
        }

    }

}
