package REV_JAVA;
import java.util.Scanner;
public class r21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();


        for(int i = 1; i <= n; i++) {
            int val = 1;
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {

                if(j == 1 || j == i || i == n) {

                    System.out.print(val + " ");

                }

                else {
                    System.out.print("  ");
                }
                val = (val * (i - j)) / j;
            }
            System.out.println();
        }

    }
}
