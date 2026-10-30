package Loops_3;
import java.util.Scanner;
public class n_terms_AP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();
        int a = 2;
        int d = 3;

        for(int i = 1; i <=n; i++) {
            System.out.println(a);
            a+=d;
        }
    }
}

