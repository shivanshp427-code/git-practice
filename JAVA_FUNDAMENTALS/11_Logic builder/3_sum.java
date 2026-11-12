package CLAUDE_50;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("Sum = "+sum);
    }
}
