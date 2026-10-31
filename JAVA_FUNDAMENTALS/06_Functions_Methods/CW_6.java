// BINOMIAL COEFFICIENT METHODS.
package TOPIC_8;
import java.util.Scanner;
public class CW_6 {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinCoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int BinCoff = fact_n / (fact_r * fact_nmr);
        return BinCoff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        System.out.print("enter r : ");
        int r = sc.nextInt();
        System.out.print(BinCoff(n, r));
    }
}
