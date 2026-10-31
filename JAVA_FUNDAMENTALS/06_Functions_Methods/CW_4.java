// PRODUCT OF TWO USING FUNCTION CALL.
package TOPIC_8;
import java.util.Scanner;
public class CW_4 {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = sc.nextInt();
        System.out.print("enter b : ");
        int b = sc.nextInt();

        int product = multiply(a, b);
        System.out.println("product = "+product);

        product = multiply(10, 30);
        System.out.println("product = "+product);

    }
}
