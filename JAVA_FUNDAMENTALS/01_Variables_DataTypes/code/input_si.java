package Basics_1;
import java.util.Scanner;
public class input_si {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter p :");
        double p = sc.nextDouble();
        System.out.print("enter r :");
        double r = sc.nextDouble();
        System.out.print("enter t :");
        double t = sc.nextDouble();

        double si = p * r * t / 100;
        System.out.print("total percentage is :");
        System.out.print(si);

        sc.close();
    }
}
