package Loops_3;
import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            n = -n;
        }


        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }

        System.out.print("Sum of digits: " + sum);
    }
}
