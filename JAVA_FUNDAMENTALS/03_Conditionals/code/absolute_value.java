package if_else_2;
import java.util.Scanner;
public class absolute_value {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        if (n < 0) {
           n = -n;
        }
        System.out.println(n);
    }
    }





