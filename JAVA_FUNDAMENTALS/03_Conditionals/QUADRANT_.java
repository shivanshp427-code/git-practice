package if_else_2;
import java.util.Scanner;
public class QUADRANT_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int x = sc.nextInt();
        System.out.print("Enter second number :");
        int y = sc.nextInt();

        if(x == 0 && y == 0) {
            System.out.println("lies on origin");
        }
        else if(x > 0 && y > 0) {
            System.out.println("lies in 1st quadrant");
        }
        else if(x < 0 && y > 0) {
            System.out.println("lies in 2nd quadrant");
        }
        else if(x < 0 && y < 0) {
            System.out.println("lies in 3rd quadrant");
        }
        else if(x > 0 && y < 0) {
            System.out.println("lies in 4th quadrant");
        }
        else if(x != 0 && y == 0) {
            System.out.println("lies on x-axis");
        }
        else if(x == 0 && y != 0) {
            System.out.println("lies on y-axis");
        }
    }
}
