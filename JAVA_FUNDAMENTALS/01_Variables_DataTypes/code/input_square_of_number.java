package Basics_1;
import java.util.Scanner;
public class  input_square_of_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int s = sc.nextInt();
        int a = s * s;
        System.out.print("square is :");
        System.out.println(a);
    }
}
