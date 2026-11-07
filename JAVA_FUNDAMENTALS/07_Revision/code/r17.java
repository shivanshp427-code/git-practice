package REV_JAVA;
import java.util.Scanner;
public class r8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x : ");
        int x = sc.nextInt();
        System.out.print("enter y : ");
        int y = sc.nextInt();
        System.out.print("enter z : ");
        int z = sc.nextInt();

        if(x + y < z || (x < y && y == z)) {
            System.out.println("system pass");

        }
        else {
            System.out.println("system fail");
        }

    }
}
