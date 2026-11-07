package Loops_3;
import java.util.Scanner;
public class reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n= sc.nextInt();
        int r = 0;

        while(n != 0) {
            r *= 10;
            r += (n % 10);
            n /= 10;
        }
        System.out.print("reverse of the number is :"+" "+r);



    }
}
