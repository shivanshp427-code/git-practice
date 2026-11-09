// HOLLOW RECTANGLE PATTERN.
package ZISCELLANEOUS_PATTERNS;
import java.util.Scanner;
public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows :");
        int n = sc.nextInt();
        System.out.print("enter columns :");
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == 1 || i == n || j == 1 || j == m)
                    System.out.print("* ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }

    }
}
