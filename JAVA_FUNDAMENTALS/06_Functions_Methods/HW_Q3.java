package TOPIC_8;
import java.util.Scanner;
public class HW_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int palindrome = sc.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println(palindrome + "a p");
        } else {
            System.out.println(palindrome + "not a p");
        }
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if(number == reverse) {
            return true;
        }
        return false;
    }
}
