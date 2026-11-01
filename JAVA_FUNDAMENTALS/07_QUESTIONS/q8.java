package CLAUDE_50;
import java.util.Scanner;
public class q8 {
    public static int reverse(int num) {
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int num) {
        if(num == reverse(num)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num+" is a palindrome");
        } else {
            System.out.println(num+" is not a palindrome");

        }
    }
}
