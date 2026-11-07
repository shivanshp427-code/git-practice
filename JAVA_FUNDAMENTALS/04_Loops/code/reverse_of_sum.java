package Loops_3;
import java.util.Scanner;
public class reverse_of_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();

        if (n < 0) {
            n = -n;
        }

        int sum = 0;

        while (n != 0) {
            sum += (n % 10);
            n = n / 10;
        }

        System.out.println("Sum of digits: " + sum);

        int r = 0;

        while (sum != 0) {
            r = (r * 10) + (sum % 10);
            sum = sum / 10;
        }

        System.out.println("Reverse of the sum is: " +r);
        sc.close();
    }
}
