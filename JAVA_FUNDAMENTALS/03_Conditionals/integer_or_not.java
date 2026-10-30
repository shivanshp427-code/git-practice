package if_else_2;
import java.util.Scanner;
public class integer_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n - x == 0) {
            System.out.println("it is  an integer: ");
        }
            else {
                System.out.println("not an integer");
            }

    }
}
