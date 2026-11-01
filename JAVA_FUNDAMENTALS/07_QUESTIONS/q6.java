package CLAUDE_50;
import java.util.Scanner;
public class q6 {
    public static int countDigits(int num) {
        int count = 0;
        if(num == 0) {
            return 1;
        }
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number of digits = " + countDigits(num));

    }
}

