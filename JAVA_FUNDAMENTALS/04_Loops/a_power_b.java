package Loops_3;
import java.util.Scanner;
public class a_power_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int a = sc.nextInt();
        System.out.print("enter power :");
        int b = sc.nextInt();
        int power = 1;
        for(int i = 1;i <= b;i++) {
            power = power * a;

        }
        System.out.println("value of the number is :" +" "+power);
    }
}
