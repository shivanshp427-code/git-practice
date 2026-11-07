package Basics_1;
import java.util.Scanner;
public class input_radius {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter radius : ");

        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.print("area is : ");
        System.out.println(a);

        sc.close();
    }
}
