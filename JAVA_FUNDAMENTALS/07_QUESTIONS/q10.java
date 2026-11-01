package CLAUDE_50;
import java.util.Scanner;
public class q10 {
    public static int countDigits(int num) {
        if(num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int p = countDigits(num);
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, p);
            num = num / 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num+" is an Armstrong number");
        } else {
            System.out.println(num+" is not an Armstrong number");
        }
    }
}
