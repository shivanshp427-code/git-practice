package if_else_2;
import java.util.Scanner;
public class Big_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number :");
        int a = sc.nextInt();
        System.out.print("enter 2nd number :");
        int b = sc.nextInt();
        System.out.print("enter 3rd number :");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        }


        else if(b >= c) {
                System.out.println(b);
            }
        else {
                System.out.println(c);

            }

        }
    }
