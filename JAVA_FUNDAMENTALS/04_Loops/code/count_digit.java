package Loops_3;
import java.util.Scanner;
public class count_digit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();
        int count = 0;

        while(n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
