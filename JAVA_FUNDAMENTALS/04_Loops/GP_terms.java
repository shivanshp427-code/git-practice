package Loops_3;
import java.util.Scanner;
public class GP_terms {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();
        int a = 1;int r = 2;

        for(int i = 1; i <= n; i++) {
            System.out.println(a);
            a *= r;
        }
    }
}
