package if_else_2;
import java.util.Scanner;
public class triangle_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st side: ");
        int a = sc.nextInt();
        System.out.print("enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("enter 3rd number: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Valid triangle");
        }
        else {
            System.out.println("Invalid triangle");
        }



    }
}
