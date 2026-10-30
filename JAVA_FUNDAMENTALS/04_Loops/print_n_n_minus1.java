package Loops_3;
import java.util.Scanner;
public class print_n_n_minus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            System.out.println(n - i + 1);
        }
    }
}
