// FUNCTION OVERLOADING USING PARAMETERS.
package TOPIC_8;
import java.util.Scanner;
public class CW_7 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {

        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(4, 5));
        System.out.println(sum(3, 7, 15));
    }
}
