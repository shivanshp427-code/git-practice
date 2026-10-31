package TOPIC_8;
import java.util.Scanner;
public class HW_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input an integer : ");
        int digits = sc.nextInt();
        System.out.println(sumDigits(digits));
    }
    public static int sumDigits(int n ) {
        int sumOfDigits = 0;
        while(n > 0) {
            int lastDigits = n % 10;
            sumOfDigits = sumOfDigits + lastDigits;
            n = n / 10;
        }
        return sumOfDigits;
    }
}
