package CLAUDE_50;
import java.util.Scanner;
public class q5 {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            //sum = sum + digit;
                sum++;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits = " + sumOfDigits(num));

    }
}
