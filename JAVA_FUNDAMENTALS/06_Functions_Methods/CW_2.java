// SUM OF TWO NUMBERS USING FUNCTION CALL.
package TOPIC_8;
import java.util.Scanner;
public class CW_2 {
    public static int calculateSum(int num1, int num2) { // formal parameters

        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no1 : ");
        int a = sc.nextInt();
        System.out.print("no2 : ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // arguments
        System.out.print("sum is : "+ sum);
    }
}
